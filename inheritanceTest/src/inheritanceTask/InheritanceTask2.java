package inheritanceTask;



public class InheritanceTask2 {
//	메인 메서드 생성 후 객체화
//	각 메서드 출력하기
	public static void main(String[] args) {
		Person person = new Person("홍길동", 20, "서울시 강남", "01000000000");
		person.work();
		person.eat();
		person.sleep();
		
		Student student = new Student("김동건", 15, "서울시 역삼동", "01000000000", "geon");
		student.work();
		student.eat();
		student.sleep();
		
		Employee employee = new Employee("회사원1", 30, "교대역", "01012341234", 100000);
		employee.work();
		employee.sleep();
		employee.eat();
		
	}
}