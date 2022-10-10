package algorithm;

import java.util.Scanner;

//https://atcoder.jp/contests/atc001/tasks/dfs_a
public class HukasaYusenTansaku {
	static Scanner sc = new Scanner(System.in);
	static int H; static int W;
	static char[][] map;

	public static void main(String[] args) {
		// inputs
		H = sc.nextInt();
		W = sc.nextInt();
		map = new char[H][W];
		boolean[][] went = new boolean[H][W];
		int sx = 0, sy = 0;
		
		for (int i = 0; i < H; i++) {
			map[i] = sc.next().toCharArray();
			for (int j = 0; j < W; j++) {
				if (map[i][j] == 's') {
					sx = i;	
					sy = j;
				}
			}
		}
		search(sx, sy,went);
		System.out.println("No");
	}

	public static void search(int n1, int n2, boolean[][] went) {
		// mapの外or壁の場合はreturn;
		if (n1 < 0 || n2 < 0 || n1 >= H || n2 >= W || map[n1][n2] == '#') return;
		// 通過済みの場合はreturn;
		if (went[n1][n2]) return;
		// 通過を記録
		went[n1][n2] = true;
			
		if(map[n1][n2]=='g') {
			System.out.println("Yes");
			System.exit(0);
		}
			
		// 上下左右に動かす
		search(n1 + 1, n2,went); // 右
		search(n1 - 1, n2,went); // 左
		search(n1, n2 + 1,went); // 上
		search(n1, n2 - 1,went); // 下
	}
}