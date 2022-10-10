package topsic.atcoder;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ColorfulCandies {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] array = new int[N];
		for (int n = 0; n < N; n++)
			array[n] = sc.nextInt();
		sc.close();
		
		// 初回のK区分
		int ans = 0;
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<K; i++) {
			if(map.containsKey(array[i]))
				map.put(array[i], (map.get(array[i])+1));
			else
				map.put(array[i], 1);
		}
		ans = map.size();
		
		// ずらす
		for(int j=1; j<N-K; j++) {
			// ひとつ前
			int c = j-1;
			if(map.get(array[c])==1)
				map.remove(array[c]);
			else
				map.put(array[c], map.get(array[c])-1);
			
			// 次
			c += K;
			if(map.containsKey(array[c]))
				map.put(array[c], map.get(array[c])+1);
			else
				map.put(array[c], 1);
			
			// 確認
			ans = Math.max(ans, map.size());
		}
		
		System.out.println(ans);
	}
}