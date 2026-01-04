import java.util.ArrayList;
import java.util.List;

public class pairSumMethodOne {
    // Definition for singly-linked list
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    // Method-1: Using ArrayList
    public int pairSum(ListNode head) {

        List<Integer> list = new ArrayList<>();

        // Step 1: Store all node values in list
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        // Step 2: Two pointer approach
        int i = 0;
        int j = list.size() - 1;

        int max = Integer.MIN_VALUE;

        while (i < j) {
            int candidate = list.get(i) + list.get(j);
            max = Math.max(max, candidate);

            i++;
            j--;
        }

        return max;
    }

    // Main method to test
    public static void main(String[] args) {
        pairSumMethodOne sol = new pairSumMethodOne();

        // Create linked list: 1 -> 2 -> 3 -> 4
        ListNode head = new ListNode(1,
                            new ListNode(2,
                            new ListNode(3,
                            new ListNode(4))));

        int result = sol.pairSum(head);
        System.out.println("Maximum Twin Sum: " + result);
    }
}
