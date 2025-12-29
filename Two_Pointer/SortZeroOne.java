
import java.util.Arrays;

public class SortZeroOne {
    public static void sortZeroOne(int[] nums){
        int i=0, j =nums.length-1;

        while(i<j){
            if(nums[i] == 0){
                i++;
            }else if(nums[j] == 1){
                j--;

            }else{
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                i++;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,0,1,0,0,1};
        System.out.println("Before: " + Arrays.toString(nums));
        sortZeroOne(nums);
        System.out.println("After:  " + Arrays.toString(nums));
    }
}
