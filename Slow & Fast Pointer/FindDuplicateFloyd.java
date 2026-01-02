public class FindDuplicateFloyd {

    public static int findDuplicate(int[] nums) {
        int slow = 0, fast = 0;

        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        int n1 = 0;
        int n2 = slow;

        while (n1 != n2) {
            n1 = nums[n1];
            n2 = nums[n2];
        }
        return n1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};
        System.out.println("Duplicate: " + findDuplicate(nums));
    }
}
