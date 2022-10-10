package atcoder.beginnersselection;

import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class KagamiMochi {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		
		// Treeじゃなくてもよいか。distinctであればよさそう。
//		Set<Integer> inputs = new TreeSet<>();
		Set<Integer> inputs = new HashSet<>();
		int N = Integer.parseInt( sc.next() );
		for(int i=0; i<N; i++) {
			inputs.add(Integer.parseInt(sc.next()));
		}
		
		out.println(inputs.size());
		
		
		
		sc.close();
		out.flush();
		out.close();
		
	
	}
}	
