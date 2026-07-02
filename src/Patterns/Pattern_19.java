package Patterns;

public class Pattern_19 {
    static void main(){
        //outer loop
        int init = 0;
        for(int i =0; i<5;i++){

            //in the inner loop we print star, space, star
            // we approach this pattern by 2 half
            // this logic is for 1st half
            // to print star we use formal n-i
            // to print stars 2*i

            //Stars
// Code for first half
            for(int j =1;j<=(5-i);j++) {
                System.out.print("*");
            }
                //space
                for(int j =0;j<init;j++) {
                    System.out.print(" ");
                }
                    //Stars
                    for(int j =1;j<=(5-i);j++) {
                        System.out.print("*");
                    }
                    init +=2;
                    System.out.println();

}
        init = 8;
        for(int i = 1;i<=5;i++){
            for(int j =1;j<=i;j++) {
                System.out.print("*");
            }
            //space
            for(int j =0;j<init;j++) {
                System.out.print(" ");
            }
            //Stars
            for(int j =1;j<=i;j++) {
                System.out.print("*");
            }
            init -=2;
            System.out.println();



        }
}
}
