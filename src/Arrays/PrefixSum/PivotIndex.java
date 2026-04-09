package Arrays.PrefixSum;

public class PivotIndex {

    public int pivot(int[] nums) {
        int totalSum = 0;
        int LeftSum = 0;

//loop to find total sum
        for(int i =0 ; i<nums.length;i++){
            totalSum += nums[i];
        }

        for(int i =0;i<nums.length;i++){
            int RightSum = totalSum - LeftSum - nums[i];


            if(LeftSum == RightSum){
                return i;
            }
            LeftSum += nums[i];
        }
        return -1;
    }
    public  static void main(String[] args) {
int [] arr = {1,7,3,6,5,6};

        PivotIndex ob1 = new PivotIndex();

       int ans = ob1.pivot(arr);
       System.out.println(ans);


    }
}


