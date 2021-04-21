package day2.task2;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
		Exercise6 obj = new Exercise6();
		
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter a natural number: ");
	    int limit = sc.nextInt();
	    System.out.println("The difference is : " + obj.calculateDifference(limit));
	}
    
    public int calculateDifference(int n) {
    	int result1 = 0 , result2 = 0;
    	for(int i = 1;i <= n;i++) {
    		result1 += i;
    		result2 += i*i;
    	}
    	return (result2 - result1*result1);
    }
}
