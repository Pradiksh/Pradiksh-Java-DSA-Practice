package Patterns;

public class Pattern_12 {
    static void main(){
        //outer loop
        int space = 2*(5-1);
        for(int i = 1;i<=5;i++){
            //inner loop
            //print nums

            for(int j =1;j<=i;j++ ){
                System.out.print(j);
            }

            for(int j = 1;j<space;j++){
                System.out.print(" ");
            }

            for(int j =i;j>=1;j-- ){
                System.out.print(j);
            }

            System.out.println();
            space -= 2;
        }
    }
}
