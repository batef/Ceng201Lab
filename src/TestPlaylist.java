public class TestPlaylist {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();

        playlist.addSong("Zamansızlık");
        playlist.addSong("Blinding Lights");
        playlist.addSong("After Dark");
        playlist.addSong("Dark");

        playlist.showPlaylist();
        System.out.println();

        playlist.nextSong();
        playlist.nextSong();
        playlist.previousSong();
        playlist.showPlaylist();
    }
}
