package forTask;

import java.util.Scanner;

public class ForTask1 {
	public static void main(String[] args) {

//      브론즈
//      1~100까지 출력하기
//		for(int i=0;i<100;i++) {
//			System.out.println(i + 1);
//		}
//      100~1까지 출력하기
//		for(int i=100;i>0;i--) {
//			System.out.println(i);
//		}
	
//      1~100까지 중 짝수만 출력하기
//		for(int i=0;i<=100;i++) {
//			if(i % 2 ==0) {
//				System.out.println(i);
//			}
//		}
		
      
//      골드
//      1~10까지의 합을 출력하기
//		int result = 0;
//		for(int i=0; i<=10; i++) {
//			result += i;
//		}
//		System.out.println(result);
//		
//      1~n까지의 합을 출력하기
//		int result = 0;
//		String message = "정수를 입력하세요";
//		Scanner sc = new Scanner(System.in);
//		System.out.println(message);
//		int num = sc.nextInt();
//		for(int i=0; i<=num; i++) {
//			result += i;
//		}
//		System.out.println(result);
//		 
		
//      플레티넘
//      A~F까지 출력하기
//		char a = 'A'; //a가 65라는 뜻
//		for(int i=0;i<6;i++) {
//			System.out.print((char)(a + i));
//		}

//      A~F까지 중 C를 제외하고 출력하기
//		for(int i=0;i<6;i++) {
//			if(i == 2)continue;
//			System.out.print((char)(i+65));
//		}
//		
//      다이아
//      012340123401234 출력하기
//		for(int i=0;i<4;i++) {
//			for(int j=0;j<5;j++) {
//				System.out.print(j);
//			}
//		}
//      aBcDeF...Z까지 출력하기
		for(int i=0;i<26;i++) {
			if(i % 2 == 0) {
				System.out.print((char)(i+97));
			}else if(i % 2 != 0) {
				System.out.print((char)(i+65));
			}
		}
		

		
      
//      마스터
//      별찍기
//       *
//      ***
//     *****
//    *******
//   *********
//		String result = "";
//		for(int i = 0; i < 11; i+=2){
//		  for(int j = 10; j > i; j -= 2){
//			  result += " ";
//		  }
//		  for(int k = 1; k < i; k++){
//			  result += "*";
//		  }
//		  result += "\n";
//		}
//		System.out.println(result);
	}
}
