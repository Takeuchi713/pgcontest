package atcoder.beginnersselection;

import java.io.PrintWriter;
import java.util.Scanner;

public class SomeSums {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		
		int n = Integer.parseInt(sc.next());
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		
		int counter = 0;
		int temp = 0;
		for(int i = 1; i <= n; i++) {
			temp = sumDigets(i);
			if( a<= temp &&  temp <= b) 
				counter+=i;
		}
		
		out.println(counter);
		out.flush();
		sc.close();
	}
	
	public static int sumDigets(int num) {
		int result = 0;
		while(num > 0) {
			result += num%10;
			num /= 10;
		}
		return result;
	}
}
