package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class task1409 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		
		final int CANS_HITTED_TOGETHER = 1;
		
		int hittedByLarry = in.nextInt();
		int hittedByGarry = in.nextInt();
		
		int totalCans = hittedByLarry + hittedByGarry - CANS_HITTED_TOGETHER;
		
		out.printf("%d %d", totalCans - hittedByLarry, totalCans - hittedByGarry);
		
		in.close();
		out.flush();
	}

}
