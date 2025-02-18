package tms;

import java.util.Objects;

public class Lotto {
	private long id;
	private static String[] lottoNumbers;
	
	
	public Lotto() {;}


	public Lotto(long id) {
		super();
		this.id = id;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public static String[] getLottoNumbers() {
		return lottoNumbers;
	}


	public static void setLottoNumbers(String[] lottoNumbers) {
		Lotto.lottoNumbers = lottoNumbers;
	}


	@Override
	public String toString() {
		return "Lotto [id=" + id + "]";
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
		Lotto other = (Lotto) obj;
		return id == other.id;
	}
	
	public String[] luckydraw() {
		String[] luckyNumbers = new String[6];
		for(int i=0;i<luckyNumbers.length;i++) {
			luckyNumbers[i] = String.valueOf((int)Math.floor(Math.random() * 45 + 1));
		}
		return luckyNumbers;
	}
	
	public void drawNumber() {
		String[] luckyNumbers = new String[6];
		for(int i=0;i<luckyNumbers.length;i++) {
			luckyNumbers[i] = String.valueOf((int)Math.floor(Math.random() * 45 + 1));
		}
		lottoNumbers = luckyNumbers;
	}
	
	public void sellLotto(Person person) {
		if(person instanceof Employee) {
			((Employee)person).setLotto(this.luckydraw());
		}else if(person instanceof Researcher) {
			((Researcher)person).setLotto(this.luckydraw());
		}else {
			System.out.println("회사원과 연구원만 구매 가능합니다.");
		}
	}
	
	public boolean checkLotto(Person person) {
		if(person instanceof Employee) {
			String[] buyerLotto = ((Employee)person).getLotto();
			int count = 0;
			for(int i=0;i<this.lottoNumbers.length;i++) {
				
			}
		}
	}
	
	
	
}












