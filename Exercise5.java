package day2.task2;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
    	Exercise5 obj = new Exercise5();
    	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a natural number: ");
		int n = sc.nextInt();
		System.out.println("Sum of number divisble by 3 or 5 under " + n + ": " + obj.calculateSum(n));
	}
    
    public int calculateSum(int n) {
    	int result = 0;
    	for(int i = 1;i <= n;i++) {
    		if(i%3 == 0 || i%5 == 0) {
    			result += i;
    		}
    	}
    	return result;
    }
}
