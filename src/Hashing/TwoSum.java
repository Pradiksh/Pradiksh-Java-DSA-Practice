package Hashing;

import java.util.HashMap;
import java.util.Arrays;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> index = new HashMap<>();

        for(int i = 0; i<nums.length;i++){
            int Compliment = target - nums[i];

            if(index.containsKey(Compliment)) {
                return new int[]{index.get(Compliment), i};


            }
            index.put(nums[i],i);
        }
        return new int[] {-1,-1};
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        TwoSum ob1 = new TwoSum();

       int[] result =  ob1.twoSum(nums, target);

        System.out.println(Arrays.toString(result));

    }


}
