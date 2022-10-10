package topsic.practice.shyanai;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class PTraining27DarumaOtoshi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		
		List<Integer> H = new LinkedList<>();
		for(int n=0; n<N; n++)
			H.add(Integer.parseInt(sc.next()));
//		int[] O = new int[N];
//		O[n] = Integer.parseInt(sc.next());

		for(int n=0; n<N; n++) {
			int row = Integer.parseInt(sc.next());
			H.remove(row-1);
			printSum(H);
		}
	}

	private static void printSum(List<Integer> h) {
		long total = 0L;
		for(int n : h)
			total+=n;
		System.out.println(total);
		
	}
}
