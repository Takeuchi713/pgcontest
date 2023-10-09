package topsic.temp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//https://mijs.topsic.org/atcoder_problems/abc154_d
public class DiceInLine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] p = new int[N];
		for(int i=0; i<N; i++) {
			p[i]=N;
		}
		List<Integer> result = new ArrayList<>();
		for(int j=0; j<N-K; j++) {
			
		}
		// 3/6 + 10/6 + 15/6 => 28/6
		// 1 + 2 + 3 + 4 => 10  (1+4) * 4 /2  
		
	}
	public static double tousum(double a1, double an, double n) {
		return 0.5*(a1 + an)*n;
	}
}
