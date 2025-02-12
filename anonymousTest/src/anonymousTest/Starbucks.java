package anonymousTest;

public class Starbucks {
	
//	업 캐스팅
	public void register(Form form) {
//		메뉴 배열 가져오기
		String[] menu = form.getMenus();
		for(int i = 0; i< menu.length; i++) {
			System.out.println(i + 1 + "." + menu[i]);
		}

//		판매 중인 곳인지, 무료나눔을 하고 있는 곳인지
		if(form instanceof FormAdapter) {
			System.out.println("무료 나눔 행사중");
		}else {
			form.sell("에이드");
		}
	}
}
