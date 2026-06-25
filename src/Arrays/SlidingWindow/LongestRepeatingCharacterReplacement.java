//424. Longest Repeating Character Replacement
//Solved
//        Medium
//Topics
//premium lock icon
//        Companies
//You are given a string s and an integer k. You can choose any character of the string and change it to any other uppercase English character. You can perform this operation at most k times.
//
//Return the length of the longest substring containing the same letter you can get after performing the above operations.
//
//
//
//        Example 1:
//
//Input: s = "ABAB", k = 2
//Output: 4
//Explanation: Replace the two 'A's with two 'B's or vice versa.
//Example 2:
//
//Input: s = "AABABBA", k = 1
//Output: 4
//Explanation: Replace the one 'A' in the middle with 'B' and form "AABBBBA".
//The substring "BBBB" has the longest repeating letters, which is 4.
//There may exists other ways to achieve this answer too.
//
//
//Constraints:
//
//        1 <= s.length <= 105
//s consists of only uppercase English letters.
//0 <= k <= s.length


package Arrays.SlidingWindow;

public class LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
//here we have capital letters as input so creating array with 26 capacity to store frequency
        int[]freq = new int[26];

        int maxFreq = 0;
        int maxWindow = 0;
        int left = 0;
//Input: s = "AABABBA"  int k = 1;
        for(int right = 0;right<s.length();right++){

            //updating frequency at 0 index from the first char
             freq[s.charAt(right)-'A']++;

            //Updating the max frequency
            maxFreq = Math.max(maxFreq,freq[s.charAt(right)-'A']);


            //Calculating window length
            int windowLength = right - left+1;


//Windowlength - Maxfreq gives the number of chars need to replace and if it exceeds our k then we shrink the window
            if(windowLength-maxFreq>k){
                freq[s.charAt(left)-'A']--;
                left++;
            }

            windowLength = right - left+1;

            maxWindow = Math.max(maxWindow,windowLength);

        }
        return maxWindow;
    }
    static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;

        LongestRepeatingCharacterReplacement lr = new LongestRepeatingCharacterReplacement();

       int ans= lr.characterReplacement(s,k);

       System.out.println(ans);


    }
}
