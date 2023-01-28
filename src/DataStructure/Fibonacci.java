package DataStructure;

import java.util.*;
class Fibonacci{  

    public static int fib(int n)
    {
        // base case
        if(n==0 || n==1)
        {
            return n;
        }
        // recursive case
        int f1 = fib(n-1);
        int f2 = fib(n-2); 
        return f1+f2;
    }

    public static void main(String args[]){  
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(fib(n));
    }  
}  