package abstractTest;

//abstract 추상클래스는 추상 메서드를 가질 수 있다.
public abstract class Electronics {
//	추상 메서드
//	있을거같은데? 라서 구현할 수 없다
	public abstract void on();
	public abstract void off();
	
//	상수 : final
	public final void safe() {
		System.out.println("안전장치 가동");
	}
	
	
}
