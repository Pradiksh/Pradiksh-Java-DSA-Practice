//904. Fruit Into Baskets
//        Solved
//        Medium
//        Topics
//        premium lock icon
//        Companies
//        You are visiting a farm that has a single row of fruit trees arranged from left to right. The trees are represented by an integer array fruits where fruits[i] is the type of fruit the ith tree produces.
//
//        You want to collect as much fruit as possible. However, the owner has some strict rules that you must follow:
//
//        You only have two baskets, and each basket can only hold a single type of fruit. There is no limit on the amount of fruit each basket can hold.
//        Starting from any tree of your choice, you must pick exactly one fruit from every tree (including the start tree) while moving to the right. The picked fruits must fit in one of your baskets.
//        Once you reach a tree with fruit that cannot fit in your baskets, you must stop.
//        Given the integer array fruits, return the maximum number of fruits you can pick.
//
//
//
//        Example 1:
//
//        Input: fruits = [1,2,1]
//        Output: 3
//        Explanation: We can pick from all 3 trees.
//        Example 2:
//
//        Input: fruits = [0,1,2,2]
//        Output: 3
//        Explanation: We can pick from trees [1,2,2].
//        If we had started at the first tree, we would only pick from trees [0,1].
//        Example 3:
//
//        Input: fruits = [1,2,3,2,2]
//        Output: 4
//        Explanation: We can pick from trees [2,3,2,2].
//        If we had started at the first tree, we would only pick from trees [1,2].
//
//
//        Constraints:
//
//        1 <= fruits.length <= 105
//        0 <= fruits[i] < fruits.length

//We have to return longest substring with 2 unique characters
package Arrays.SlidingWindow;

import java.util.HashMap;
//This problem is to return length of maximum substring containing 2 unique characters
// we use hashmap approach

public class FruitIntoBasket {
    public int totalFruit(int[] fruits) {
int n = fruits.length;
int left =0;
int right =0;
int maxLen =0;

HashMap<Integer,Integer> freq = new HashMap<>();
//        Input: fruits = [1,2,3,2,2]

        //While loop iterates through input
while(right<n){

    //we add the elements and it frequency in hashmap and giving inital frequency as 1 we visit
    freq.put(fruits[right], freq.getOrDefault(fruits[right],0)+1);
// if the hashmap size exceeds 2 we shrink thw window as we need substring with 2 unique elemnts only
    if(freq.size()>2){
        freq.put(fruits[left],freq.get(fruits[left])-1);
        if(freq.get(fruits[left])==0){
            freq.remove(fruits[left]);
        }
        left++;
    }
    //if we have hashmap of size 2 which is our desired size so we calculate the window length and also check it is max length or not
    if(freq.size()==2){
        maxLen = Math.max(maxLen,right-left+1);
    }
    right++;
}
return maxLen;

    }
    static void main(String[] args) {

    }
}
