package topsic.syanai.eighteen;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		long counter = 0L;
		for(int b = N; b > 0; b-- ) {
			for(int a = 1; a <= N; a++) {
				for(int c = 1; c <= N; c++) {
					if(Math.pow(b,2)-4*a*c>=0) {
						counter++;
					}
				}
			}
		}
		System.out.println(counter);
	}
}
