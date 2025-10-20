public class Playlist {
    Song tail;
    Song head;
    Song current;

    public void addSong(String title) {
        Song newSong = new Song(title);

        if (head == null) {
            head = newSong;
            tail = newSong;
            current = head;
        }else  {
            tail.next = newSong;
            newSong.prev = tail;
            tail = tail.next;
        }
    }

    public void nextSong() {
        if(current != null && current.next != null) {
            current = current.next;
            System.out.println("Now playing: " + current.title);
        } else  {
            System.out.println("You are at the last song");
        }
    }

    public void previousSong() {
        if(current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Now playing: " + current.title);
        } else {
            System.out.println("You are at the first song");
        }
    }

    public void showPlaylist() {
        if (head == null) {
            System.out.println("Playlist is empty");
            return;
        }

        Song temp = head;
        System.out.println("Playlist:");

        while (temp != null) {
            if (temp == current) {
                System.out.println("->" + temp.title + "(currently playing)");
            } else {
                System.out.println(temp.title);
            }
            temp = temp.next;
        }
    }
}
