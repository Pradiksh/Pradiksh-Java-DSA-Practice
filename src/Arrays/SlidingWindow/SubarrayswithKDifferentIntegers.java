package Arrays.SlidingWindow;

import java.util.HashMap;

public class SubarrayswithKDifferentIntegers {
    public int subarraysWithKDistinct(int[] nums, int k) {

return atMostk(nums,k)-atMostk(nums,k-1);
    }


   public int atMostk(int[]nums,int k){
int count =0;
int left =0;
int n = nums.length;
if(k<0){
    return 0;
}
//Hashmap to store the number and its frequency

       HashMap<Integer,Integer> freq = new HashMap<>();

//finding the subarray with element <=k here
for(int right = 0;right<n;right++ ){

    freq.put(nums[right],freq.getOrDefault(nums[right],0)+1);

    if(freq.size()<=k){
        count += right - left +1;
    }

    while(freq.size()>k){
        freq.put(nums[left],freq.get(nums[left])-1);
        if(freq.get(nums[left])==0){
            freq.remove(nums[left]);
        }
        left++;
    }
    count += right - left +1;


}
return count;
    }
    static void main(String[] args) {

    }
}
