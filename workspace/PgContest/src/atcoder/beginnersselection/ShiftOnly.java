package atcoder.beginnersselection;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class ShiftOnly {
	public static void main(String[] args) {
		// System.printは遅いのでこっちを使用する。
		PrintWriter out = new PrintWriter(System.out); //out.print()で同じ結果。最後にフラッシュを忘れないこと。
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int input[] = new int[N];
		boolean isEven = true;
		int counter = 0;

		for( int n=0; n<N; n++) {
			input[n] = Integer.parseInt(sc.next());
			if(input[n]%2 != 0) {
				isEven=false;
				break;
			}
		}
		if(!isEven) {
			out.println();
			out.flush();
			// 強制終了
			System.exit(0);
		}
		
		while(isEven) {
			for(int i=0; i< N;i++) {
				if(input[i]%2!=0) {
					isEven=false;
					break;
				}
				input[i] /= 2;
			}
			if(!isEven)
				break;
			counter++;
		}
		out.println(counter);
		out.flush();
	}

	// stream sample
	private static boolean isEven(int[] input) {
		return Arrays.stream(input).filter(n-> n%2!=0).peek(v->System.out.println(v)).findAny().isPresent();
	}
}
