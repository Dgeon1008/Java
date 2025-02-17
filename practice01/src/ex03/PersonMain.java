package ex03;

public class PersonMain {
	
	public static void main(String[] args) {
//		객체화
		Person person = new Person();
				
//		student 업캐스팅, 객체화
		Person stUp = new Student("김학생", 18, "학생", "공부", 20191234);
//		programmer 업캐스팅, 객체화
		Person prUp = new Programmer("김회사원",30,"회사원","게임",true);
		
//		student 다운캐스팅
		Student stDown = (Student)stUp;
//		programmer 다운캐스팅
		Programmer prDown = (Programmer)prUp;
		
		stDown.work();
		stDown.hobby();
		stDown.printNumber();
		
		prDown.work();
		prDown.hobby();
		prDown.checkNotebook();
	}
}
