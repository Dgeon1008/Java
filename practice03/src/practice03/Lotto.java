package practice03;

import java.util.Arrays;
import java.util.Scanner;

public class Lotto {
//	1. 기본 생성자
//	2. 초기화 생성자
//	3. private 붙이기 다른 클래스에서 접근 불가, 
//	메소드(getter, setter)로만 접근하자!
//	4. getter, setter
//	5. toString 재정의
//	6. hashcode, equals 재정의
	private String[] lucky;
	private String[] myLucky;
	
	public Lotto() {;}

	public Lotto(String[] lucky, String[] myLucky) {
		this.lucky = lucky;
		this.myLucky = myLucky;
	}

	public String[] getLucky() {
		return lucky;
	}

	public void setLucky(String[] lucky) {
		this.lucky = lucky;
	}


	public String[] getMyLucky() {
		return myLucky;
	}


	public void setMyLucky(String[] myLucky) {
		this.myLucky = myLucky;
	}

	
//	메서드 drawNumber로 추첨한다. 추첨은 아래와 같다.
//	1 ~ 45까지의 랜던함 숫자를 6개 추출한다.

	//	String[] return
	public String[] drawNumber() {
		String[] luckyNumber = new String[6];
		
		for(int i = 0; i<6; i++) {
			luckyNumber[i] = String.valueOf((int)Math.floor(Math.random() * 45 + 1));
			for(int j = 0;j<i; j++) {
				if(luckyNumber[j].equals(luckyNumber[i])) {
					i--;
					break;
				}
			}
		}
		return luckyNumber;
	}

//	메서드 checkLotto
//	로또의 구매는 회사원과 연구원만 구매할 수 있으며 checkLotto 메서드로 당첨자를 확인한다.
//	로또를 구매하는 회사원과 연구원이 아닌 경우 "로또를 구매할 수 없습니다"를 출력한다.
	public String checkLotto() {
		int count = 0;
		
		for(int i=0;i<lucky.length;i++) {
			for(int j=0;j<myLucky.length;j++) {
				if(lucky[i].equals(myLucky[j])) {
					count ++;
				}
			}
		}	
		switch (count) {
		case 6:
			return "1";
		case 5:
			return "2";
		case 4:
			return "3";
		case 3:
			return "4";
		case 2:
			return "5";
		case 1:
			return "6";
		default:
			return "꽝";
		}
	}

	
	
	@Override
	public String toString() {
		return "Lotto [lucky=" + Arrays.toString(lucky) + ", myLucky=" + Arrays.toString(myLucky) + "]";
	}

	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(lucky);
		result = prime * result + Arrays.hashCode(myLucky);
		return result;
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
		return Arrays.equals(lucky, other.lucky) && Arrays.equals(myLucky, other.myLucky);
	}

	public static void main(String[] args) {
		Lotto lotto = new Lotto();

		lotto.setLucky(lotto.drawNumber());
		lotto.setMyLucky(lotto.drawNumber());
//		System.out.println(lotto);
		
		String checkLotto = lotto.checkLotto();
		Scanner sc = new Scanner(System.in);
		String job = "", lottoResult = "";
		String messageJobSelect = "직업을 선택해주세요 \n1.회사원 2.연구원 3.다른 직업",
				messageCanBuyLotto = "로또를 구매할 수 있습니다!",
				messageCannotBuyLotto = "로또를 구매할 수 없습니다.";
		System.out.println(messageJobSelect);
		job = sc.nextLine();

//		회사원, 연구원 아닐 시 종료
		if(!job.equals("1") && !job.equals("2")) {
			System.out.println("로또를 구매할 수 없습니다.");
			return;
		}
				
		System.out.println(messageCanBuyLotto);
//		이번주 당첨 번호
		System.out.println("------------------------");
		System.out.println("이번 주 당첨 번호");
		for(String luckyNum : lotto.getLucky()) {
			System.out.print(luckyNum + " ");
		}
		System.out.println("\n------------------------");
		System.out.println("내 로또 번호");
		for(String luckyNum : lotto.getMyLucky()) {
			System.out.print(luckyNum + " ");
		}
		System.out.println("\n------------------------");
		lottoResult = checkLotto.equals("꽝") ? checkLotto + "입니다." : checkLotto + "등 입니다.";
		System.out.println(lottoResult);

		
		if(job.equals("1")) {
//				1.2등 당첨시
			if(checkLotto.equals("1")) {
				System.out.println("직장을 그만둔다.");
			}else if(checkLotto.equals("2")) {
				System.out.println("전액을 저축한다.");
			}
		}else if(job.equals("2")) { 
//				1.2등 당첨시
			if(checkLotto.equals("1")) {
				System.out.println("연구에 투자한다.");
			}else if(checkLotto.equals("2")) {
				System.out.println("지인에게 밥을 산다.");
			}
		}	

	}
}
