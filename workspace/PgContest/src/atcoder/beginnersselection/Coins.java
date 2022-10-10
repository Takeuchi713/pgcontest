package atcoder.beginnersselection;

import java.io.PrintWriter;
import java.util.Scanner;

public class Coins {
	
    static class Coin {
    	private int yen;
    	private int nums;
    	
    	public Coin(int yen, int nums) {
    		this.yen = yen;
    		this.nums = nums;
    	}
    	
    	public int getYen() {
    		return this.yen;
    	}
    	public int getNums() {
    		return this.nums;
    	}
    }
	
	public static void main(String[] args) {
		
		PrintWriter out = new PrintWriter(System.out);
		Scanner sc = new Scanner(System.in);
		
		int a = Integer.parseInt(sc.next()); //500
		Coin A = new Coin(500, a);
		int b = Integer.parseInt(sc.next()); //100
		Coin B = new Coin(100, b);
		int c = Integer.parseInt(sc.next()); //50
		Coin C =new Coin(50, c);
		
		int X = Integer.parseInt(sc.next()); //50*X
		
		int counter = 0;
		
		// 一枚
		counter += calc( A, X );
		counter += calc( B, X);
		counter += calc( C, X);
		
		// 二枚
		// A and B
		if ( notZero( A , B ) ) {
			counter += calc(A,B,X);
		}
		// A and C
		if ( notZero( A, C )) {
			counter += calc(A,C,X);
		}
		// B and C
		if ( notZero(B,C)) {
			counter += calc(B,C,X);
		}
		
		// 三枚
		if ( notZero(A,B,C)) {
			counter += calc(A,B,C,X);
		}
		
		
		out.print(counter);
		sc.close();
		out.flush();
	}

	// 3枚処理
	private static int calc(Coin a, Coin b, Coin c, int X) {
		
		if ( X  < a.getYen() + b.getYen() + c.getYen()) {
			return 0;
		}
		if ( X == a.getYen() + b.getYen() + c.getYen() ) {
			return 1;
		}
		
		int counter = 0;
		
		for (int i=1; i<=a.getNums(); i++) {
			if( X < i*a.getYen()) 
				break;
			
			for (int j=1; j<=b.getNums(); j++) {
				if (X < j*b.getYen()) 
					continue;
				
				for(int k=1; k<=c.getNums(); k++) {
					if(X < k*c.getYen())
						continue;
					
					if(X< i*a.getYen() + j*b.getYen() + k*c.getYen()) 
						continue;
					
					if( X == i*a.getYen() + j*b.getYen() + k*c.getYen()) {
						counter++;
						continue;
					}
				}
			}
		}
		
		return counter;
	}

	// 2枚処理
	private static int calc(Coin x, Coin y, int X) {
		int yenX = x.getYen();
		int numsX = x.getNums();
		int yenY = y.getYen();
		int numsY = y.getNums();
		
		// 一枚ずつ以上使うので、合計値が最低以下であればループせず返す
		if ( X < yenX + yenY ) {
			return 0;
		}
		
		// 一致
		if ( X == yenX + yenY) {
			return 1;
		}
		
		int counter = 0;
		for(int i=1; i<=numsX; i++) {
			//最大値を超えるのでbreak;
			if (X < i*numsX) {
				break;
			}
			
			for(int j=1; j<=numsY; j++) {
				// 最大値を超えるので
				if ( X < j+yenY) {
					continue; //一つ目のループに行きたい・
				}
				if (X == i*yenX + j*yenY ){
					counter++;
					continue;
				}
			}
		}
		return counter;
	}

	// 1枚処理
	private static int calc(Coin coin, int X) {
		int yen = coin.getYen();
		int nums = coin.getNums();
		if ( X % yen != 0 ) {
			return 0;
		}
		if ( (X / yen) > nums ) {
			return 0;
		}
		return 1;
	}
	
	private static boolean notZero( Coin... coins ) {
		for (Coin n : coins) {
			if ( n.getNums() == 0 ) {
				return false;
			}
		}
		return true;
	}
}

 