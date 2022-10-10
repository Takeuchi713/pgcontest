package atcoder.beginnersselection;

import java.util.Scanner;

public class Otoshidama {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = Integer.parseInt(sc.next());
		int Y = Integer.parseInt(sc.next());
		
		// x = 10000, y=5000, x= 1000の枚数
		for(int x=0; x<=N; x++) {
			for(int y=0; y<=N-x; y++) {
				int z = N - x - y;
				if(Y== (10000*x + 5000*y + 1000*z)) {
					System.out.println(x + " " + y + " " + z);
					return;
				}
			}
		}
		System.out.println("-1 -1 -1");
	}
}
