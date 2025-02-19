package stream;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.Arrays;

public class StreamTask3 {
	String name;
	String hob;
	String intro;
	
	
	
	public StreamTask3(String name, String hob, String intro) {
		this.name = name;
		this.hob = hob;
		this.intro = intro;
	}



	public static void main(String[] args) {
		
//      1) 1~10까지 ArrayList에 담고 출력하기
//		ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
//		datas.stream().forEach(System.out::println);

//      2) 1~10을 ArrayList에 담고 홀수만 모두 출력하기
//		ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
//		datas.stream().filter((n) -> n % 2 != 0).forEach(System.out::println);
		
//      3) 1~10까지 ArrayList에 짝수만 담고 출력하기
//		ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
//		datas.stream().filter((n) -> n % 2 == 0).forEach(System.out::println);
		
//      4) a~z까지 ArrayList에 담고 출력하기
		ArrayList<Character> datas = new ArrayList<Character>();
		
//      5) a~z까지 ex) aceg... 하나씩 건너뛰고 ArrayList에 담고 출력하기
//      6) 1~30까지 ArrayList에 담고 10~20만 출력하기
//      7) 1~10까지 ArrayList에 담고 짝수만 모두 더해서 출력하기
//      8) "hello", "java", "apple", "test" 문자열들을 ArrayList에 담고 'a'를 포함하고 있는 단어만 출력하기
//      9) 1~10까지 ArrayList에 담고 모든 합을 출력하기
//      10) ArrayList에 있는 모든 값을 더한 후 출력 {10, 20, 30, 40, 50, 60}
		
		

		
	//  1) ArrayList에 있는 모든 값을 더한 후 출력 {10, 20, 30, 40, 50, 60}
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50, 60));	
		
//		datas.stream().map((data) -> num += data);
		int data = numbers.stream().reduce(0, (a, b) -> a + b);
		System.out.println(data);
	//  2) 각각의 Member가 들어가 있는 ArrayList<Member>가 존재한다.
	//  모든 Member의 취미를 검토하여, 개발을 좋아하는 사람의 데이터를 출력한다.
	//
	//  필드 : 이름, 취미, 소개
	//  홍길동, 축구_농구_야구, 나는 축구왕!
	//  이순신, 개발_당구_축구, 나는 개발자 좋아!
	//  장보고, 피아노, 피아노만 한 우물!
	//  김철수, 스포츠댄스_개발, 취미로 춤을 춘다 ~
	//  김영희, 골프_야구, 운동 선수는 나의 꿈
	//  흰둥이, 개발_축구_농구, 개발도 운동도 다 잘해요!
//		StreamTask3 member1 = new StreamTask3("홍길동", "축구_농구_야구", "나는 축구왕!");
//		StreamTask3 member2 = new StreamTask3("이순신", "개발_당구_축구", "나는 개발자 좋아!");
//		StreamTask3 member3 = new StreamTask3("장보고", "피아노", "피아노만 한 우물!");
//		StreamTask3 member4 = new StreamTask3("김철수", "스포츠댄스_개발", "취미로 춤을 춘다 ~");
//		StreamTask3 member5 = new StreamTask3("김영희", "골프_야구", "운동 선수는 나의 꿈");
//		StreamTask3 member6 = new StreamTask3("흰둥이", "개발_축구_농구", "개발도 운동도 다 잘해요!");
//		
//		ArrayList<Member> members = new ArrayList<Member>(Arrays.asList(member1, member2, member3,member4,member5,member6)); 		

		
//		members.forEach(System.out::println);

		
		
	}


}


















