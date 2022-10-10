package topsic.atcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.IntStream;

class Point {
	int from, to;
	long time;

	public Point(int from, int to, long time) {
		this.from = from;
		this.to = to;
		this.time = time;
	}

	@Override
	public String toString() {
		return String.format("from :%s, to: %s, time: %s", from, to, time);
	}
}

public class Travel {
	static List<int[]> pattern = new ArrayList<>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long K = sc.nextLong();
		List<Point> input = new ArrayList<>();
		for (int n = 0; n < N; n++) {
			for (int j = 0; j < N; j++) {
				input.add(new Point(n, j, sc.nextLong()));
			}
		}
		// 1を除いたN組み合わせパターン
		resultutation(N);
		// すべて試す
		List<Long> result = new ArrayList<>();
		for(int[] array: pattern) {
			// 1 -> array[0]は固定
			long temp = getTime(1, array[0], input);
			for(int i=0; i<array.length-1; i++) {
				// from i ,  to i+1
				temp+=getTime(array[i], array[i+1], input);
			}
			temp += getTime(array[array.length-1], 1, input);
			// 1-> array[length-1]は固定
			result.add(temp);
		}
		result.forEach(System.out::println); // とりあえずOKそうだけど
		countDuplicated(result);
	}

	private static void countDuplicated(List<Long> result) {
		int count=0;
		Map<Long, Integer> map = new HashMap<>();
		for(Long key : result) {
			if(map.get(key)!=null) 
				map.replace(key, map.get(key)+1);
			else
				map.put(key,1);	
		}
	}

	private static long getTime(int from, int to, List<Point> input) {
		for(Point p: input) {
			if(p.from==from && p.to==to)
				return p.time;
		};
		return 0;
	}

	private static void resultutation(int seed) {
		int[] seedArray = IntStream.range(2,seed+1).toArray();
		int[] result = new int[seed-1];
		boolean[] used = new boolean[seed-1];
		buildPerm(seedArray, result, used, 0);
	}
	private static void buildPerm(int[] seed, int[] result, boolean[] used, int index) {
		// 終わり
		if (index == seed.length) {
			pattern.add(Arrays.copyOf(result, result.length));
//			System.out.println(Arrays.toString(result));
			return;
		}
		for (int i = 0; i < seed.length; i++) {
			if (used[i])
				continue;
			result[index] = seed[i];
			used[i] = true;
			buildPerm(seed, result, used, index + 1);
			used[i] = false;
		}
	}
}
