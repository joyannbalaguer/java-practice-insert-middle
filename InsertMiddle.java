public class InsertMiddle {
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;
    int size = 0;

    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void insertInMiddle(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            int mid = (size % 2 == 0) ? (size / 2) : ((size + 1) / 2);
            Node current = head;
            Node previous = null;
            for (int i = 0; i < mid; i++) {
                previous = current;
                current = current.next;
            }
            previous.next = newNode;
            newNode.next = current;
        }
        size++;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        InsertMiddle list = new InsertMiddle();
        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        System.out.println("Original List:");
        list.display();
        list.insertInMiddle(15);
        System.out.println("After inserting in middle:");
        list.display();
    }
}
