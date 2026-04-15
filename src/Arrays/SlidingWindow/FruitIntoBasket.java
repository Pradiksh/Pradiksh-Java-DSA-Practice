package Arrays.SlidingWindow;

import java.util.HashMap;

public class FruitIntoBasket {
    public int totalFruit(int[] fruits) {
int n = fruits.length;
int left =0;
int right =0;
int maxLen =0;

HashMap<Integer,Integer> freq = new HashMap<>();

while(right<n){
    freq.put(fruits[right], freq.getOrDefault(fruits[right],0)+1);

    if(freq.size()>2){
        freq.put(fruits[left],freq.get(fruits[left])-1);
        if(freq.get(fruits[left])==0){
            freq.remove(fruits[left]);
        }
        left++;
    }
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
