package Patterns;

public class Pattern_20 {
    static void main(){
        //outer loop


        for(int i = 0;i<=5;i++){

            //printing starts
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            //printing spaces
            for(int j = 1;j<=(2*(5-i));j++){
                System.out.print(" ");
            }
            //Printing stars
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
        int space = 2;

        for(int i = 1; i <= 5; i++){

            // Left stars
            for(int j = 1; j <= 5 - i + 1; j++){
                System.out.print("*");
            }

            // Spaces
            for(int j = 1; j <= space; j++){
                System.out.print(" ");
            }

            // Right stars
            for(int j = 1; j <= 5 - i + 1; j++){
                System.out.print("*");
            }

            space += 2;
            System.out.println();
        }
    }
}
