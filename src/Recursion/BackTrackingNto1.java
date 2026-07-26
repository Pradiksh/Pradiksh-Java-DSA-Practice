package Recursion;

public class BackTrackingNto1 {
    static void f(int i, int n){
        if(i>n)
            return;
        f(i+1,n);
        System.out.println(i);
    }

    static void main(){
        int n =5;
        f(1,n);
    }
}
