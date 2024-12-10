package lr2;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Input a number:");
		int num = in.nextInt();
		
		if (num % 3 == 0) {
			System.out.println("Your number is divided by three without remainder");
		} else {
			System.out.println("Your number is not divided by three without remainder");
		}
		
		in.close();
	}

}
