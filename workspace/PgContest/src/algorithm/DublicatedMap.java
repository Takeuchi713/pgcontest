package algorithm;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DublicatedMap {
	// 配列要素の重複SETを取得する
	public static void main(String[] args) {
		long[] array1 = {1,2,3};
		long[] array2 = {4,5,6};
		long[] array3 = {7,8,9};
		List<long[]> list = Arrays.asList(array1,array2,array3);
//		findDuplicates(list);
		//そもそもList<Array>をArrayへ展開したい
//		long[] array = new Long[list.size()];
//		long[] array = list.toArray(array);
	}
	// from ListOfArrays
	public static void findDuplicates(List<long[]> list) {
		Map<Object, Long> map= Stream.of(list.toArray()).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		for(Map.Entry<Object,Long> entry : map.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			
		}
	}
	
	// from int[]
	public static Set<Integer> findDuplicates(int[] arr) {
		Map<Integer, Long> frequencies = Arrays.stream(arr).boxed()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		return frequencies.keySet().stream().filter(key -> frequencies.get(key) > 1).collect(Collectors.toSet());
	}
}
