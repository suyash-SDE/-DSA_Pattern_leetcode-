
import java.util.*;

public class SortColors {
    public void sortColors(int[] nums){
        int i=0, j=nums.length-1,k=0;

        while(k <= j){
            if(nums[k] == 1){
                k++;
            }else if(nums[k]==2){
                int temp = nums[j];
                nums[j] = nums[k];
                nums[k]=temp;
                k--;
            }else{ // nums[k] ==0
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
                i++;
                k++;
            }
        }
    }
    public static void main(String[] args){
        SortColors sc = new SortColors();
        int[] nums = {2,0,2,1,1,0};
        sc.sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}
