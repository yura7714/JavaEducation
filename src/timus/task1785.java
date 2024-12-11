package timus;

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;

public class task1785 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		
		Map<Integer, String> anindilyakvaTranslate = new TreeMap<>();
		
		anindilyakvaTranslate.put(5, "few");
		anindilyakvaTranslate.put(10, "several");
		anindilyakvaTranslate.put(20, "pack");
		anindilyakvaTranslate.put(50, "lots");
		anindilyakvaTranslate.put(100, "horde");
		anindilyakvaTranslate.put(250, "throng");
		anindilyakvaTranslate.put(500, "swarm");
		anindilyakvaTranslate.put(1000, "zounds");
		anindilyakvaTranslate.put(2001, "legion");
		
		int monstersCount = in.nextInt();
		String monstersCountInAnindilyakva = "";
		
		for(Map.Entry<Integer, String> entry: anindilyakvaTranslate.entrySet()) {			   
		   Integer key = entry.getKey();
		   String value = entry.getValue();
		   
		   if(monstersCount < key) {
			   monstersCountInAnindilyakva = value;
			   break;
		   }
		}
		
		out.println(monstersCountInAnindilyakva);
		
		in.close();
		out.flush();
	}

}
