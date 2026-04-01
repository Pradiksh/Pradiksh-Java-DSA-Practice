package Arrays.SlidingWindow;

public class MaxSumSubArrayDistinctofK {


    static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,6,8,9,12,14,16,19};

        for(int i =0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println("Duplicate found");
                }
            }
        }

    }
}
