package lambdaTask;

//성과 이름을 구현해서 전달
@FunctionalInterface
public interface PrintName {
	public String name(String lastname, String firstName);
}
