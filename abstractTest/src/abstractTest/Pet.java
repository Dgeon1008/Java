package abstractTest;

public interface Pet {
//	인터페이스는 상수와 추상메서드만 사용가능
	final static String nation = "한국";
	
	public void sitDown();
	public void waitNow();
	public void poop();
}
