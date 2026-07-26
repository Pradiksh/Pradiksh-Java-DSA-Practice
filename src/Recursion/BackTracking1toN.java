package Recursion;

public class BackTracking1toN {
    static void f(int n){
        if(n<1)
            return;
        f(n-1);
        System.out.println(n);

    }
    static void main(){
        int n = 5;
        f(n);
    }
}
