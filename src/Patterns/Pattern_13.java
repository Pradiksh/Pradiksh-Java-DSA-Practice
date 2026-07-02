package Patterns;

public class Pattern_13 {
    static void main(){
        //Initialising the num to 1 as pattern starts from 1
        int num =1;

        //outer for loop
        for(int i = 1; i<=5;i++){

            //inner loop
            // the inner loop print the number of element = Row th number
            //numbers also inceremnts from 1 to from right triangle
            for(int j =1;j<=i;j++){
                System.out.print(num);
                System.out.print(" ");
                num++;
            }
            System.out.println(" ");
        }
    }
}
