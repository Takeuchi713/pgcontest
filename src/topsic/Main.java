package topsic;
//
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
//
public class Main {
	public static void main(String[] args) {
		
		// 独自実装<Fast Scanner>による標準入力
		// 例) 入力文字列が「ABC 123」だとしたら…
		String str = next(); // スペースが出現するまでの最初の文字列が取れる
		Long num = nextLong();
		
		// 入力値を元に、やりたいことを書く
		List<String> list = new ArrayList<>();
		
		// 出力する行が多いなら、System.out.println( str )で1行ずつ出力するより
		// バッファに詰め込んで1回で出力した方が早い
		PrintWriter out = new PrintWriter(System.out);
		for (String temp : list) {
			out.println(temp);
		}
		out.flush();
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