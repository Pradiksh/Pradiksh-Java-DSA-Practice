package Arrays;

import java.util.Arrays;

public class ReverseArray {
public int[] Reversed(int[] arr) {
int[] Reverse = new int[arr.length];


for(int i = arr.length-1, j=0;i>=0;i--, j++){
    Reverse[j] = arr[i];

    }
return Reverse;

}
    public static void main(String[] args) {
int[] arr1 = {1,2,3,4,5,6,7};
ReverseArray rev = new ReverseArray();

int[]arr2 = rev.Reversed(arr1);
System.out.println(Arrays.toString(arr2));



    }
}
