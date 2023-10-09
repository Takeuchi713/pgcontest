package topsic.pgcontest2022;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class prob3 {
	public static void main(String[] args) {
		PrintWriter out = new PrintWriter(System.out);
		Scanner sc = new Scanner(System.in);
		char[] S = sc.next().toCharArray();
		Arrays.sort(S);
		sc.close();
		
		char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		Map<String, Integer> abcMap = new HashMap<>();
		for(char c : alphabet) {
			abcMap.put(String.valueOf(c),0);
		}
		
		for(char s : S) {
			String temp = String.valueOf(s);
			abcMap.put(String.valueOf(temp), abcMap.get(temp)+1);
		}
		
		for(Map.Entry<String,Integer> entry : abcMap.entrySet()){
			if(entry.getKey().equals("z")) {
				out.print(entry.getValue());
			} else {
				out.print(entry.getValue() + " ");
			}
		}

		out.flush();
		out.close();
		
	}
}
