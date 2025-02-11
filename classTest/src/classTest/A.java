package classTest;

public class A {
	// 멤버변수, 필드변수라고 부른다.
	int data;
	
	// 기본 생성자
	// 아무것도 건들이지마 return하지마
	public A() {;}
	
	// 값을 초기화 시키기 위한 생성자
	// 생성자
	public A(int data) {
		this.data = data;
	}
	
	void printData() {
		System.out.println(this);
		System.out.println(this.data);
	}
	
	
	public static void main(String[] args) {
		A a = new A(10);
		A b = new A(20);
//		System.out.println(a.data);
//		System.out.println(b.data);
		a.printData();
		b.printData();
	}
	
}
