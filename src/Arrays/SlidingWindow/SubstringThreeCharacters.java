//1358. Number of Substrings Containing All Three Characters
//        Solved
//Medium
//        Topics
//premium lock icon
//        Companies
//Hint
//Given a string s consisting only of characters a, b and c.
//
//Return the number of substrings containing at least one occurrence of all these characters a, b and c.
//
//
//
//        Example 1:
//
//Input: s = "abcabc"
//Output: 10
//Explanation: The substrings containing at least one occurrence of the characters a, b and c are "abc", "abca", "abcab", "abcabc", "bca", "bcab", "bcabc", "cab", "cabc" and "abc" (again).
//Example 2:
//
//Input: s = "aaacb"
//Output: 3
//Explanation: The substrings containing at least one occurrence of the characters a, b and c are "aaacb", "aacb" and "acb".
//Example 3:
//
//Input: s = "abc"
//Output: 1
//
//
//Constraints:
//
//        3 <= s.length <= 5 x 10^4
//s only consists of a, b or c characters.
package Arrays.SlidingWindow;

import java.util.HashMap;

public class SubstringThreeCharacters {
    public int numberOfSubstrings(String s) {
        char [] arr = s.toCharArray();
        int left = 0;
        int right = 0;
        int Count =0;
        int n = arr.length;

        HashMap<Character,Integer> map = new HashMap<>();

        while(right<n){
            map.put(arr[right],map.getOrDefault(arr[right],0)+1);

            while(map.size()==3){
                Count = Count + (n-right);
                map.put(arr[left],map.get(arr[left])-1);
                if(map.get(arr[left])==0){
                    map.remove(arr[left]);
                }
                left++;
            }
            right++;

        }
        return Count;
    }

    static void main(String[] args) {

    }
}
