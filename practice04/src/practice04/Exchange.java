package practice04;

import java.util.Objects;
import java.util.Scanner;

public class Exchange {
	private double amount;
	private String currency;
	
	public Exchange() {;}

	public Exchange(double amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}



	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	@Override
	public String toString() {
		return "Exchange [amount=" + amount + ", currency=" + currency + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(amount, currency);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Exchange other = (Exchange) obj;
		return Double.doubleToLongBits(amount) == Double.doubleToLongBits(other.amount)
				&& Objects.equals(currency, other.currency);
	}

	public void exchange(double amount, String currency) {
		if(currency.equals("krw")) {
			setAmount(amount / 1439.40);
			System.out.println(amount + "는 "  + getAmount() + "달러입니다.");
		}else if(currency.equals("usd")) {
			setAmount(amount * 1439.40);
			System.out.println(amount + "는 " + getAmount() + "원입니다.");
		}else {
			System.out.println("usd 또는 krw가 아니면 처리불가");
		}
	}
	
	
	public static void main(String[] args) {
		Exchange ex = new Exchange();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("amount: " );
		double amount = sc.nextDouble();
		sc.nextLine(); 

		System.out.print("currency: " );
		String cur = sc.nextLine();

		ex.exchange(amount, cur);
		sc.close();
		
		
	}
}












