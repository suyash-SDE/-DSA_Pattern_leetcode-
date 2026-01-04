public class pairSumMethodtwo {
    // Definition for singly-linked list.
    static class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    // Method to reverse linked list
    public ListNode reverseLL(ListNode node) {
        ListNode prev = null;
        ListNode curr = node;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    // Pair Sum logic
    public int pairSum(ListNode head) {

        // Step 1: Find middle using slow & fast pointer
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse second half
        ListNode p2 = reverseLL(slow);
        ListNode p1 = head;

        // Step 3: Calculate max twin sum
        int max = Integer.MIN_VALUE;

        while (p1 != null && p2 != null) {
            int candidate = p1.val + p2.val;
            max = Math.max(max, candidate);

            p1 = p1.next;
            p2 = p2.next;
        }

        return max;
    }

    // Main method for testing
    public static void main(String[] args) {
        pairSumMethodtwo sol = new pairSumMethodtwo();

        // Create linked list: 1 -> 2 -> 3 -> 4
        ListNode head = new ListNode(1,
                            new ListNode(2,
                            new ListNode(3,
                            new ListNode(4))));

        int result = sol.pairSum(head);
        System.out.println("Maximum Twin Sum: " + result);
    }
}
