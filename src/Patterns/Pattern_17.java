package Patterns;

public class Pattern_17 {
    static void main(){
        for(int i= 0;i<5;i++){

            //inner Loop
            //Printing Space using formula(n-i+1) where n is 5 here or number of rows totally
            for(int j = 0;j<(5-i-1);j++){
                System.out.print(" ");
            }

          //printing the chars
            //we use formula 2*i+1
            //We increment the chars but after crossing half ie 2*i+1/2 we decrement chars
            char ch ='A';
            int breakpoint = (2*i+1)/2;
            for(int j=1;j<=(2*i+1);j++){
                System.out.print(ch);


                if(j<=breakpoint){
                    ch++;
                }else ch--;

            }

            // //Printing Space using formula(n-i+1) where n is 5 here or number of rows totally
            for(int j = 0;j<(5-i-1);j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
