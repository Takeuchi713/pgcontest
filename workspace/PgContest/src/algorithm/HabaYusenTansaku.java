package algorithm;

import java.util.ArrayDeque;
import java.util.Scanner;

class Point{
	int move,x,y;
	Point(int level, int x, int y) {this.move=level; this.x=x; this.y=y;}
}
//https://atcoder.jp/contests/abc007/tasks/abc007_3
//https://jpliterature.hatenablog.com/entry/java-breadth-first-search-2 参考
public class HabaYusenTansaku {
	static Point[] D4 = {new Point(0,0,-1), new Point(0,1,0), new Point(0,0,1), new Point(0,-1,0)};
	public static void main(String[] args) {
		// inputs
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt(), C = sc.nextInt();
		int sy = sc.nextInt()-1, sx = sc.nextInt()-1, gy = sc.nextInt()-1, gx = sc.nextInt()-1;
		// map
		char[][] map = new char[R][C];
		for(int i=0;i<R;i++)
			map[i]=sc.next().toCharArray();
		// start
		ArrayDeque<Point> deque = new ArrayDeque<>();
		deque.add(new Point(0,sx,sy));
		map[sy][sx]='#';
		// search
		while(!deque.isEmpty()) {
			Point now = deque.poll();
			if(now.y==gy && now.x==gx) {
				System.out.println(now.move);
				break;
			}
			//上下左右動かす
			for(Point next : D4) {
				int ny = now.y+next.y;
				int nx = now.x+next.x;
				int nm = now.move;
				// map外は次へ
				if(ny<0 || ny>=R || nx<0 || nx>=C) continue;
				if(map[ny][nx]=='.') {
					deque.add(new Point(nm+1,nx,ny));
					map[ny][nx]='#'; //訪問済み
//					printMap(map);
				}
			}
		}
	}
	/**
	 * @param map
	 */
	public static void printMap(char[][] map) {
		for(int i=0;i<map.length;i++) {
			System.out.println("");
			for(int j=0; j<map[i].length;j++) {
				System.out.print(map[i][j]);
			}
		}
		System.out.println();
	}
}
