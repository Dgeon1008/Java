package lambdaTask2;

public class LambdaResult2 {

	public static void main(String[] args) {
	//  1) 1~10까지 출력해주는 람다구현 PrintNum, printUpTo10()
		PrintNum pn = () -> {
			for(int i=0;i<10;i++) {
				System.out.println(i+1);
			}	
		};
		pn.printUpTo10();
		
	//  2) 문자열과 문자형을 전달하면 해당 문자의 개수를 구해주는 람다 구현 PrintString, strCount()
		PrintString ps = (inputString, inputChar) -> {
			int count = 0;
			for(int i = 0; i<inputString.length(); i++) {
				if(inputString.charAt(i) == inputChar) {
					count ++;
				}
			};
			return count;
		};
		System.out.println(ps.strCount("rlaehdrjs", 'r'));
		
	//  3) 문자열을 받으면 뒤집은 문자열을 리턴해주는 람다구현 Reverse, reverseString()
		Reverse rv = (inputString) -> {
			String result = "";
			for(int i = 0; i<inputString.length(); i++) {
				result += inputString.charAt(inputString.length() - i - 1);
			};
			return result;
		};
		System.out.println(rv.reverseString("rlaehdrjs"));

	//  4) 문자열과 문자형을 받으면 해당 문자를 모두 지워주는 람다구현 Remove, removeStr()
		Remove rm = (inputString, inputChar) -> {
			String result = " ";
			for(int i = 0; i<inputString.length(); i++) {
				if(inputString.charAt(i) != inputChar) {
					result += inputString.charAt(i);
				}
			};
			return result;
		};
		System.out.println(rm.removeStr("rlaehdrjs", 'r'));
		
	//  5) 문자열에서 중복된 값을 모두 없애고 리턴해주는 람다구현 Dedupe, getDedupe()
	//  ex) "가나다가나다라가나다라마바사" -> "가나다라마바사"
		Dedupe dd = (inputString) -> {
			String result = "";
			for(int i = 0; i<inputString.length(); i++) {
				if(!result.contains(String.valueOf(inputString.charAt(i)))) {
					result += String.valueOf(inputString.charAt(i));
				}
			}
			return result;
		};
		System.out.println(dd.getDedupe("가나다가나다라가나다라마바사"));
		
		
	}
}
