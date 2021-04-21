package day2.task2;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
    	 Exercise1 obj = new Exercise1();
    	 
    	 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the number :");
		 int result = obj.cubeSum(sc.nextInt());
		 System.out.println("The sum of cubes of digits: " + result);
	}
    
    //method to find sum of cubes of n digit number
    public int cubeSum(int n) {
    	int result = 0;
    	int temp = 0;
    	while(n != 0) {
    		temp = n%10;
    		n = n/10;
    		result += temp*temp*temp;
    	}
    	return result;
    }
}
