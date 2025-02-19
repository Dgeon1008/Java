package optionalTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class OptionalTest {
	ArrayList<User2> users = new ArrayList<User2>(Arrays.asList( 	
			new User2("김동건","kdg","1008"),
			new User2("홍길동","hgd","3656"),
			new User2("장보고","jbg","2345"),
			new User2("이순신","lss","1234")
			));
	
	public Optional<User2> findById(Long id) {
		User2 user = null;
		for(User2 userInDB : users) {
			if(userInDB.getId() == id) {
				user = userInDB;
			}
		}
		return Optional.ofNullable(user); 
	}
	
	public static void main(String[] args) {
		OptionalTest ot = new OptionalTest();
		Long num1 = 0L;
		long num2 = 0L;
				
		Optional<User2> user = ot.findById(2L);
		
//		if(user != null) {
//			System.out.println(user.toString());
//		}else {
//			System.err.println("존재하지 않는 회원입니다.");
//		}
	
//		orElse : null이 아니라면 user, null이라면 대체 user
//		user.orElse(new User2());
		
//		orElseThrow : null이 아니라면 user, null이라면 () -> { 예외발생 };
//		user.orElseThrow(() -> {
//			throw new NoSearchUserException("그런 회원 없습니다.");
//		});
		
		user.ifPresent((findUser) -> {
//			null이 아닐 때만 실행하는 로직
			System.out.println("ifPresent");
			System.out.println(findUser.toString());
		});
		
		System.out.println(user.isPresent()); 
		
		user.ifPresentOrElse((findUser) -> {
//			null이 아니면 실행
		}, () -> {
//			null일 때 실행하는 로직
			System.out.println("존재하지 않는 회원");
		});
		
		System.out.println(user.isPresent());
		
		
		
	}
	
}


















