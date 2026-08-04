package Recursion;

import java.util.ArrayList;

public class PrintAllSubSequence {
    static  void f(int index, int[] arr, ArrayList<Integer> Arraylist){
        if(index == arr.length){
            if(Arraylist.isEmpty()){
                System.out.println("{}");
            }else{
                System.out.println(Arraylist);
            }
return;
        }

        Arraylist.add(arr[index]);
        f(index+1, arr, Arraylist);

        Arraylist.remove(Arraylist.size() - 1);
        f(index+1, arr, Arraylist);


    }
    public static void main(String[] args){
        int[] arr = {3,1,2};
        ArrayList<Integer> Arraylist = new ArrayList<>();
        f(0,arr,Arraylist);

    }
}
