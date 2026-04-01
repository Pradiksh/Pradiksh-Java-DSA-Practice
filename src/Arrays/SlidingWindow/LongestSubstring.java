package Arrays.SlidingWindow;

import java.util.HashMap;
import java.util.HashSet;

public class LongestSubstring {
    public int LongestStringMap(String s){
        // We use a sliding window and update the left pointer from the last seen index.
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
