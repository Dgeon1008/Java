package inputTest;

import java.util.Scanner;

public class InputTest1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message = "이름을 입력하세요", lastName = null, firstName = null, name = null;
		
		System.out.println(message);
//		name = sc.next();
		// 띄어쓰기 기준으로 입력을 인식함
//		lastName = sc.next();
//		firstName = sc.next();
//		name = lastName + firstName;
//		입력
		name = sc.nextLine();
		
		System.out.println(name + "님 환영합니다.");
	}
}
