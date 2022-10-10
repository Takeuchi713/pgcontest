package topsic.practice.shyanai;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class PTraining34GUUSUUWA {
	static int N;
	static int[] inputs;

	public static void main(String[] args) {
//		solutionOne();
		solutionTwo();
	}

	private static void solutionTwo() {
		Scanner sc = new Scanner(System.in);
		N = Integer.parseInt(sc.next());
		List<Integer> inputs = new ArrayList<>(N);
		for (int n = 0; n < N; n++)
			inputs.add(Integer.parseInt(sc.next()));

		
		long total = 0;
		// sort
//		Arrays.sort(inputs);
		Collections.sort(inputs);
		
		// sum
//		total = Arrays.stream(inputs).mapToLong(Integer::longValue).sum();
		total = inputs.stream().mapToLong(Integer::longValue).sum();
		if(total%2==0) {
			System.out.println(total);
		} else {
			// 最小値
//			OptionalInt minOddOpt = Arrays.stream(inputs).filter(s->s%2==1).findFirst();
//			int minOdd = minOddOpt.getAsInt();
			Optional<Integer> minOddOpt = inputs.stream().filter(n->n%2==1).findFirst();
			System.out.println(total-minOddOpt.get());
		}
	}

	private static void solutionOne() {
		Scanner sc = new Scanner(System.in);
		N = Integer.parseInt(sc.next());
		inputs = new int[N];
		for (int n = 0; n < N; n++)
			inputs[n] = Integer.parseInt(sc.next());

		long total = 0;
//		int minOdd = 0;
		int minOdd = 100001; // 条件下での最大値
		for (int num : inputs) {
			total += num;
			if (num % 2 == 1) {
//				if(minOdd==0)
//					minOdd=num;
				minOdd = Math.min(num, minOdd);
			}
		}

		if (total % 2 == 0) {
			System.out.println(total);
		} else {
			System.out.println(total - minOdd);
		}
	}
}
