package inputTask;

import java.util.Scanner;

public class InputTask1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message1 = "두 정수를 입력하세요", message2 = "두 정수의 합";
		int num1 = 0, num2 = 0, result = 0;
		
		System.out.println(message1);
		num1 = Integer.parseInt(sc.next());
		num2 = Integer.parseInt(sc.next());
		result = num1 + num2;
		System.out.println(message2 + " : " + result);

	}
}
