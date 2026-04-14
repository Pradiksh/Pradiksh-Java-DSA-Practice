package Arrays.PrefixSum;

import java.util.HashMap;

public class SubArraySumEqualsK {

    public int SubarraysK(int[] nums, int k){
        int prefixSum = 0;
        int count = 0;
        //Using hashmap to store prefix sum and its frequency
        HashMap<Integer, Integer> freq = new HashMap<>();
// intially adding 0 with frequency 1 as it gives single sub array eg {5} since single element also a sub array
        freq.put(0,1);
// for loop till end
        for(int num :nums){
            //prefix sum calculation
            prefixSum += num;

            //conditon to check if previous sum is present in hashmap by subtracting prefix sum from k
            //the frequency count gives the number of valid substring we crossed
            //If condition is first becoz even single element can also give answer
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
