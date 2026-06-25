//3. Longest Substring Without Repeating Characters
//        Solved
//        Medium
//        Topics
//        premium lock icon
//        Companies
//        Hint
//        Given a string s, find the length of the longest substring without duplicate characters.
//
//
//
//        Example 1:
//
//        Input: s = "abcabcbb"
//        Output: 3
//        Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.
//        Example 2:
//
//        Input: s = "bbbbb"
//        Output: 1
//        Explanation: The answer is "b", with the length of 1.
//        Example 3:
//
//        Input: s = "pwwkew"
//        Output: 3
//        Explanation: The answer is "wke", with the length of 3.
//        Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
//
//
//        Constraints:
//
//        0 <= s.length <= 5 * 104
//        s consists of English letters, digits, symbols and spaces.

package Arrays.SlidingWindow;

import java.util.HashMap;
import java.util.HashSet;

public class LongestSubstring {
    public int LongestStringMap(String s){
        // We use a sliding window and update the left pointer from the last seen index.

//        Input: s = "abcabcbb"
        int leftPointer =0;
        int maxLength = 0;
        HashMap<Character,Integer> charMap = new HashMap<>();

        for(int rightPointer=0;rightPointer<s.length();rightPointer++){
            char current = s.charAt(rightPointer);
            if (charMap.containsKey(current)){
                int lastIndex = charMap.get(current);
                int newLeftPointer = lastIndex+1;

                if (newLeftPointer>leftPointer){
                    leftPointer=newLeftPointer;
                }

            }


            charMap.put(current,rightPointer);
            maxLength=Math.max(maxLength,rightPointer-leftPointer+1);

        }
        return maxLength;
    }


    public int LongestString(String s){
        //We use two pointer, Sliding window approach with hash set
        //we add the elements in hashset then on finding duplicates we remove element from left
        //until duplicate is removed
        int leftPointer =0;
        int maxLength = 0;

        HashSet<Character>charSet = new HashSet<>();

        for(int rightPointer=0;rightPointer<s.length();rightPointer++){
            while(charSet.contains(s.charAt(rightPointer))){
                charSet.remove(s.charAt(leftPointer));
                leftPointer++;
            }

            charSet.add(s.charAt(rightPointer));
            maxLength=Math.max(maxLength,rightPointer-leftPointer+1);
        }
        return maxLength;
    }
    public static void main(String[] args) {
        String s= "PWWKEWXPW";

        LongestSubstring ob1 = new LongestSubstring();

        int ans2 = ob1.LongestStringMap(s);
        int ans = ob1.LongestString(s);
        System.out.println(ans);
        System.out.println(ans2);

    }
}
