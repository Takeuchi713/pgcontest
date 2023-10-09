package topsic.pgcontest2022;

import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		PrintWriter out = new PrintWriter(System.out);
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] result = new int[N];
		
		Set<Integer> set = new HashSet<>();
		for(int n=0; n<N; n++) {
			set.add(sc.nextInt());
			result[n] = set.size();
		}
		sc.close();
		
		// ダサい..
//		for(int j=0; j<result.length; j++) {
//			if(j+1==result.length)
//				out.print(result[j]);
//			else
//				out.print(result[j] + " ");
//		}
		
		
		List<Integer> list = IntStream.of(result).boxed().collect(Collectors.toList());
		for(Iterator<Integer> iterator = list.iterator(); iterator.hasNext();) {
			
			if(!iterator.hasNext()) {
				out.print(iterator.next());
			} else {
				out.print(iterator.next() + " ");
			}
		}
		
		out.flush();
		out.close();
	}
}
