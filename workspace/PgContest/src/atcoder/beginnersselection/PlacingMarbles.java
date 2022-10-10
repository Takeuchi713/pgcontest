package atcoder.beginnersselection;
import java.util.Scanner;

public class PlacingMarbles {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		// solution 1 
		doOne(s);
		// solution 2
		doTwo(s);
		sc.close();
  }
	
	public static void doOne( int s ) {
		// 1 or 0なので各桁をsumる
		int result = 0;
		while ( s != 0) {
			result += s%10;
			s /=10;
		}
		System.out.println(result);
	}
	
	public static void doTwo(int s) {
		// 桁数分ループ
		String S = Integer.toString(s);
		int count=0;
		for(int i=0; i<S.length(); i++) {
			if(S.charAt(i) == '1') {
				count++;
			}
		}
		System.out.println(count);
	}
}
