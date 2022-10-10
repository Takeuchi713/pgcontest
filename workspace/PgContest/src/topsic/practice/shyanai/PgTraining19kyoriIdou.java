package topsic.practice.shyanai;

import java.util.ArrayDeque;
import java.util.Scanner;

class Point {
	int x, y, move;
	Point(int x, int y, int move){this.x=x; this.y=y; this.move=move;}
}

public class PgTraining19kyoriIdou {
	static Point[] D4 = {new Point(0,-1,0), new Point(0,1,0), new Point(-1,0,0), new Point(1,0,0)};
	public static void main(String[] args) {
		// inputs
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt(),	C = sc.nextInt();
		char[][] map = new char[R][C];
		int sx=0, sy=0, gx=0, gy=0;
		// map
		for(int i=0; i<R; i++) {
			map[i] = sc.next().toCharArray();
			for(int j=0; j<C; j++) {
				if(map[i][j]=='S') {
					sy=i; sx=j;
				}
				if(map[i][j]=='T') {
					gy=i; gx=j;
				}
			}
		}
		// start
		ArrayDeque<Point> deque = new ArrayDeque<>();
		deque.add(new Point(sx,sy,0));
		map[sy][sx]='.';
		// 取り出して動かす
		while(!deque.isEmpty()) {
			Point now = deque.pop();
			// ゴール
			if(now.x==gx && now.y==gy) {
				System.out.println(now.move);
				break;
			}
			// 上下左右へ移動
			for(Point next : D4) {
				int nx=now.x + next.x;
				int ny=now.y + next.y;
				int nm=now.move;
				// out-of-range or wall
				if(nx<0 || nx>=C || ny<0 || ny >= R) continue;
				if(map[ny][nx]!='.') {
					deque.add(new Point(nx,ny,nm+1));
					map[ny][nx]='.'; // visited
//					printMap(map);
				}
			}
		}
	}
	
	public static void printMap(char[][] map) {
		for(int i=0;i<map.length;i++) {
			System.out.println();
			for(int j=0;j<map[i].length;j++) {
				System.out.print(map[i][j]);
			}
		}
		System.out.println();
	}
}
