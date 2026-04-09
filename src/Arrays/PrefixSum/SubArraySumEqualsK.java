package Arrays.PrefixSum;

import java.util.HashMap;

public class SubArraySumEqualsK {

    public int SubarraysK(int[] nums, int k){
        int prefixSum = 0;
        int count = 0;
        HashMap<Integer, Integer> freq = new HashMap<>();

        freq.put(0,1);

        for(int num :nums){
            prefixSum += num;
            if(freq.containsKey(prefixSum-k)){
                count += freq.get(prefixSum-k);
            }
            freq.put(prefixSum,freq.getOrDefault(prefixSum,0)+1);

        }
        return count;




    }



    public static void main(String[] args) {

    }
}
