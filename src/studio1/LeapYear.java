package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter year:");
		int year = in.nextInt();
	
		boolean leapYear;
		
		int divisibleBy4 = year%4;
		int notDivisibleBy100 = year%100;
		int exception400 = year%400;
		
		leapYear = true;
		leapYear = divisibleBy4 == 0 && notDivisibleBy100 != 0 || exception400 == 0;
		
		System.out.println(leapYear);
		

	}

}
