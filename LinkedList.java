class LinkedList {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head; // head pointer

    // Insert at end
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Insert at beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }

    // Delete a node
    public void delete(int key) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        // delete head node
        if (head.data == key) {
            head = head.next;
            return;
        }

        Node temp = head;

        while (temp.next != null && temp.next.data != key) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Value not found!");
            return;
        }

        temp.next = temp.next.next; // delete the node
    }

    // Search
    public boolean search(int key) {
        Node temp = head;

        while (temp != null) {
            if (temp.data == key) {
                return true;
            }
            temp = temp.next;
        }

        return false;
    }

    // Display the list
    public void display() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // MAIN
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insertAtBeginning(5);

        System.out.println("Linked List:");
        list.display();

        System.out.println("Searching 20: " + list.search(20));
        System.out.println("Searching 100: " + list.search(100));

        System.out.println("Deleting 20...");
        list.delete(20);

        list.display();
    }
}
