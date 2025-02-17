package ex03;

import java.util.Objects;

public class Student extends Person{
	private int id;
	
	public Student() {;}

	public Student(String name, int age, String job, String hobby, int id) {
		super(name, age, job,hobby);
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(id);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return id == other.id;
	}
	
	@Override
	public void work() {
		System.out.println(getJob() + "은 공부를 합니다.");
	}
	
	@Override
	public void hobby() {
		for(int i = 0;i<10;i++) {
			System.out.print(i + 1 + " ");
		}
		System.out.println();
	}
	
	public void printNumber() {
		System.out.println("학생의 이름은 " + getName() + "이며, " + "학번은 " + id + "입니다.");
	}
	
	
	
	
	
}
