//Searching
//given an array of number and a target value x.check if x exists 
//in array or not ?? return index of x if it exits else return -1;
// [9,31,10,12,-1,6,8,13,2] x=15

// brute force

// for(int i=0;i<n;i++){
//     if(arr[i]==x){
//         return i;
//     }
// }
// return -1;

// search space -> collection of data where searching is expected to be done 
// it doesn't always need to be array
// when we started looking for x,size of search space was n
// n->n-1->n-2->n-3............,1->0 worst case when element is not present
// we are linearly reduce the search space size in every iteration
// i.e. why this brute force is called as linear search 


// if some how search space posses a few particular properties them we can optimise the solution
// divide the space in 2 halves considering that both halves are different from each other on some properties
// n->n/2->n/4------1
// n/2^0->n/2^1->n/2^2->n/2^3->n/2^k-1->
// total iteration->k
// n/2^k-1=>1->n=2^k-1 (log both side )

// k=1+log2^n==logn  o(logn)


// Binary search 
// leetcode 704

// public class Main{
//     public static void main(String[] args) {
//         Solution solution = new Solution();

//         int num[] nums = {-1, 0, 3, 5, 9, 12};

//         int target = 9;
//         int result = solution.search(nums,target);
//         System.out.println("Index of " + target + " is: " +result);
//     }
// }
// class Solution{
//     public int search(int[] nums, int target){
//         int left =0;
//         int right =nums.length-1;

//         while(left<=right){
//             int mid = left + (right+left)/2;
//             if(nums[mid]==target){
//                 return mid;
//             }else if(nums[mid]<target){
//                 left = mid+1;
//             }else{
//                 right = mid-1;
//             }
//         }
//         return -1;
//     }
// }

// javac Main.java
// java Main


//Q.)given a sorted array of non-negative distinct integers. find the smallest missing non-negative element in it

// brute force
// int expected_element =0;
// for(int i=0;i<n;i++){
//     if(a[i] != expected_element){
//         return expected_element;
//     }
//     expected_element +=1;
// }

// int find_missing(int []arr){
//     if(arr[0]!=0) return 0;
//     int ans =arr.length;
//     int left =0 ;
//     int right=arr.length-1;

//     while(left<=right){
//         int mid =left + (right-left)/2;
//         if(arr[mid]==mid){
//             left = mid+1;
//         } else{
//             ans = mid;
//             right=mid-1;
//         }
//     }
//     return ans;
// }


// lower bound
// given an array of integer arranged in asc order and a value x.
// find the index of the first element which is greater than or equal to x