package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("The first integer to be averaged?");
		int n1 = in.nextInt();
		
		System.out.println("The second integer to be averaged?");
		int n2 = in.nextInt();
		
		double average = ((n1 + n2) / 2.0);
		System.out.println("The average is " + average);
		
	}

}
