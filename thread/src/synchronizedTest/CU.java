package synchronizedTest;

public class CU {
	
	public static void main(String[] args) {
		ATM atm = new ATM();
		
		Thread dg = new Thread(atm, "동건");
		Thread sh = new Thread(atm, "세환");
		
		dg.start();
		sh.start();
		
	}
}
