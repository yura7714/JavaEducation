package lr2;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Input number:");
		
		int num = in.nextInt();
		
		if (num % 4 != 0) {
			System.out.println("Your number is not divided by four without remainder");
		} else if (num < 10) {
			System.out.println("Your number is less than ten");
		} else {
			System.out.println("Your number is divided by four without reminder and equal or greater than ten");
		}
		
		in.close();
	}

}
