import java.util.*;

class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        for (int f = 0; f < nums.length; f++) {
            if (nums[f] > 0) break;
            if (f > 0 && nums[f] == nums[f - 1]) continue;

            int i = f + 1, j = nums.length - 1;
            while (i < j) {
                int sum = nums[f] + nums[i] + nums[j];
                if (sum == 0) {
                    res.add(Arrays.asList(nums[f], nums[i], nums[j]));
                    i++;
                    j--;
                    while (i < j && nums[i] == nums[i - 1]) i++;
                    while (i < j && nums[j] == nums[j + 1]) j--;
                } else if (sum < 0) i++;
                else j--;
            }
        }
        return res;
    }
     public static void main(String[] args) {
        ThreeSum ts = new ThreeSum();
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(ts.threeSum(nums));
    }
}
    
