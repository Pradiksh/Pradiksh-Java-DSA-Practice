package Recursion;

public class PrintNums1toN {

    static void f(int i, int n){
        if(i>n)
            return;
        System.out.println(i);
        f(i+1,n);
    }
    static void main(){
        int n =5;
        f(1,n);

    }

}
