package atcoder.beginnersselection;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class CardGameForTwoList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		
		int N = Integer.parseInt(sc.next());
		List<Integer> inputs = new ArrayList<>(N); 
		for(int i=0; i<N; i++)
			inputs.add(Integer.parseInt(sc.next()));
		
//		inputs.sort(Comparator.reverseOrder());
		// ↓のほうが早い??
		Collections.sort(inputs, Comparator.reverseOrder());
		
		int bob = 0;
		int alice = 0;
		int cnt = 0;
		for(int num : inputs) {
			cnt++;
			if(cnt%2==0)
				bob+=num;
			else
				alice+=num;
		}
		out.print(alice-bob);
		
		out.flush();
		sc.close();
	}

}
