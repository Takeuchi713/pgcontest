package topsic.practice.shyanai;

import java.util.Scanner;

public class PTraining30Menseki {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] A = new int[2];
		int[] B = new int[2];
		int[] C = new int[2];
		A[0] = sc.nextInt();
		A[1] = sc.nextInt();
		B[0] = sc.nextInt();
		B[1] = sc.nextInt();
		C[0] = sc.nextInt();
		C[1] = sc.nextInt();
		
		// AとBを底辺として、距離を求める
		double bottom = Math.sqrt(Math.pow(A[0]-B[0],2) + Math.pow(A[1]-B[1],2));
		System.out.println("底辺 "+ bottom); //ここまではOKそう

//		 A,Bの二点を通る直線  : y = ax + b
//		int a = (A[1]-B[1])/(A[0]-B[0]); // これ直線だったら死ぬ
//		int b = A[1]-A[0]*a;
		// 二点A,Bを通る直線 ax + by + c = 0
		int a = B[1]-A[1];
		int b = A[0]-B[0];
		int c = A[0]*B[1]-A[1]*B[0];
		
		// 直線と点Cとの距離 : | ax + by +c | / ( a^2 + b^2 )^1/2
		double h = Math.abs( a*C[0] + b*C[1] + c )/Math.sqrt( Math.pow(a, 2) + Math.pow(b, 2) );
		System.out.println("高さ：" + h);
		double ans = bottom*h/2;
		System.out.println(ans);
	}
}
