package day9;


public class ReverseLinkedList {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static Node reverseIterative(Node head) {
        Node prev = null;
        Node curr = head;

        while(curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public static Node reverseRecursive(Node head) {
        if (head.next == null || head == null) {
            return head;
        }

        Node reversedList = reverseRecursive(head.next);

        head.next.next = head;
        head.next = null;
        
        return reversedList;


    }

    public static void print(Node head) {
        while(head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head = reverseRecursive(head);
        print(head);
    }
}
