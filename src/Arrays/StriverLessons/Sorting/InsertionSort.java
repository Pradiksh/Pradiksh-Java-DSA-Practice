package Arrays.StriverLessons.Sorting;

import java.util.Arrays;
//In the given array of element
public class InsertionSort {
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9};

        for(int i=0;i<=arr.length-1;i++){
           int j = i;
           while(j>0&& arr[j-1]>arr[j]){
               swap(arr,j,j-1);
               j--;
           }

        }
        System.out.println(Arrays.toString(arr));
    }
}
