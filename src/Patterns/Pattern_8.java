package Patterns;

public class Pattern_8 {
    static void main(){
        for(int i= 0;i<5;i++){

            //inner Loop
            //Printing Space using formula(n-i+1) where n is 5 here or number of rows totally
            for(int j = 0;j<i;j++){
                System.out.print(" ");
            }

            //Printing stars
            //Using the formula 2*i+1
            for(int j= 0;j<(2*5-(2*i+1));j++){
                System.out.print("*");
            }

            // //Printing Space using formula(n-i+1) where n is 5 here or number of rows totally
            for(int j = 0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    }
