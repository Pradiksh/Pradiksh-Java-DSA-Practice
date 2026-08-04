package Recursion;

import java.util.ArrayList;

public class CountSubsequence {
   static int f(int index, int[] arr, ArrayList<Integer> Arraylist, int totalsum, int runningSum) {

       if (index == arr.length) {
           if (runningSum == totalsum) {
               return 1;
           } else {
           }
           return 0;
       }

       Arraylist.add(arr[index]);
       runningSum += arr[index];

     int l=   f(index + 1, arr, Arraylist, totalsum, runningSum);

       Arraylist.removeLast();
       runningSum -= arr[index];

      int r =  f(index + 1, arr, Arraylist, totalsum, runningSum);

       return l+r;
   }
    public static void main(String[] args){
        int[] arr = {1,2,1};
        int totalsum = 2;
        int runningSum = 0;
        ArrayList<Integer> Arraylist = new ArrayList<>();
       System.out.println(f(0,arr,Arraylist,totalsum,runningSum));


    }

}

