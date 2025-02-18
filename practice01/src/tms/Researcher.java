package tms;

import java.util.Arrays;
import java.util.Objects;

public class Researcher extends Person{
	private long id;
	private String[] lotto;
	private String search;
	
	public Researcher() {;}

	public Researcher(long id, String[] lotto, String search) {
		super();
		this.id = id;
		this.lotto = lotto;
		this.search = search;
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

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	@Override
	public String toString() {
		return "Researcher [id=" + id + ", lotto=" + Arrays.toString(lotto) + ", search=" + search + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Researcher other = (Researcher) obj;
		return id == other.id;
	}
	
	public void work() {
		System.out.println("연구원은 " + search + "중이다.");
	}
	
	public void investLab() {
		
	}
	
	public void buyFood() {
		
	}
	
	
}






