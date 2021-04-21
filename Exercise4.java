package day2.task2;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
    	Exercise4 obj = new Exercise4();
    	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit: ");
		int limit = sc.nextInt();
		System.out.println("Prime numbers under " + limit);
		obj.Primes(limit);
		
	}
    public void Primes(int n) {
    	for(int i = 2;i < n;i++) {
    		int flag = 1;
    		for(int j = 2;j <= i/2;j++) {
    			if(i%j == 0) {
    				flag = 0;
    				break;
    			}
    		}
    		if(flag == 1) {
    			System.out.print(i + " ");
    		}
    	}
    }
}
