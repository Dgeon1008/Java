package abstractTest;

public class Cat implements Pet{
	
	@Override
	public void sitDown() {
		System.out.println("앉으라고하면 앉지않는다.");
	}
	
	@Override
	public void waitNow() {
		System.out.println("도망간다.");
	}
	
	@Override
	public void poop() {
		System.out.println("고양이 모래");
	}
}
