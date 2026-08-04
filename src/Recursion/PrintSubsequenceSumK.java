package Recursion;

import java.util.ArrayList;

public class PrintSubsequenceSumK {
    static  void f(int index, int[] arr, ArrayList<Integer> Arraylist,int totalsum, int runningSum){

        if(index == arr.length){
            if(runningSum == totalsum){
                if(Arraylist.isEmpty()){
                System.out.println("{}");
            }else{
                System.out.println(Arraylist);
            }

            }
            return;
        }

        Arraylist.add(arr[index]);
        runningSum+=arr[index];
        f(index+1, arr, Arraylist,totalsum,runningSum);

        Arraylist.remove(Arraylist.size() - 1);
        runningSum-=arr[index];
        f(index+1, arr, Arraylist,totalsum,runningSum);


    }
    public static void main(String[] args){
        int[] arr = {1,2,1};
        int totalsum = 2;
        int runningSum = 0;
        ArrayList<Integer> Arraylist = new ArrayList<>();
        f(0,arr,Arraylist,totalsum,runningSum);

    }
}
