package tms;

import java.util.Arrays;
import java.util.Objects;

public class Employee extends Person{
	private long id; 
	private String[] lotto;
	private String company;
	
	public Employee() {;}

	public Employee(long id, String[] lotto, String company) {
		super();
		this.id = id;
		this.lotto = lotto;
		this.company = company;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String[] getLotto() {
		return lotto;
	}

	public void setLotto(String[] lotto) {
		this.lotto = lotto;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", lotto=" + Arrays.toString(lotto) + ", company=" + company + "]";
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
		Employee other = (Employee) obj;
		return id == other.id;
	}

	public void work() {
		System.out.println(getJob() + "은 하루종일 일을한다.");
	}
	
	public void byeCompany() {
		
	}
	
	public void saveMoney() {
		
	}
	
	
	
	
}






