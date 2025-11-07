package QueueExercise;

public class Queue {
    Node front;
    Node rear;
    int size;
    public Queue() {
        front = rear = null;
        size = 0;
    }
    void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            rear = newNode;
            front = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;

    }
    int dequeue() {
        if (front == null) {
            return -1;
        }
        int val = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return val;
    }

    boolean areEqual(Queue q1 , Queue q2) {
        if (q1.size != q2.size) {
            return false;
        }
        Node curr1 = q1.front;
        Node curr2 = q2.front;

        while (curr1 != null && curr2 != null) {
            if (curr1.data != curr2.data) {
                return false;
            }
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        return true;
    }
    void display() {
        Node current = front;
        System.out.print("Queue , Size: "+ size + "):");
        if (current == null) {
            System.out.println("[EMPTY]");
            return;
        }
        while (current != null) {
            System.out.print(current.data + " ");
            if (current == front) {
                System.out.print("[Front]");

            }
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();

    }
}
