package Arrays;
//Given an integer array nums, return the maximum element in the array.
//Input: nums = [3, 7, 2, 9, 4]
//Output: 9

//Input: nums = [-10, -3, -5, -2]
//Output: -2
public class MaxElementArray {

public int findMaxElement(int[] nums) {
    int max = Integer.MIN_VALUE;
    for(int i = 0; i<nums.length; i++){
        if(nums[i] > max){
            max = nums[i];
        }
    }
    return max;
};
    public static void main(String[] args) {
int[] arr = {-1,-2,-44,-5,-6,-12};
        MaxElementArray MaxElem = new MaxElementArray();
        System.out.println(MaxElem.findMaxElement(arr));
    }
}

