package Arrays.SlidingWindow;

import java.util.HashSet;

public class LongestSubstring {


    public int LongestString(String s){
        //We use two pointer, Sliding window approach with hash set
        //we add the elements in hashset then on finding duplicates we remove element from left
        //until duplicate is removed
        int leftPointer =0;;
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
    static void main(String[] args) {
        String s= "PWWKEWXPW";

        LongestSubstring OB1 = new LongestSubstring();

       int ans = OB1.LongestString(s);
       System.out.println(ans);

    }
}
