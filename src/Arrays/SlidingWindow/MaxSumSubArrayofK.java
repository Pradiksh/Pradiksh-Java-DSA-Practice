//Given an array of integers arr[]  and a number k. Return the maximum sum of a subarray of size k.
//
//Note: A subarray is a contiguous part of any given array.
//
//Examples:
//
//Input: arr[] = [100, 200, 300, 400], k = 2
//Output: 700
//Explanation: arr2 + arr3 = 700, which is maximum.
//        Input: arr[] = [1, 4, 2, 10, 23, 3, 1, 0, 20], k = 4
//Output: 39
//Explanation: arr1 + arr2 + arr3 + arr4 = 39, which is maximum.
//        Input: arr[] = [100, 200, 300, 400], k = 1
//Output: 400
//Explanation: arr3 = 400, which is maximum.
//        Constraints:
//        1 ≤ arr.size() ≤ 106
//        0 ≤ arr[i] ≤ 106
//        1 ≤ k ≤ arr.size()
//



package Arrays.SlidingWindow;

public class MaxSumSubArrayofK {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int windowsum =0 ;
        int n = arr.length;


        for(int i=0;i<k;i++){

            windowsum = windowsum + arr[i];

        }
        int maximum = windowsum;
        for(int j=k;j<n;j++){
            windowsum = windowsum + arr[j];
            windowsum = windowsum - arr[j-k];
            maximum = Math.max(maximum,windowsum);
        }
        return maximum;
    }

    static void main(String[] args) {
int[] arr = {100,200,300,400};
int k=2;
        MaxSumSubArrayofK ob1 = new MaxSumSubArrayofK();
       int ans =  ob1.maxSubarraySum(arr,k);

       System.out.println(ans);
    }
}
