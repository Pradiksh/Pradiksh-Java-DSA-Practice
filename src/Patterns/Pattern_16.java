package Patterns;

public class Pattern_16 {
    static void main(){
        //outer loop
        char ch = 'A';
        for(int i = 1; i<=5;i++){

            //inner loop to print A B C but in row increm,ental wise
            for(int j= 1;j<=i;j++){
                System.out.print(ch);
                System.out.print(" ");
            }
            ch++;
            System.out.println(" ");

        }
    }
}
