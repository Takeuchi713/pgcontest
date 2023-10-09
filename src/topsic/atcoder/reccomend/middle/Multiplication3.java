package topsic.atcoder.reccomend.middle;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Multiplication3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigDecimal A = new BigDecimal(sc.next());
		BigDecimal B = new BigDecimal(sc.next());
		System.out.println(A.multiply(B).setScale(0,RoundingMode.DOWN).toPlainString());
	}
}
