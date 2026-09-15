package Arrays.StriverLessons.Sorting;

import java.util.Arrays;

// in the given array of element outer loop starts from last element and inner loop starts from 0 to last previous element
//In the innner loop it compares current lement with adjacent element
//If current is greater than adjacent element then swap
public class BubbleSort {
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9};

        for(int i=arr.length-1;i>=0;i--){
            for(int j=0;j<=i-1;j++){
                if (arr[j] > arr[j+1]){
                    BubbleSort.swap(arr,j,j+1);

                }

            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
