package topsic.pgcontest2023.prob3;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		
		int N = sc.nextInt();
		String S = sc.next();
		sc.close();
		

		int total = 1; //先頭文字
        for (int i=0; i<=S.length()-1; i++) {
            for (int j=S.length()-1; i<j; j--) {
                String wkStr = S.substring(i, j-i+1);
                if (!isPalindrome(wkStr)) 
                	continue;
                total++;
                break;
            }
        }
		out.print(total);
		out.flush();
		out.close();
	}
	
	static boolean isPalindrome(String s) {
		int n = s.length();
		for (int i=0; i<n/2; i++) {
			if (s.charAt(i)!=s.charAt(n-i-1)) 
				return false;
		}
		return true;
	}
}