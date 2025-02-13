package objectTest;

public class Sports {
//	1. 기본 생성자
//	2. 초기화 생성자
//	3. private 붙이기 다른 클래스에서 접근 불가, 
//	메소드(getter, setter)로만 접근하자!
//	4. getter, setter
//	5. toString 재정의
//	6. hashcode, equals 재정의
	
//	alt + shilf + a
	private String type;
	private int total;
	
//	기본 생성자
	public Sports() {;}
	
//	초기화 생성자
	public Sports(String type, int total) {
		super();
		this.type = type;
		this.total = total;
	}
	
//	alt + shift + s -> (alt)+r -> (alt)+a -> (alt)+r
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
//	alt + shift + s -> s	
	@Override
	public String toString() {
		return "Sports [type=" + type + ", total=" + total + "]";
	}

	public static void main(String[] args) {
		Sports sports = new Sports();
//		System.out.println(sports.hashCode());
		System.out.println(sports.toString());
//		sports.equals(sports);
	}
}












