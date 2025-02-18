package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamTask {
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		IntStream.rangeClosed(1,10).forEach(numbers::add);
		numbers.forEach(System.out::println);
		
		
		String data = "ABCDEF";
//		data.chars().forEach((c) -> {System.out.println((char)c);});
		
		ArrayList<Integer> numbers2 = new ArrayList<Integer>();
//		IntStream.rangeClosed(1, 100).filter((n) -> n % 2 == 0).forEach(System.out::println);   			
		
		data.chars().filter((n) -> n != 'D').forEach((c) -> {System.out.println((char)c);});

	}
}
