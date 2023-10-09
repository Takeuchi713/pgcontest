package topsic.temp;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// https://mijs.topsic.org/atcoder_problems/abc208_c
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int N = sc.nextInt();
		long K = sc.nextLong();
		Map<Integer, Integer> A = new HashMap<>();
		int[] sort = new int[N];
		for (int i = 0; i < N; i++) {
			int temp = sc.nextInt();
			A.put(temp, i);
			sort[i] = temp;
		}

		long snack[] = new long[N];
		Arrays.fill(snack, K / N);

		long remain = K % N;
		if (remain > 0) {
			// sort
			Arrays.sort(sort);
			for (int n = 0; n < remain; n++) {
				int num = A.get(sort[n]);
				snack[num]++;
			}
		}
		for (long n : snack) {
			out.println(n);
		}
		out.flush();
		out.close();
	}
}
