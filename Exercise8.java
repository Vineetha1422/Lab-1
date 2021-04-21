package day2.task2;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
		Exercise8 obj = new Exercise8();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		if(obj.checkNumber(n)) {
			System.out.println("Power of 2");
		}
		else System.out.println("Not a power of 2");
	}
    
    public boolean checkNumber(int n) {
    	boolean check = true;
    	if(n == 0) check = false;
    	while(n != 1) {
    		if(n%2 != 0) {
    			check = false;
    			break;
    		}
    		else n /= 2;
    		
    	}
    	return check;
    }
}
