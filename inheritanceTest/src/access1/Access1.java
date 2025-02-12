package access1;

public class Access1 {
//	default 다른 패키지에서는 접근할 수 없다.
	int data1;
	public int data2;
//	상속받은 자식은 다른 패키지에 있더라도 접근 가능
	protected int data3;
	
//	다른 클래스에서도 접근 불가
//	직접 접근하지 않게하기 위해
//	메서드를 만들고 getter와 setter를 만들어야한다.
	private int data4;
	
	public Access1() {;}
	
	public int getData4() {
//		값을 갖고오기때문에 getter라고 부른다.
		return data4;
	}
	
	public void setData4(int data4) {
//		 
		this.data4 = data4;
	}
}
