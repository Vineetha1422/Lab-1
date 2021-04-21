package day2.task2;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
    	Exercise3 obj = new Exercise3();
    	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int result1 = obj.FibonacciSeq(n);
		System.out.println(n + " number from Fibonacci Series without recursion: " + result1);
		
		int result2 = obj.FibonacciSeq2(n-1);
		System.out.println(n + " number from Fibonacci Series with recursion: " + result2);
	}
    
    public int FibonacciSeq(int n) {
    	int x = 0 , y = 1 , z = 0;
    	for(int i = 2;i < n;i++) {
    		z = x + y;
    		x = y;
    		y = z;
    	}
    	return z;
    }
    
    public int FibonacciSeq2(int n) {
    	if(n <= 1) {
    	     return n;
    	}
    	else return FibonacciSeq2(n-1) + FibonacciSeq2(n-2);
    }
}
