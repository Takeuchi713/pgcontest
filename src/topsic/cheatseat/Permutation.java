package topsic.cheatseat;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Permutation {
	public static void main(String[] args) {
		
		// 組み合わせ
		int N = 3;
		int[] seed = IntStream.range(1, N+1).toArray();
		boolean[] used = new boolean[N];
		int[] param = new int[N];
		create(seed, param, used, 0);
		
	}
	
	public static void create(int[] seed, int[] param, boolean[] used, int index) {
		// 終わり
		if(index == seed.length) {
			System.out.println(Arrays.toString(param));
			//計算する
			return;
		}
		
		// 再帰的
		for(int i=0; i<seed.length; i++) {
			if(used[i]) {
				continue;
			}
			param[index]=seed[i];
			used[i]=true;
			create(seed, param, used, index+1);
			used[i]=false;
		}
		
	}
}