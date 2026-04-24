package Arrays.SlidingWindow;

public class LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {

        int[]freq = new int[26];

        int maxFreq = 0;
        int maxWindow = 0;
        int left = 0;

        for(int right = 0;right<s.length();right++){
            //updating frequency at 0 index from the first char

            freq[s.charAt(right)-'A']++;
            //Updating the max frequency
            maxFreq = Math.max(maxFreq,freq[s.charAt(right)-'A']);
            //Calculating window length
            int windowLength = right - left+1;

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


    }
}
