package day10;

public class AddTwoNumbers {

    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    public static Node addTwoNumbers(Node l1, Node l2) {
        Node dummy = new Node(0);
        Node tail = dummy;
        int carry = 0;

        while(l1 != null || l2 != null || carry != 0) {
            int x = (l1 != null) ? l1.data : 0;
            int y = (l2 != null) ? l2.data : 0;
            int sum = x + y + carry;

            carry = sum / 10;
            int digit = sum % 10;
            tail.next = new Node(digit);
            tail = tail.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if(l2 != null) {
                l2 = l2.next;
            }
        }
        return dummy.next;
    }

    public static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(4);
        head.next = new Node(5);
        head.next.next = new Node(3);

        Node head2 = new Node(6);
        head2.next = new Node(1);
        head2.next.next = new Node(3);
        Node res = addTwoNumbers(head, head2);
        print(res);
    }
}
