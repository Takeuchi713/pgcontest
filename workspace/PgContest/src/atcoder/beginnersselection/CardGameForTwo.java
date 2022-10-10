package atcoder.beginnersselection;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class CardGameForTwo {
	public static void main(String[] args) {
		
		/*
		 * 戦略
		 * 	Nが100以下なので単純にループしてよさそう。
		 * 単純案①：List / 配列から最大値を取得しあって合計、差分を出力する。
		 * 	 ソート,偶数・奇数に分ける
		 * 	
		 */
		
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		
		int N = Integer.parseInt(sc.next());
		int[] inputs = new int[N];
		for (int i=0; i<N; i++)
			inputs[i] = Integer.parseInt(sc.next()); //そもそもの話、もっと良い方法ある??
		
		int bob = 0;
		int alice = 0;
		Arrays.sort(inputs);
		for(int i=0;i<N; i++) {
			if(i%2==0)
				bob += inputs[i];
			else
				alice += inputs[i];
		}
		
		out.print(	Math.abs(alice - bob) );
		
		
		// sort array
		// Arrays.sort(array)
		
		// どれが一番早いんだろう。
		// sort list
		// sort stream 
		
		
		out.flush();
		sc.close();
	}
}
