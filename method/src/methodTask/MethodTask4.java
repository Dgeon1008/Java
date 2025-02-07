package methodTask;

import java.util.Scanner;

public class MethodTask4 {
	
//  1) 문자열을 입력 받고 원하는 문자의 개수를 구해주는 메소드
	int inputStringToFindChar(String inputString, char c) {
		int count = 0;
		for(int i = 0; i<inputString.length();i++) {
			if(inputString.charAt(i) == c) {
				count ++;
			}
		}
		return count;
	}
//  2) 5개의 정수를 입력 받은 후 원하는 인덱스의 값을 구해주는 메소드
	int fiveNum(int[] arr, int index) {
		return arr[index];
	}
	
	
//  3) 한글을 정수로 바꿔주는 메소드 (일공이사 -> 1024)
//	void changeToInteger(String hangle) {
//		switch(hangle) {
//		case 0
//		}
//	}
	
//  4) 5개의 정수를 입력받고 최댓값과 최솟값을 구해 값을 반환해주는 메소드
//  5) 5개의 정수를 입력받고 최댓값과 최솟값을 구해주는 기능을 가진 메소드(void)
//	매개 변수 2개, 최솟값과 최댓값을 구할 배열, 최솟값과 최댓값을 구한 결과를 담을 배열
//  6) String 클래스의 indexOf()메소드 만들기, 문자열 전체와 검색할 문자를 전달 받는다. 
	
	public static void main(String[] args) {
		MethodTask4 mt4 = new MethodTask4();
		Scanner sc = new Scanner(System.in);
		String str1 = null; 
		char str2 = ' ', c = ' ';
		int count = 0, num1 = 0, num2 = 0, index = 0;
		
//		1번 문제
//		System.out.print("문자열 입력 : ");
//		str1 = sc.nextLine();
//		System.out.print("원하는 문자 입력 : ");
//		str2 = sc.next().charAt(0);
//		count = mt4.inputStringToFindChar(str1, str2);
//		System.out.println(count);
		
//		2번 문제
		System.out.print("5개 정수 입력 : ");
		num1 = sc.nextInt();
		int[] arr = new int[num1];
		System.out.print("원하는 인덱스의 위치 : ");
		num2 = sc.nextInt();

		index = mt4.fiveNum(arr, num2);
		System.out.println(index);
		

	}
}
