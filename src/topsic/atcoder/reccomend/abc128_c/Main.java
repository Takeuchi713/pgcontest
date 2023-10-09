package topsic.atcoder.reccomend.abc128_c;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 電球 N
		// スイッチ M
		// 電球i -> ki個スイッチに繋がっている。on数%2==piであればヒカル

		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] rows = new int[M][N];

		for (int m = 0; m < M; m++) {
			int num = sc.nextInt();
			for(int i=0; i<num; i++) {
				rows[m][i]=sc.nextInt();
			}
		}

		// p
		int[] p = new int[M];
		for (int m = 0; m < m; m++) {
			p[m] = sc.nextInt();
		}
		
		sc.close();
		
		
	}
}
