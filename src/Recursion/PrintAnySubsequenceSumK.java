package Recursion;

import java.util.ArrayList;

public class PrintAnySubsequenceSumK {
   static Boolean f(int index, int[] arr, ArrayList<Integer> Arraylist, int totalsum, int runningSum){

        if(index == arr.length){
            if(runningSum == totalsum){
                if(Arraylist.isEmpty()){
                    System.out.println("{}");
                }else{
                    System.out.println(Arraylist);
                }
return true;
            }
            return false;
        }

        Arraylist.add(arr[index]);
        runningSum+=arr[index];

      if (f(index+1, arr, Arraylist,totalsum,runningSum)==true)
        return true;

      Arraylist.removeLast();
        runningSum-=arr[index];

       if(f(index+1, arr, Arraylist,totalsum,runningSum)==true)
           return true;

return false;
    }
    public static void main(String[] args){
        int[] arr = {1,2,1};
        int totalsum = 2;
        int runningSum = 0;
        ArrayList<Integer> Arraylist = new ArrayList<>();
  f(0,arr,Arraylist,totalsum,runningSum);

    }
}
