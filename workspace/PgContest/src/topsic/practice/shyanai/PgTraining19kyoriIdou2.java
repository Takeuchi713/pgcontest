package topsic.practice.shyanai;

import java.util.Scanner;

public class PgTraining19kyoriIdou2 {
	static char[][] map;
	static int R;
	static int C;
	static int count;
	static boolean goaled;
	public static void main(String[] args) {
		// inputs
		Scanner sc = new Scanner(System.in);
		R = sc.nextInt();
		C = sc.nextInt();
		map = new char[R][C];
		boolean[][] went = new boolean[R][C];
		int s1=0, s2=0;
		
		// map
		for(int i=0; i<R; i++) {
			map[i] = sc.next().toCharArray();
			for(int j=0; j<C; j++) {
				if(map[i][j]=='S') {
					s1=i;
					s2=j;
				}
			}
		}
		
		search(s1,s2,went);
		System.out.println(count);
	}
	
	public static void search(int n1, int n2, boolean[][] went) {
		//goal済み
		if(goaled) return;
		//map外or壁の場合はreturn
		if(n1<0 || n1>=R || n2<0 || n2>=C || map[n1][n2]=='.') return;
		//訪問済みの場合はretrun
		if(went[n1][n2]) return;
		//訪問履歴を更新
		went[n1][n2]=true;
		count++;
		if(map[n1][n2]=='T') {
			goaled=true;
			return;
		}
		search(n1+1,n2,went); //右
		search(n1-1,n2,went); //左
		search(n1,n2+1,went); //上
		search(n1,n2-1,went); //下
	}
}
