
import java.util.Arrays;
import java.util.Scanner;

public class SortedSquares {
    public int[] sortedSquares(int[] nums){
        int[] res = new int[nums.length];

        int i=0, j=nums.length-1, k=nums.length-1;

        while(i<=j){
            if(Math.abs(nums[i]) > Math.abs(nums[j])){
                res[k]=nums[i]*nums[i];
                i=i+1;
            }else{
                res[k]=nums[j] * nums[j];
                j=j-1;
            }
            k=k-1;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter elements (sorted order):");
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }

        SortedSquares ss = new SortedSquares();
        int[] result = ss.sortedSquares(nums);
        System.out.println("Sorted Squares: " + Arrays.toString(result));
        sc.close();
    }
    
}
