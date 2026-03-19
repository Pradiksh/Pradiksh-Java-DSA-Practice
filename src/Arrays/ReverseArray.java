package Arrays;

import java.util.Arrays;

public class ReverseArray {
public int[] Reversed(int[] arr){
    int[] Revarray = new int[arr.length];

    for(int j = arr.length - 1, i = 0; j >= 0; j--, i++ ){
        Revarray[i] = arr[j];
    }
return Revarray;
}

    public static void main(String[] args) {

int[] array = {1,2,3,4,5,6};
        ReverseArray rev = new ReverseArray();

        System.out.print(Arrays.toString(rev.Reversed(array)));
    }
}
