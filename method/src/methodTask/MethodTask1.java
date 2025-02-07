package methodTask;

public class MethodTask1 {

//  1~10까지 println으로 출력하는 메서드
//  "홍길동" 이름을 n번 println()으로 출력하는 메서드
	void printNum() {
		for(int i = 0; i<10; i++) {
			System.out.println(i+1);
		}
	}
		
	void printName(int num) {
		for(int i = 0; i < num; i++) {
//			기능은 return 값에 넣지 않는다
			System.out.println("홍길동");
		}
	}
	
	
	public static void main(String[] args) {
		MethodTask1 mt = new MethodTask1();
		mt.printNum();
		mt.printName(10);
	}
	
//  결과를 콘솔에 출력하기
}
