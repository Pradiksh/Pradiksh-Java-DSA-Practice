package Patterns;

public class Pattern_21 {
    static void main(){
        for(int i = 0;i<5;i++){
            for(int j = 0;j<5;j++){
                if(i==0||j==0|| i==5-1||j==5-1){
                    System.out.print("*");
                }else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
