package variableTest;

public class FormatTest {
	public static void main(String[] args) {
		String name = "김동건";
		int age = 26;
		double height = 183.3;
		
		System.out.printf("이름 : %s\n", name);
		System.out.printf("나이 : %d\n", age);
		System.out.printf("몸무게 : %.1fcm", height);
	}
}
