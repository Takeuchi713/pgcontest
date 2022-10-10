package atcoder.beginnersselection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class CardGameForTwoOtherUser {
		public static void main(String[] args) {
			 
			long ans = 0;
	        Scanner sc = new Scanner(System.in);
			
			int N = sc.nextInt();
			
			List<Integer> aList = new ArrayList<>();
			for(int i=0; i<N; i++) {
				aList.add(sc.nextInt());
			}
			
			Collections.sort(aList, Comparator.reverseOrder());
			
			int alice = 0;
			int bob = 0;
			
			int cnt = 0;
			for(Integer i : aList) {
				cnt++;
				
				if(cnt % 2 == 0) {
					bob += i;
				} else {
					alice += i;
				}
			}
			
			System.out.println(alice - bob);
		}
}
