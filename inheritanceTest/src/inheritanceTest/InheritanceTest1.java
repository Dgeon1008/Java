package inheritanceTest;

class A {
	String name;
	int data;
	
//	기본 생성자
	public A() {
		System.out.println(this);
		System.out.println("부모 생성자 호출");
		this.name = "A";
		this.data = 10;
	}
	
	void printName() {
		System.out.println(name);
	}
	
}

class B extends A{
//	String name;
//	int data;
	public B() {
//		생성자를 호출할때 부모를 먼저 호출한다(생략가능) 주소값을통해 접근할 수 있다.
		super();
		System.out.println(this);
		System.out.println("자식 생성자 호출");
	}
//	메서드는 저장공간
	void printData() {
		System.out.println(data);
	}
	
	
}

public class InheritanceTest1 {
	public static void main(String[] args) {
//		부모를 먼저 메모리에 올린다
		B b = new B();
		b.printName();
		b.printData();
		System.out.println(b);
		
		}
}















