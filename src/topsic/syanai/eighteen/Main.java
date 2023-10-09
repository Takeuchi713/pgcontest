package topsic.syanai.eighteen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;
/*
問題
整数 N が与えられます。
N 以下の 3 つの正の整数 
A,B,C の組であって、二次方程式 Ax2+Bx+C=0 に実数解が存在するようなものの個数を求めてください。
なお、この方程式が実数解を持つことは 
B2 −4AC≥0 であることと同値であることが知られています。
制約
1≤N≤2000
*/
public class Main {
    static List<int[]> pattern = new ArrayList<>();
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        
        // 組み合わせを作る
        createCombination(N);
        // 一旦確認
        //pattern.forEach(array -> System.out.println(Arrays.toString(array)));
        
        // B2 - 4AC >= 0を満たすかチェック
        long sum = checkFormula();
        System.out.println(sum);
    }
    
    public static long checkFormula() {
    	long sum = 0L;
    	for(int[] array: pattern) {
    		if(Math.pow(array[1],2)-4*array[0]*array[2]>=0) {
    			sum++;
    			System.out.println(Arrays.toString(array));
    		}
    	}
    	return sum;
    }
    
    public static void createCombination(int n){
        int base[] = IntStream.range(1,n+1).toArray();
        int result[] = new int[n];
        boolean used[] = new boolean[n];
        create(base,result,used,0);
    }
    
    public static void create(int[] base, int[] result, boolean[] used, int idx){
        // 終わり
        if(idx == base.length){
            pattern.add(Arrays.copyOf(result, result.length));
            return;
        }

        for(int i=0; i<base.length; i++){
            if(used[i]){
                continue;
            }
            result[idx] = base[i];
            used[i] = true;
            create(base,result,used,idx+1);
            used[i] = false;
        }
    }
}