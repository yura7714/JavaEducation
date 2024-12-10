package lr2;

import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Input number:");
		
		int num = in.nextInt();
		
		int numThousands = num % 10000 / 1000;
		
		System.out.printf("Your number has %d thousands", numThousands);
		
		in.close();
	}

}
