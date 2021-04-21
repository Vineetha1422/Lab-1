package day2.task2;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
		Exercise7 obj = new Exercise7();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		if(obj.checkNumber(n)) System.out.println("Incrementing Number");
		else System.out.println("Not an Incrementing Number");
	}
    
    public boolean checkNumber(int number) {
    	String str = Integer.toString(number);
    	int length = str.length();
    	int arr[] = new int[length];
    	int i = 0;
    	while(number>0) {
    		int temp = number%10;
    		arr[i] = temp;
    		i++;
    		number /= 10;
    	}
    	for(int j = 0;j < length-1;j++) {
    		if(arr[j] < arr[j+1]) return false;
    	}
    	return true;
    }
}
