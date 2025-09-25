package DSA;

public class LinkedList {
    Node head;
    Node tail;
    int size;

    void addLast(int val) {
        Node temp = new Node();
        temp.data = val;
        temp.next = null;
        if (size == 0) {
            head = tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
        size++;

    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data + " ->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int getSize() {
        return size;
    }

    public void removeFirst() {
        if (size == 0) {
            System.out.println("List is empty");
        } else if (size == 1) {
            head = tail = null;
            size = 0;
        } else {
            head = head.next;
            size--;
        }
    }

    public int getFirst() {
        if (size == 0) {
            System.out.println("List is Empty");
            return -1;
        } else {
            return head.data;
        }
    }

    public int getLast() {
        if (size == 0) {
            System.out.println("List is Empty");
            return -1;
        } else {
            return tail.data;
        }
    }

    public int getAt(int idx) {
        if (size == 0) {
            System.out.println("List is Empty");
            return -1;
        } else if (size < 0 || size >= idx) {
            System.out.println("Invalid Argument ");
            return -1;
        } else {
            Node temp = head;
            for (int i = 0; i < idx; i++) {
                temp = temp.next;
            }
            return temp.data;
        }
    }

    public void addFirst(int val) {
        Node temp = new Node();
        temp.data = val;
        temp.next = head;
        head = temp;
        if (size == 0) {
            tail = temp;
        }
        size++;
    }

    //    Add at Index in Linked List
    public void addAt(int idx, int val) {
        if (idx < 0 || idx > size) {
            System.out.println("Invalid Argument");
            return;
        }
        Node newNode = new Node();
        newNode.data = val;
        if (idx == 0) {
            if (size == 0) {
                head = tail = newNode;
            } else {
                newNode.next = head;
                head = newNode;
            }

        } else if (idx == size) {

            if (size == 0) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }

        } else {


            Node temp = head;
            for (int i = 0; i < idx - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;

        }
        size++;
    }

    static void main() {
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.display();
        System.out.printf("Size: " + list.getSize());
    }
}

class Node {
    int data;
    Node next;
}
