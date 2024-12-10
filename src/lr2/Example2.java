package lr2;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Input number:");
		
		int num = in.nextInt();
		
		if(num % 5 != 2) {
			System.out.println("The remainder of dividing your number by five is not two");
		} else if(num % 7 != 1) {
			System.out.println("The remainder of dividing your number by seven is not one");
		} else {
			System.out.println("The remainder of dividing your number by five is two, and by seven is one");
		}
				
		in.close();
	}

}
