package aoj.introduction;

import java.util.Scanner;

public class ITP1_2_A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int result = Integer.compare(a, b);
		if (result == 0) 
			System.out.println("a == b");
		
		if (result<0) 
			System.out.println("a < b");
		
		if(result>0)
			System.out.println("a > b");
	}
}
