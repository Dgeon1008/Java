package operTask;

import java.util.Scanner;

public class OperTask1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String message = "숫자를 입력하세요", result = null;
		double num1 = 0.0;
		
		System.out.println(message);
		num1 = sc.nextDouble();
		
		result = num1 % 1 == 0 ? "입력한 값은 정수입니다." 
				: "입력한 값은 실수입니다.";
		System.out.println(result);
	}
}
