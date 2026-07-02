package Patterns;

public class Pattern_15 {
    static void main(){
        //outer loop
        for(int i =1;i<=5;i++){
            char ch = 'A';
            for(int j = 5;j>=i ;j--){
                System.out.print(ch);
                System.out.print(" ");
                ch++;

            }
            System.out.println(" ");
        }
    }
}
