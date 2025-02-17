package tms;

import java.util.Objects;

public class Lotto {
	private long id;
	static private String[] lottoNumbers;
		
	public Lotto() {;}

	public Lotto(long id) {
		this.id = id;
	}
	
//	로또 번호 받기
	public String[] luckyDraw() {
		String[] luckyNumbers = new String[6];
		
		for(int i = 0; i < luckyNumbers.length; i++) {
			luckyNumbers[i] = String.valueOf((int)Math.floor(Math.random() * 45 + 1));
			for(int j = 0;j<i; j++) {
				if(luckyNumbers[j].equals(luckyNumbers[i])) {
					i--;
					break;
				}
			}
		}
		return luckyNumbers;
	}

//	로또 당첨 번호
	public void drawNumber() {
		String[] luckyNumbers = new String[6];
		
		for(int i = 0; i < luckyNumbers.length; i++) {
			luckyNumbers[i] = String.valueOf((int)Math.floor(Math.random() * 45 + 1));
			for(int j = 0;j<i; j++) {
				if(luckyNumbers[j].equals(luckyNumbers[i])) {
					i--;
					break;
				}
			}
		}
		lottoNumbers  = luckyNumbers;
	}
	
//	- 해당 메서드를 사용하면, 회사원 또는 연구원에게만 로또를 판매하는 기능을 가진 메서드이다.
//	(즉 회사원 또는 연구원의 필드에 접근하여 로또 번호를 입력할 수 있다.)
	public void sellLotto(Person person) {
		if(person instanceof Employee) {
			((Employee) person).setLotto(this.luckyDraw());
		}else if(person instanceof Researcher) {
			((Researcher) person).setLotto(this.luckyDraw());
		}else {
			System.out.println("연구원, 회사원만 구매 가능");
		}
	}
	
//	- 로또의 구매는 회사원과 연구원만 구매할 수 있으며 checkLotto 메서드로 당첨자를 확인하여 값을 리턴하는 메서드이다.
//	로또를 구매하는 회사원과 연구원이 아닌 경우 "로또를 구매할 수 없습니다"를 출력한다.
//	- 로또는 모든 번호가 맞으면 당첨 아니면 꽝! 둘중 하나로만 결과를 알려주는 메서드이다
	public boolean checkLotto(Person person){
		int count = 0;
		
		if(person instanceof Employee) {
			String[] buyerLotto = ((Employee)person).getLotto();
			for(int i = 0; i<buyerLotto.length;i++) {
				for(int j=0;j<lottoNumbers.length;j++) {
					if(buyerLotto[i].equals(lottoNumbers[j])) {
						count ++;
						continue;
					}
				}
			}
			if(count == 6) {
				return true;
			}else {
				return false;
			}
		}else if(person instanceof Researcher) {
			String[] buyerLotto = ((Researcher) person).getLotto();
			for(int i = 0; i<buyerLotto.length;i++) {
				for(int j=0;j<lottoNumbers.length;j++) {
					if(buyerLotto[i].equals(lottoNumbers[j])) {
						count ++;
						continue;
					}
				}
			}
			if(count == 6) {
				return true;
			}else {
				return false;
			}
		}
		else {
			System.out.println("구매한적이 없다.");
			return false;
		}
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
	
	
	public static void main(String[] args) {
		Lotto lotto = new Lotto();
		Person em1 = new Employee(1L, "일당백", 20, "01077776666", "It", "코리아IT아카데미");
		Employee em2 = (Employee)em1; 
		Person re1 = new Researcher(1L, "한우물", 35, "01044467878", "식물연구원", "식물연구");
		Researcher re2 = (Researcher)re1;
		
//		로또 추첨
		lotto.drawNumber();
//		로또 판매
		lotto.sellLotto(re2);
		lotto.sellLotto(em2);
		
//		회사원 메서드 사용
	    em2.byeCompany(lotto.checkLotto(em2));
	    em2.saveMoney(lotto.checkLotto(em2));

//	    연구원 메서드 사용
	    re2.investLab(lotto.checkLotto(re2));
	    re2.buyFood(lotto.checkLotto(re2));
		
	}
	
	
	
}
