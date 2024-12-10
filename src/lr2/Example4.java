package lr2;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Input number:");
		
		int num = in.nextInt();
		
		if (num < 5) {
			System.out.println("Your number is less than five");
		} else if (num > 10) {
			System.out.println("Your number is greater than ten");
		} else {
			System.out.println("Your number is between five and ten");
		}
		
		in.close();
	}

}
