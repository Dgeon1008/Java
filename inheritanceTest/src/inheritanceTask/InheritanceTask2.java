package inheritanceTask;

//상속 및 분리 실습
// Person 클래스
// 이름, 나이, 주소, 핸드폰 번호
// work 일을 한다.
// sleep 잠을 잔다.
// eat 세 끼를 먹는다
class Person {
	String name;
	int age;
	String address;
	String phone;
	public Person() {;}
	public Person(String name, int age, String address, String phone) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.phone = phone;
	}

	void work() {
		System.out.println("일을 한다.");
	}
	void sleep() {
		System.out.println("잠을 잔다.");
	}
	void eat() {
		System.out.println("세 끼를 먹는다");
	}
}
// Student 클래스
// 인스타아이디
// work 아르바이트를 한다
// sleep 수업 시간에 잠을 잔다
// eat 아침을 거른다
class Student extends Person{
	String instaId;
	public Student() {;}
	public Student(String name, int age, String address, String phone, String instaId) {
		super(name, age, address, phone);
		this.instaId = instaId;
	}
	@Override
	void work() {
		System.out.println("아르바이트를 한다.");
	}
	@Override
	void sleep() {
		System.out.println("수업 시간에 잠을 잔다.");
	}
	@Override
	void eat() {
		System.out.println("아침을 거른다.");
	}
	
}
// Employee 클래스
// 비상금
// work 하루 종일 일을 한다
// sleep 잠을 설친다
// eat 야식을 먹는다
class Employee extends Person{
	int money;
	public Employee() {;}
	public Employee(String name, int age, String address, String phone, int money) {
		super(name, age, address, phone);
		this.money = money;
	}
	@Override
	void work() {
		System.out.println("하루 종일 일을 한다.");
	}
	@Override
	void sleep() {
		System.out.println("잠을 설친다.");
	}
	@Override
	void eat() {
		System.out.println("야식을 먹는다.");
	}
	
}


public class InheritanceTask2 {
//   메인 메서드 생성 후 객체화
//   각 메서드 출력하기
	public static void main(String[] args) {
		Person ps = new Person("김동건", 26, "불광동", "01012345687");
		Student sd = new Student("학생1", 18, "연신내", "01012345687","geon");
		Employee ep = new Employee("회사원1", 30, "녹번", "01012345687", 2_000_000);
		
		System.out.println(ps.name + "의 하루");
		ps.work();
		ps.eat();
		ps.sleep();
		
		System.out.println("\n" + sd.name + "의 하루");
		System.out.println("인스타 아이디 : " + sd.instaId); 
		sd.work();
		sd.eat();
		sd.sleep();
		
		System.out.println("\n" + ep.name + "의 하루");
		System.out.println("비상금 : " + ep.money + "원");
		ep.work();
		ep.eat();
		ep.sleep();
				
				
	}
}
