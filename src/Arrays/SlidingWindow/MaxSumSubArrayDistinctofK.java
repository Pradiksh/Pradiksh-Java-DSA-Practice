//You are given an integer array nums and an integer k. Find the maximum subarray sum of all the subarrays of nums that meet the following conditions:
//
//The length of the subarray is k, and
//All the elements of the subarray are distinct.
//Return the maximum subarray sum of all the subarrays that meet the conditions. If no subarray meets the conditions, return 0.
//
//A subarray is a contiguous non-empty sequence of elements within an array.
//
//
//
//        Example 1:
//
//Input: nums = [1,5,4,2,9,9,9], k = 3
//Output: 15
//Explanation: The subarrays of nums with length 3 are:
//        - [1,5,4] which meets the requirements and has a sum of 10.
//        - [5,4,2] which meets the requirements and has a sum of 11.
//        - [4,2,9] which meets the requirements and has a sum of 15.
//        - [2,9,9] which does not meet the requirements because the element 9 is repeated.
//        - [9,9,9] which does not meet the requirements because the element 9 is repeated.
//We return 15 because it is the maximum subarray sum of all the subarrays that meet the conditions
//Example 2:
//
//Input: nums = [4,4,4], k = 3
//Output: 0
//Explanation: The subarrays of nums with length 3 are:
//        - [4,4,4] which does not meet the requirements because the element 4 is repeated.
//We return 0 because no subarrays meet the conditions.
//
//
//Constraints:
//
//        1 <= k <= nums.length <= 105
//        1 <= nums[i] <= 105
package Arrays.SlidingWindow;
import java.util.HashMap;
import java.util.HashSet;

public class MaxSumSubArrayDistinctofK {
    public long maximumSubarraySum(int[] nums, int k) {
        long maxSum = 0;
        long winSum =0;
        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int i=0; i<nums.length;i++){
            //nums = [1,5,4,2,9,9,9], k = 3
            //[1,2,1,4,2,5,6,7]
            // we follow Sliding window + Hashmap concept
            //Step 1 - Add right element into hashmap and add sum as iteration goes
            // add every element you visit into hashmap and put it frequency as 1 for first visit like a counter

            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
            winSum += nums[i];

            //Step 2 - Remove the left element when window overflows ie size becomes larger than or equal to k
            //specifying if condition stating that to remove the left element from sum

            if(i>=k){
                //i-k gives the left element needs to be removed like 3-3 =0 we get left, 4-3 =1 and goes on
                winSum -= nums[i-k];
                //we're removing its frequency by 1 and if its frequency is 0 then remove the element itself
                freq.put(nums[i-k],freq.get(nums[i-k])-1);
                if(freq.get(nums[i-k])==0){
                    freq.remove(nums[i-k]);

                }
            }
            //Step 3 - We are calculating max sum if we have valid sub array like  the sub array should be less than k and frequency should be 3 since then only we can have unique values
            // if frequency == 3 means we have 3 unique elements so we can calculate sum

            if(i>=k-1 && freq.size()==k){
                maxSum= Math.max(maxSum, winSum);
            }

        }


return maxSum;


        }
    public static void main(String[] args) {
        int[] arr = {1,5,4,2,9,9,9};
        int k = 3;
        MaxSumSubArrayDistinctofK ob1 = new MaxSumSubArrayDistinctofK();
       long ans =  ob1.maximumSubarraySum(arr,k);

       System.out.println(ans);


    }
    }




