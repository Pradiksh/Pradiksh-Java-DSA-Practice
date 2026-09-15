package Arrays.StriverLessons.Sorting;
import java.util.Arrays;

//in the given array looping till n-2 element ad assigning the minimum as 1st index
//Then the inner loop loops until n-1 i.e until last elemen starting from ith element
//if jth index elem,ent is smaller than prevoiusly assigned minimum then change the minimum index to j
// at the end of inner loop we get minimum index and then swap
//then i progress and but every time it comes to outer loop i is assigned as minimum and it compares it with rest of elements starting from i to end then it swaps on lowest

public class SelectionSort {
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9};
//Looping from 0 to Last before element i.e 20
        for(int i=0;i<=arr.length-2;i++){
            //assigning the minimum as index 0 initially
            int min = i;
//looping from i till last element
            for(int j=i;j<=arr.length-1;j++){
                if (arr[j] < arr[min]){
                    min =j;
                }

            }
            SelectionSort.swap(arr, min, i);
        }
        System.out.println(Arrays.toString(arr));
    }
}
