package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamTask {
	public static void main(String[] args) {
		
//		1) 1~10까지 ArrayList에 담고 출력하기
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		IntStream.rangeClosed(1,10).forEach(numbers::add);
		numbers.forEach(System.out::println);
		
//		2) ABCDEF를 각 문자별로 출력하기
		String data = "ABCDEF";
		data.chars().forEach((c) -> {System.out.println((char)c);});
		
//		3) 1~100까지 홀수만 ARrayList에 담고 출력하기
		ArrayList<Integer> numbers2 = new ArrayList<Integer>();
		IntStream.rangeClosed(1, 100).filter((n) -> n % 2 != 0).forEach(numbers2::add);
		numbers2.forEach(System.out::println);
		
//		4) A~F 중 D를 제외하고 ArrayList에 담고 출력하기
		ArrayList<Character> datas2 = new ArrayList<Character>();
		IntStream
			.rangeClosed('A', 'E')
			.map(c -> c > 67 ? c + 1 : c)
			.forEach(c -> datas2.add((char)c));
		datas2.forEach(System.out::println);
		
	}
}
