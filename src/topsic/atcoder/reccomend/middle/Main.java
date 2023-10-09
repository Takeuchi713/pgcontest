package topsic.atcoder.reccomend.middle;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int temp = 0;
		long sumA = 0L;
		int[] A = new int[N];
		for (int n = 0; n < N; n++) {
			temp = Integer.parseInt(sc.next());
			A[n] = temp;
			sumA += temp;
		}
		int X = sc.nextInt();

		double d = (double) X / sumA;
		// 割り切れる
		if (d % 1 == 0) {
			System.out.println((int) d);
		} else {
			int intNum = (int) d;
			long left = X - intNum * sumA;
			int result = intNum * A.length;
			for (int i = 0; i < A.length; i++) {
				left -= A[i];
				result++;
				if (left <= 0)
					break;
			}
			System.out.println(result);
		}
	}
}