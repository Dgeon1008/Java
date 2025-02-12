package abstractTest;

public class WashingMachine extends Electronics{
//	Electronics에서 메소드의 선언부가 없어서 메모리가 부족하여 에러가 뜬다.
//	추상 클래스를 사용하면 강제성을 부여한다.
	@Override
	public void off() {
		System.out.println("버튼 눌러서 실행");
	}
	@Override
	public void on() {
		System.out.println("버튼 눌러서 전원 끄기");
	}
}
