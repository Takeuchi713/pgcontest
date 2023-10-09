package topsic.pgcontest2023.prob1;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		
		int n = sc.nextInt();
		int[] g = new int[n];
		for(int i=0;i<n;i++)
		    g[i]=Integer.parseInt(sc.next());
		
		int[] temp = Arrays.copyOf(g, g.length);
		long sum = 0L;
		for(int i=0;i<g.length;i++) {
			if(i%2==0) {
				sum += getMax(temp);
			}
		}
		
		out.println(sum);
		sc.close();
		out.flush();
		out.close();
	}
	public static long getMax(int[] temp) {
		int max = 0;
		int idx = 0;
		for(int i=0; i<temp.length;i++) {
			if(temp[i]>max) {
				max=temp[i];
				idx = i;
			}
		}
		
		return (long)max;
	}
}