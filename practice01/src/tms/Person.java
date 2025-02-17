package tms;

import java.util.Objects;

public class Person {
	private long id;
	private String name;
	private int age;
	private String call;
	private String job;
	
	public Person() {;}

	public Person(long id, String name, int age, String call, String job) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.call = call;
		this.job = job;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCall() {
		return call;
	}

	public void setCall(String call) {
		this.call = call;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", call=" + call + ", job=" + job + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, call, id, job, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(call, other.call) && id == other.id && Objects.equals(job, other.job)
				&& Objects.equals(name, other.name);
	}
	
	public void work() {
		System.out.println(job + " 하루종일 일을한다.");
	}
	
		
}
