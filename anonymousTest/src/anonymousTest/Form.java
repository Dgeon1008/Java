package anonymousTest;

// 가입 양식
// 메뉴 받기, 판매
public interface Form  {
//	String 배열로 메뉴목록 반환
	public String[] getMenus();
//	메뉴 판매 메서드
	public void sell(String menu);
}
