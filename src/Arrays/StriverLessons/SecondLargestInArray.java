package Arrays.StriverLessons;

import java.util.Scanner;

public class SecondLargestInArray {
    //Better Approach
    static void main(String args[]) {
       int [] arr ={3,2,1,5,2};
       int largestElement = arr[0];
       int SecondLargest =-1;
       for(int i = 0;i<arr.length;i++){
           if(arr[i]>largestElement){
               largestElement=arr[i];
           }
       }
       System.out.println("The Largest Element is "+largestElement);

       for(int i = 0;i<arr.length;i++){
           if(arr[i]> SecondLargest && arr[i]!=largestElement){
               SecondLargest=arr[i];
           }

       }
        System.out.println("The Second Largest Element is "+SecondLargest);
    }
}
