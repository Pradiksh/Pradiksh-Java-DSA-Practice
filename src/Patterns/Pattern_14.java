package Patterns;

public class Pattern_14 {
    static void main(){
        //outer loop of 5 rows
        for(int i =1;i<=5;i++){
            char ch = 'A';
            for(int j = 1 ; j<=i ; j++){
                System.out.print(ch);
                System.out.print(" ");
                ch++;
            }
            System.out.println(" ");
        }
    }
}
