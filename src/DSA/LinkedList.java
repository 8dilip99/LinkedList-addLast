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
    void display(){
        Node temp= head;
        while    (temp!=null){
            System.out.println(temp.data+ " ->");
            temp= temp.next;
        }
        System.out.println("null");
    }

    public int getSize() {
        return size;
    }

    static void main() {
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.display();
        System.out.printf("Size: "+list.getSize());
    }
}

class Node {
    int data;
    Node next;
}
