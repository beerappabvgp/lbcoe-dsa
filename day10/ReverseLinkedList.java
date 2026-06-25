package day10;

public class ReverseLinkedList {

    static class Node {
        Node prev;
        Node next;
        int data;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node reverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node current = head;
        Node temp = null;

        while (current != null) {
            // reversing
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev; 
        }
        System.out.println(temp.next.data);
        System.out.println(temp.data);
        System.out.println(temp.prev.data);
        return temp.prev;
    }

    public static void printForward(Node head) {
        System.out.println("Forward : ");
        while(head != null) {
            System.out.print(head.data + " <-> ");
            head = head.next;
        }

        System.out.println("null");
    }

    public static void printBackward(Node head) {
        if (head == null) {
            return;
        }

        while(head.next != null) {
            head = head.next;
        }

        System.out.println("Backward: ");

        while(head != null) {
            System.out.print(head.data + " <-> ");
            head = head.prev;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        head.next = second;
        second.prev = head;
        second.next = third;

        third.prev = second;
        third.next = fourth;

        fourth.prev = third;
        fourth.next = fifth;

        fifth.prev = fourth;

        // printForward(head);
        // printBackward(head);

        head = reverse(head);
        printForward(head);
        // printBackward(head);
    }
}
