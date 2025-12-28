import java.util.*;

class CountPairs {

    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);

        int i = 0, j = nums.size() - 1;
        int count = 0;

        while (i < j) {
            if (nums.get(i) + nums.get(j) < target) {
                count += (j - i);
                i++;
            } else {
                j--;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        CountPairs cp = new CountPairs();
        List<Integer> nums = Arrays.asList(1, 2, 3, 4);

        System.out.println(cp.countPairs(nums, 6));
    }
}
