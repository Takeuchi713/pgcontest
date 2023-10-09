package topsic.atcoder.reccomend.middle;

import java.math.BigDecimal;
import java.util.Scanner;

public class Alcoholic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		BigDecimal X = sc.nextBigDecimal();
		sc.nextLine();

		String[] line = new String[2];
		BigDecimal V;
		BigDecimal P;
		BigDecimal H = new BigDecimal("100");
		BigDecimal Z = new BigDecimal("0");
		int drink = -1;
		for (int n = 0; n < N; n++) {
			line = sc.nextLine().split(" ");
			V = new BigDecimal(line[0]);
			P = new BigDecimal(line[1]);
			X = X.subtract(V.multiply(P).divide(H));
			if (X.compareTo(Z) < 0) {
				drink += n + 2;
				break;
			}
		}
		System.out.println(drink);
	}
}
