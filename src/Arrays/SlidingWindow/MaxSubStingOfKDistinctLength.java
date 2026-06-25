//Longest Substring With At Most K Distinct Characters
//        Subscribe to TUF+
//
//        Hints
//        Company
//        Given a string s and an integer k.Find the length of the longest substring with at most k distinct characters.
//
//
//        Example 1
//
//        Input : s = "aababbcaacc" , k = 2
//
//        Output : 6
//
//        Explanation : The longest substring with at most two distinct characters is "aababb".
//
//        The length of the string 6.
//
//        Example 2
//
//        Input : s = "abcddefg" , k = 3
//
//        Output : 4
//
//        Explanation : The longest substring with at most three distinct characters is "bcdd".
//
//        The length of the string 4.
//
//        Now your turn!
//
//        Input : s = "abccab" , k = 4
//
//        Output:
//
//        Pick your answer

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
