package anonymousTest;

public class AnonymousTest {
	public static void main(String[] args) {
		
//		내부 익명 클래스
//		implement 한것과 동일하지만, 한 번만 사용하기 위해 작성한다. (1회용)
//		부모의 인터페이스를 재정의해서 다시 올라갔다.
		Study study = new Study() {
			@Override
			public void setTopic(String topic) {
				System.out.println("주제 : " + topic);
			}
		};
		
		study.setTopic("화학");
		
	}
}
