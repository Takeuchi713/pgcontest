package topsic.pgcontest2023.prob2;

import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Main {
	public static void main(String[] args) {

		PrintWriter out = new PrintWriter(System.out);
		
		int N = nextInt();
		int M = nextInt();
		int S = nextInt();
		
		List<Integer> A = new ArrayList<>();
		int temp = 0;
		for(int a=0;a<N;a++) {
			// Sより大きいは不要
			temp = nextInt();
			if(temp<=S)
				A.add(temp);
		}
		
		int counter = 0;
		for(int b=0;b<M;b++) {
			// Sより大きいは不要
			temp = nextInt();
			if(temp<=S) {
				
//				List<Integer> filterdList = filter(A,temp,S);
				counter += filter(A,temp,S);;
			}
		}

		out.println(counter);
		
		out.flush();
		out.close();
	}
	
	
	
	private static long filter(List<Integer> list, int temp, int S) {
		return list.stream().filter(num -> num+temp==S).count();
	}



	// ===========================================================================
	// <Fast Scanner> START ======================================================
	// ===========================================================================
	static InputStream in = System.in;
	static byte[] buffer = new byte[1024];
	static int length = 0, p = 0;

	public static boolean hasNextByte() {
		if (p < length)
			return true;
		else {
			p = 0;
			try {
				length = in.read(buffer);
			} catch (Exception e) {
				e.printStackTrace();
			}
			if (length == 0)
				return false;
		}
		return true;
	}

	public static int readByte() {
		if (hasNextByte() == true)
			return buffer[p++];
		return -1;
	}

	public static boolean isPrintable(int n) {
		return 33 <= n && n <= 126;
	}

	public static void skip() {
		while (hasNextByte() && !isPrintable(buffer[p]))
			p++;
	}

	public static boolean hasNext() {
		skip();
		return hasNextByte();
	}

	public static String next() {
		if (!hasNext())
			throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int temp = readByte();
		while (isPrintable(temp)) {
			sb.appendCodePoint(temp);
			temp = readByte();
		}
		return sb.toString();
	}

	public static int nextInt() {
		return Math.toIntExact(nextLong());
	}

	public static int[] nextInts(int n) {
		int[] ar = new int[n];
		for (int i = 0; i < n; i++)
			ar[i] = nextInt();
		return ar;
	}

	public static long nextLong() {
        if (!hasNext())
            throw new NoSuchElementException();
        boolean minus = false;
        int temp = readByte();
        if (temp == '-') {
            minus = true;
            temp = readByte();
        }
        if (temp < '0' || '9' < temp)
            throw new NumberFormatException();
        long n = 0;
        while (isPrintable(temp)) {
            if ('0' <= temp && temp <= '9') {
                n *= 10;
                n += temp - '0';
            }
            temp = readByte();
        }
        return minus ? -n : n;
    }
	
}