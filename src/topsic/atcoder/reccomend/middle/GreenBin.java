package topsic.atcoder.reccomend.middle;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GreenBin {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    Map<String,Integer> map = new HashMap<>();
    char[] chars;
    long count=0;
    String temp="";
    for(int n=0;n<N;n++){
      chars=sc.next().toCharArray();
      Arrays.sort(chars);
      temp = new String(chars);
      if(map.get(temp)!=null){
        map.replace(temp,map.get(temp)+1);
      } else {
        map.put(temp,1);
      }
    }
    count += map.values().stream().filter(v->v>1).mapToLong(v->calcCombination(v, 2)).sum();
    System.out.println(count);
    sc.close();
  }

  // nCrを計算
  private static long calcCombination(int n, int r){
    long result = 1;
    for(int i=1;i<=r;i++){
      result = result*(n-i+1)/i;
    }
    return result;
  }
}
