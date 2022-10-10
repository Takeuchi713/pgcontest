package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

// N順列の作成
public class Permutation {
	static List<int[]> pattern = new ArrayList<>();
 	public static void main(String[] args) {
		// N文字の並び替えのパターンを列挙
		resultutation(3);
		// 確認
		pattern.forEach(array -> System.out.println(Arrays.toString(array)));
 	}
	private static void resultutation( int seed) {
		int[] seedArray = IntStream.range(1,seed+1).toArray();
		int[] result = new int[seed];
		boolean[] used = new boolean[seed];
		buildPerm(seedArray, result, used, 0);
	}
	private static void buildPerm(int[] seed, int[] result, boolean[] used, int index) {
		// 終わり
		if(index==seed.length) {
			pattern.add(Arrays.copyOf(result,result.length));
			return;
		}
		for(int i=0; i<seed.length; i++) {
			if(used[i]) continue;
			result[index]=seed[i];
			used[i]=true;
			buildPerm(seed,result,used,index+1);
			used[i]=false;
		}
	}
}
