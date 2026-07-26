package Recursion;

public class Lesson1 {

    static void f(int i,int n){
        if(i>n)
            return;
        System.out.println("Pradiksh");
        f(i+1,n);

    }

    static void main(String[] args){
     int n = 3;

    f(1,3);
    }
}
