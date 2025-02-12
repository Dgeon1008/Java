package lambdaTask;

public class LambdaResult {
	public static void main(String[] args) {
//		람다식 구현해서 성과 이름을 전달하고 전체 이름을 콘솔에 출력하기		
		PrintName lambdaResult = (lastName, firstName) -> {
			return lastName + firstName;
		};
		System.out.println(lambdaResult.name("김","동건"));
	}
}
