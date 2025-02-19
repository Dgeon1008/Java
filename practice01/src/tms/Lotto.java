package tms;

import java.util.Objects;

public class Lotto {
	private long id;
	private static String[] lottoNumbers;
	
	public Lotto() {;}

	public Lotto(long id) {
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
	
	public String[] luckyDraw() {
		String[] luckyNumbers = new String[6];
		for(int i = 0; i < luckyNumbers.length; i++) {
			luckyNumbers[i] = String.valueOf((int)Math.floor(Math.random() * 45 + 1));
		}
		return luckyNumbers;
	}
	
	public void drawNumber() {
		String[] luckyNumbers = new String[6];
		for(int i = 0; i < luckyNumbers.length; i++) {
			luckyNumbers[i] = String.valueOf((int)Math.floor(Math.random() * 45 + 1));
		}
		lottoNumbers =  luckyNumbers;
	}
	
	public void sellLotto(Person person) {
		if(person instanceof Employee) {
			((Employee)person).setLotto(this.luckyDraw());
		}else if(person instanceof Researcher) {
			((Researcher)person).setLotto(this.luckyDraw());
		}else {
			System.out.println("회사원과 연구원만 구매가능합니다.");
		}
	}
	
	public boolean checkLotto(Person person) {
		if(person instanceof Employee) {
			int count = 0;
			String[] buyerLotto = ((Employee)person).getLotto();
			for(int i = 0; i < this.lottoNumbers.length; i++) {
				for(int j = 0; j < buyerLotto.length; j++) {
					if(lottoNumbers[i].equals(buyerLotto[j])) {
						count ++;
						continue;
					}
				}
			}
			if(count == 6) {
				return true;
			}
			return false;
		}else if(person instanceof Researcher) {
			int count = 0;
			String[] buyerLotto = ((Researcher)person).getLotto();
			for(int i = 0; i < this.lottoNumbers.length; i++) {
				for(int j = 0; j < buyerLotto.length; j++) {
					if(lottoNumbers[i].equals(buyerLotto[j])) {
						count ++;
						continue;
					}
				}
			}
			if(count == 6) {
				return true;
			}
			return false;
		}else {
			System.out.println("구매하신적이 없습니다.");
			return false;
		}
	}
	
	public static void main(String[] args) {
		Lotto lotto = new Lotto();

		Person em1 = new Employee(1L, "일당백", 20 ,"011", "It", "IT아카데미");
		Employee em2 = (Employee)em1;
		
		Person re1 = new Researcher(2L, "한우물", 35 ,"010", "식물연구", "식물연구소");
		Researcher re2 = (Researcher)re1;
		
		lotto.drawNumber();
		
		lotto.sellLotto(em2);
		lotto.sellLotto(re2);
		
		em2.byeCompany(lotto.checkLotto(em2));
		em2.saveMoney(lotto.checkLotto(em2));
		
		re2.investLab(lotto.checkLotto(re2));
		re2.buyFood(lotto.checkLotto(re2));
		
		
		
	}
	
	
	
	
}











