package arrayTask;

import java.util.Scanner;

public class ArrayTask1 {
	public static void main(String[] args) {
		
//      25분
	      
//      브론즈
//      10~1까지 중 짝수만 배열에 담고 출력
//		int[] arr1 = {10,9,8,7,6,5,4,3,2,1};
//		for(int i =0; i<arr1.length;i++) {
//			if(arr1[i] % 2 == 0) {
//				System.out.println(arr1[i]);
//			}
//		}
		
//      1~10까지 배열에 담고 출력
//		int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
//		for(int i =0; i<arr2.length;i++) {
//			System.out.println(arr2[i]);
//		}

//      1~100까지 배열에 담은 후 홀수만 출력
//		int[] arr3 = new int[100];
//		for(int i = 0; i <100; i++) {
//			arr3[i] = i+1;
//			if(arr3[i] % 2 != 0) {
//				System.out.println(arr3[i]);
//			}
//		}
		
//      실버
//      1~100까지 배열에 담은 후 짝수의 합 출력
//		int[] arr4 = new int[100];
//		int result = 0;
//		for(int i = 0; i <100; i++) {
//			arr4[i] = i+1;
//			if(arr4[i] % 2 == 0) {
//				result += arr4[i];
//			}
//		}
//		System.out.println(result);
		
//      A~F까지 배열에 담고 출력
//		char a = 'A';
//		char[] arr5 = new char[6];
//		for(int i=0;i<arr5.length;i++) {
//			arr5[i] = (char)(i+a);
//			System.out.println(arr5[i]);
//		}
		
//      A~F까지 중 C를 제외하고 배열에 담은 후 출력
//		char a = 'A';
//		char c = 'C';
//		int[] arr6 = new int[6];
//		for(int i=0;i<arr6.length;i++) {
//			arr6[i] = i;
//			if(arr6[i] == 2) continue;
//			char result = (char)(arr6[i]+a);
//			System.out.println(result);
//		}
		
		// 5개 정수를 입력해주세요
		String message = "5개 정수를 입력해주세요";
		int num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println(message);
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		num4 = sc.nextInt();
		num5 = sc.nextInt();
		
		int[] arr7 = new int[5];
		int result1 = 0, result2 = 0;

		for(int i=0;i<arr7.length;i++) {
			arr7[0] = num1;
			arr7[1] = num2;
			arr7[2] = num3;
			arr7[3] = num4;
			arr7[4] = num5;
			if(arr7[i] > result1) {
				result1 = arr7[i];
			}
			if(arr7[i] < result2) {
				result2 = arr7[i];
			}
		}
		System.out.println("최댓값 " + result1);
		System.out.println("최솟값 " + result2);

		
		
	}
}
