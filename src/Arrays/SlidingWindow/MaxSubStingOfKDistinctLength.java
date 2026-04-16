package Arrays.SlidingWindow;

import java.util.HashMap;

public class MaxSubStingOfKDistinctLength {
    public int kDistinctChar(String s, int k) {
        //your code goes here

        int left = 0;
        int right=0;
        int MaxLen =0;
        HashMap<Character,Integer>freq = new HashMap<>();

        char[] arr=s.toCharArray();
        int n = arr.length;

        while(right<n){
            freq.put(arr[right],freq.getOrDefault(arr[right],0)+1);

            if(freq.size()>k){
                freq.put(arr[left],freq.get(arr[left])-1);

                if(freq.get(arr[left])==0){
                    freq.remove(arr[left]);
                }
                left++;
            }
            if(freq.size()==k){
                MaxLen = Math.max(MaxLen, right-left+1);

            }
            right++;
        }
        return MaxLen;
    }
}
