package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTest {
	public static void main(String[] args) {
//		IntStream : 시작점부터 끝점까지 정해준다. 1씩 증가
		IntStream.range(0, 10); // 0 ~ 9까지

//		forEach는 중괄호 생락하면 안된다
//		IntStream.range(0, 10).forEach((num) -> {System.out.println(num); });
//		IntStream.range(0, 10).forEach(System.out::println);
		
//		asList 값을 알고있을때 값을 넣어준다.
		ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));              	
//		IntStream.rangeClosed(1, 10).forEach((num) -> datas.add(num));
//		IntStream.rangeClosed(1, 10).forEach(datas::add);
		
//		참조형
//		소속::메서드
//		datas.forEach(System.out::println);
		
//		10 ~ 1까지 ArrayList에 만들고, 만든 ArrayList에 값을 담고(add)
//		모두 출력하기
		ArrayList<Integer> datas2 = new ArrayList<Integer>();
		IntStream.range(0, 10).forEach((num) -> {
			datas2.add(10 - num);
		});
//		datas2.forEach(System.out::println);
		
//		datas2 인덱스 0부터 4까지 삭제
//		IntStream.range(0,5).forEach(datas2::remove);
		IntStream.range(0,5).forEach((num) -> {
			datas2.remove(0);
		});
//		datas2.forEach(System.out::println);
		
//		문자열 stream
//		chars() : 문자열을 IntStream으로 변환
		String data3 = "ABCDEFG";
		String data4 = "ㄱㄴㄷㄹ";
//		data3.chars().forEach(System.out::println);;
		
//		data4.chars().forEach((c) -> {System.out.println((char)c);});;   
		
//		.map()
//		data4.chars().map((c) -> c + 4).forEach((c) -> {System.out.println((char)c);});
		
		User user1 = new User(1, "김동건", 26, "개발자");
		User user2 = new User(2, "김동건2", 27, "뮤지컬배우");
		User user3 = new User(3, "김동건3", 28, "가수");
		User user4 = new User(4, "김동건4", 29, "건축가");
		User user5 = new User(5, "김동건5", 30, "건물주");
		
//		직업만 출력하기
		ArrayList<User> users = new ArrayList<User>();
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		users.add(user5);
		
//		users.forEach(System.out::println);
//		users.stream().map((user) -> user.getJob()).map((job) -> "직업: " + job).forEach(System.out::println);
//		users.stream().map(User::getJob).map((job) -> "직업: " + job).forEach(System.out::println);
		
//		유저의 나이만 출력하기, 참조형X
		users.stream().map((user) -> user.getAge()).forEach((age) -> {
//			System.out.println(age);
		});
//		users.stream().map((user) -> user.getAge()).map((age) -> "나이: " + age).forEach(System.out::println);
		
//		실습
//		"/news", "/game", "/brand", "/rank"
//		ArrayList에 담고, 모든 경로앞에 "/app"을 붙여준다.
		ArrayList<String> urls = new ArrayList<String>();
		urls.add("/news");
		urls.add("/game");
		urls.add("/brand");
		urls.add("/rank");
		
//		uri.forEach(System.out::println);
//		urls.stream().map((url) -> "/app" + url).forEach(System.out::println);
		
//		정렬 : sorted ((a,b) -> a-b)
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 10, 6, 4, 8));
//		오름차순
		numbers.stream().sorted().forEach(System.out::println);
//		내림차순
		numbers.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
		
//		결과값의 리턴을 다양한 타입으로 리턴 : collect(Collector.~());
		ArrayList<Integer> numbers2 = new ArrayList<Integer>(Arrays.asList(1, 10, 6, 4, 8));
		List<Integer> list =  numbers2.stream().map((n) -> n + 10).collect(Collectors.toList());
		System.out.println(list.toString());
		
//		문자열로 바꾸기
		ArrayList<Integer> numbers3 = new ArrayList<Integer>(Arrays.asList(1, 10, 6, 4, 8));
		String str = numbers3.stream().sorted().map(String::valueOf).collect(Collectors.joining(", "));
		System.out.println(str);
		
//		filter()
		ArrayList<Integer> numbers4 = new ArrayList<Integer>(Arrays.asList(1, 10, 6, 4, 8));
		ArrayList<Integer> even = new ArrayList<Integer>();
		numbers4.stream().filter((n) -> n % 2 == 0).forEach(even::add);
		even.forEach(System.out::println);
		
		
		
		
	}
}

















