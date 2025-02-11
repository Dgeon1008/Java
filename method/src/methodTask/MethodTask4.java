package methodTask;

import java.util.Scanner;

public class MethodTask4 {

//  1) 문자열을 입력 받고 원하는 문자의 개수를 구해주는 메소드
	int inputStringToFindChar(String inputString, char c) {
		int count = 0;
		for (int i = 0; i < inputString.length(); i++) {
			if (inputString.charAt(i) == c) {
				count++;
			}
		}
		return count;
	}

//  2) 5개의 정수를 입력 받은 후 원하는 인덱스의 값을 구해주는 메소드
	int fiveNum(int[] arr, int index) {
		return arr[index];
	}

//  3) 한글을 정수로 바꿔주는 메소드 (일공이사 -> 1024)
	String changeToInteger(String hangle) {
//		.indexOf('일') : 값이 있으면 그 index 값을 리턴
		String hangles = "공일이삼사오육칠팔구";
		String result = "";

		for (int i = 0; i < hangle.length(); i++) {
			result += hangles.indexOf(hangle.charAt(i));
		}
		return result;
	}

//  4) 5개의 정수를 입력받고 최댓값과 최솟값을 구해 값을 반환해주는 메소드
	int[] maxMin(int[] arr) {
		int max = arr[0];
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			// 최댓값
			if (arr[i] > max) {
				max = arr[i];
			}
			// 최솟값
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return new int[] { max, min };
	}

//  5) 5개의 정수를 입력받고 최댓값과 최솟값을 구해주는 기능을 가진 메소드(void)
//	매개 변수 2개, 최솟값과 최댓값을 구할 배열, 최솟값과 최댓값을 구한 결과를 담을 배열
//	출력은 기능 기능은 값이 아니라 리턴하지않는다
//	return값이 없을때는 바로 사용한다
	void maxMinVoid(int[] arr2, int[] arr3) {
		int max = arr2[0];
		int min = arr2[0];

		for (int i = 1; i < arr2.length; i++) {
			if (arr2[i] > max) {
				max = arr2[i];
			}
			if (arr2[i] < min) {
				min = arr2[i];
			}
		}
		arr3[0] = max;
		arr3[1] = min;
	}

	
//  6) String 클래스의 indexOf()메소드 만들기, 문자열 전체와 검색할 문자를 전달 받는다.
	int indexOf(String content, char c) {
		for(int i = 0; i < content.length(); i++) {
			if(content.charAt(i) == c) {
				return i;
			}
		}
		return -1;
	}
		   

	
	
	public static void main(String[] args) {
		MethodTask4 mt4 = new MethodTask4();
		Scanner sc = new Scanner(System.in);
		String str1 = null, str3 = null, result = "", inputString = null;
		char str2 = ' ', c = ' ', inputChar = ' ';
		int count = 0, num1 = 0, num2 = 0, index = 0, num3 = 0, index2 = 0;

//		1번 문제
//		System.out.print("문자열 입력 : ");
//		str1 = sc.nextLine();
//		System.out.print("원하는 문자 입력 : ");
//		str2 = sc.next().charAt(0);
//		count = mt4.inputStringToFindChar(str1, str2);
//		System.out.println(count);

//		2번 문제
//		System.out.print("5개 정수 입력: ");
//		int[] arr = new int[5];
//		for (int i = 0; i < 5; i++) {
//		    arr[i] = sc.nextInt();
//		}
//		System.out.print("원하는 인덱스의 위치: ");
//		num2 = sc.nextInt();
//
//		index = mt4.fiveNum(arr, num2);
//		System.out.println("해당 인덱스 값: " + index);
//		
////		3번 문제
//		System.out.println("숫자를 한글로 입력해주세요 ex)일공이사"); 
//		str3 = sc.nextLine(); 
//		result = mt4.changeToInteger(str3);
//		
//		num3 = Integer.parseInt(result);
//		System.out.println(num3);
		

//		4번 문제
//		System.out.print("5개 정수를 입력하세요: ");
//		int[] arr = new int[5];
//		for (int i = 0; i < 5; i++) {
//		    arr[i] = sc.nextInt();
//		}
//		int[] result2 = mt4.maxMin(arr);
//		System.out.println("최댓값: " + result2[0] + "\n최솟값: " + result2[1]);
		
//		5번 문제
//		System.out.print("5개 정수를 입력하세요: ");
//		int[] arr2 = new int[5];
//		for (int i = 0; i < 5; i++) {
//			arr2[i] = sc.nextInt();
//		}
//		int[] arr3 = new int[2];
//		주소값을 넘긴다
//		mt4.maxMinVoid(arr2, arr3);
//		System.out.println("최댓값: " + arr3[0] + "\n최솟값: " + arr3[1]);

//		6번 문제
	    int result6 = mt4.indexOf("apple", 'e');
	    System.out.println(result6 + "번째 인덱스의 위치 ");

        
	}
}
