package classTest;

public class Student {
//	학생의 학번, 이름, 국어점수, 영어점수, 수학점수를 입력 받고
//	총점과 평균을 출력하기
	String StudentNums, name;
	int korScore, mathScore, totalScore, avr;
	
	//기본 생성자
	public Student() {;}
	
	public Student(String StudentNums, String name, int korScore, int mathScore) {
		this.StudentNums = StudentNums;
		this.name = name;
		this.korScore = korScore;
		this.mathScore = mathScore;

	}
	
	public static void main(String[] args) {
		// 필드선언을 하면 생성자를 통해서 접근가능하다
		Student man = new Student("201920098", "김동건", 90, 100);
		
		man.totalScore += man.korScore;
		man.totalScore += man.mathScore;
		
		System.out.println(man.totalScore);
		
	}
}
