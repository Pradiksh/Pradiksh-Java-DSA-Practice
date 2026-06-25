package Patterns;

public class Pattern_10 {
    static void main(){
        //outer loop
        for(int i =1; i<2*5-1;i++){
            // we declare stars here as we need to print stars as per row numbers until 5
            int stars = i;
            //inner loop
            // we give condition so that starts reduce after 5
            if(i>5){
                stars = 2*5-i;
            }
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }

System.out.println();
        }
    }
}
