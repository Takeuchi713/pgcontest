package aoj.introduction;

import java.util.Scanner;
//input : 46979
//output : 13:2:59
public class ITP1_1_D {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int h, m = 0;
		
		h = s/3600;
		s %= 3600; 
		m = s/60;
		s %=60;
		
		System.out.printf("%d:%d:%d", h,m,s);
		sc.close();
		
		// BufferedReaderのほうが早い？
	}
}