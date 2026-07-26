package Recursion;

public class ParameterizedRecursion {
    static void f(int i , int sum){
        if(i<1){
            System.out.println(sum);
            return;
        }

        f(i-1,sum+i);
    }
    static void main(){
        int n = 3;
        f(n,0);

    }
}
