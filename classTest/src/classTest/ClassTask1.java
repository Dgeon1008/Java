package classTest;

class Market {
//	상품, 가격, 재고
	String product;
	int price, stock;
	
	public Market() {;}
	
	public Market(String product, int price, int stock) {
		this.product = product;
		this.price = price;
		this.stock = stock;
//		System.out.printf(product,price,stock);
	}
	// sell() 메서드
	void sell(Customer customer) {
		stock--;
		System.out.println("할인된 가격: " + price * (customer.sale / 100.0));
		customer.money -= price - price * (customer.sale / 100.0);
	}
	
}

class Customer{
//	이름, 전화번호, 돈, 할인율
	String name, phoneNum;
	int money, sale;
	
//	기본 생성자
	public Customer() {;}
	
//	초기화 생성자
//	Alt + Shift + S -> O -> Enter
	public Customer(String name, String phoneNum, int money, int sale) {
		this.name = name;
		this.phoneNum = phoneNum;
		this.money = money;
		this.sale = sale;
	}
	
	
	
}

public class ClassTask1 {
//	String product;
//	int price, stock;
	
	public static void main(String[] args) {
//		sell() 사용
//		사람의 돈 출력
//		마켓 상품의 재고 출력
		Market local = new Market("노트북", 2000, 5);
		Customer human = new Customer("김동건", "01032380971", 10000, 10 );
		
		System.out.println(local.stock);
		System.out.println(human.money);
		local.sell(human);
		System.out.println(local.stock);
		System.out.println(human.money);
		
	}
}

