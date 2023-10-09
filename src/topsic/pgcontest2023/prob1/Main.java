package topsic.pgcontest2023.prob1;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		
		int n = sc.nextInt();
		List<Integer> g = new ArrayList<>();
		List<Integer> temp = new ArrayList<>();
		for(int i=0;i<n;i++) {
			int num = Integer.parseInt(sc.next());
			g.add(num);
			temp.add(num);
		}
		
		long sum = 0L;
		for(int i=0;i<n;i++) {
			if(i%2==0) {
				sum += getMax(temp);
			} else {
				var v_ = getMax(temp);
			}
		}
		
		out.println(sum);
		sc.close();
		out.flush();
		out.close();
	}
	public static long getMax(List<Integer> temp) {
		int max = 0;
		int idx = 0;
		for(int i=0; i<temp.size();i++) {
			if(temp.get(i)>max) {
				max=temp.get(i);
				idx = i;
			}
		}
		temp.remove(idx);
		return (long)max;
	}
}