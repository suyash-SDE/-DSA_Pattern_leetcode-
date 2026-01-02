public class SplitCircularLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static class Pair {
        Node first, second;

        Pair(Node first, Node second) {
            this.first = first;
            this.second = second;
        }
    }

    public static Pair splitList(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != head && fast.next != head) {
            slow = slow.next;
            fast = fast.next;

            if (fast.next != head) {
                fast = fast.next;
            }
        }

        Node head1 = head;
        Node head2 = slow.next;

        slow.next = head1;
        fast.next = head2;

        return new Pair(head1, head2);
    }

    public static void printList(Node head) {
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = head; // circular

        Pair result = splitList(head);

        System.out.print("First Half: ");
        printList(result.first);

        System.out.print("Second Half: ");
        printList(result.second);
    }
}
