package Recursion;

public class MultipleRecursion {

    static int f(int n){
        if(n<=1)
            return n;
        int last = f(n-1);
        int secodLast = f(n-2);
        return last+secodLast;

    }
    public static void main(String[] args){

        int n= 4;
       int ans = f(4);

       System.out.println(ans);

    }
}
