package day2.task2;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("------Traffic light Simulation------");
		
		System.out.println("1.RED");
		System.out.println("2.YELLOW");
		System.out.println("3.GREEN");
		
		System.out.println("Enter a value :");
		int color = sc.nextInt();
		switch(color) {
		case 1:
			System.out.println("Red - Stop");
			break;
		case 2:
			System.out.println("Yellow - Ready");
			break;
		case 3:
			System.out.println("Green - Go");
			break;
		default : System.out.println("Enter a valid number");
		}
	}
}
