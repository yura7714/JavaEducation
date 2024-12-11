package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class task2100 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		
		final int UNDESIRABLE_GUESTS_COUNT = 13;
		final int LUNCH_COST_PER_GUEST = 100;
		final String GUEST_WITH_COUPLE_TRIGGER = "+one";
		
		int guestsCount = 2;
		String guestName;
		
		int n = in.nextInt();
		
		in.nextLine();
		
		for (int i = 0; i < n; i++) {
			guestName = in.nextLine();
			
			guestsCount++;
			
			if (guestName.contains(GUEST_WITH_COUPLE_TRIGGER)) {
				guestsCount++;
			}
		}
		
		if (guestsCount == UNDESIRABLE_GUESTS_COUNT) {
			guestsCount++;
		}
		
		out.println(guestsCount * LUNCH_COST_PER_GUEST);
		
		in.close();
		out.flush();
	}
}
