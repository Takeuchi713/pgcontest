package atcoder.beginnersselection;

import java.io.PrintWriter;
import java.util.Scanner;

public class Coins2 {
	public static void main(String[] args) {
		
		PrintWriter out = new PrintWriter(System.out);
		Scanner sc = new Scanner(System.in);
		
		int a = Integer.parseInt(sc.next()); //500
		int b = Integer.parseInt(sc.next()); //100
		int c = Integer.parseInt(sc.next()); //50
		int X = Integer.parseInt(sc.next()); //50*X
		
		int counter = 0;
		for(int i=0; i<=a;i++) {
			if( X < i*500)
				break;
			for(int j=0; j<=b; j++) {
				for(int k=0; k<=c;k++) {
					if(500*i + 100*j + 50*k == X)
						counter++;
				}
			}
		}
		
		out.println(counter);
		out.flush();
		sc.close();
	}
}

 