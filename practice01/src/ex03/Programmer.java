package ex03;

import java.util.Objects;

public class Programmer extends Person{
	private boolean notebook;	
	
	public Programmer() {;}

	public Programmer(String name, int age, String job, String hobby,boolean notebook) {
		super(name, age, job, hobby);
		this.notebook = notebook;
	}
	
	@Override
	public String toString() {
		return "Programmer [notebook=" + notebook + "]";
	}

	public boolean isNotebook() {
		return notebook;
	}

	public void setNotebook(boolean notebook) {
		this.notebook = notebook;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(notebook);
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
		Programmer other = (Programmer) obj;
		return notebook == other.notebook;
	}
	
	@Override
	public void work() {
		System.out.println(getJob() + "은 코딩을 합니다.");
	}
	
	@Override
	public void hobby() {
		String[] arData = {"A","B","C","D"};
		for(int i = 0; i<arData.length;i++) {
			System.out.print(arData[i] + " ");
		}
		System.out.println();
	}
	
	public void checkNotebook() {
		if(notebook) {
			System.out.println("노트북이 있습니다.");
		}else {
			System.out.println("노트북이 없습니다.");
		}
	}

		
	
}
