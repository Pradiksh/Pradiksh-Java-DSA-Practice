package Patterns;

public class Pattern_18 {
    static void main(){
        char ch = 'F';
        //outer loop
        for(int i = 1;i<=5;i++){
            ch = (char) (ch-i);

            //inner loop
            for(int j = 1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println(" ");
        }
    }
}
