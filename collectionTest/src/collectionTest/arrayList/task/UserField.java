package collectionTest.arrayList.task;

import java.util.ArrayList;
import java.util.Objects;

public class UserField {
	
	public ArrayList<User> users = DBConnecter.users;
	public static String userId;
	final int KEY = 300;
	
	//	아이디 검사(중복 검사)
	//	재사용하기 위해서 User로 리턴
		public ArrayList<User> getUsers() {
		return users;
	}
	
	public User checkId(String id) {
		for(User user : users) {
			if(user.getId().equals(id)) {
				return user;
			}
		}
		return null;
	}
	
//	회원가입
	public void join(User user) {
		User userInDB = checkId(user.getId());
		if(userInDB == null) {
			users.add(user);
		}
	}

//	로그인
//	public boolean login(User user) {
//		for(User userInDB : users) {
//			if(userInDB.getId().equals(user.getId())) {
//				if(userInDB.getPassword().equals(user.getPassword())) {
//					return true;
//				}
//			}
//		}
//		return false;
//	}
	
//	로그인 로직
//	세션 공간에다가 모든 곳에 로그인을 넣어준다.
	public boolean login(User user) {
		User userInDB = checkId(user.getId());
		if(userInDB != null) {
			if(userInDB.getPassword().equals(user.getPassword())) {
				userId = user.getId();
				return true;
			}
		}
		return false;
	}
	
//	로그아웃
	public void logOut(User user) {
		userId = null;
	}
	
//	암호화
	public String encrypt(String password) {
		String encryptPassword = "";
		for(int i=0; i< password.length(); i++) {
			encryptPassword += (char)(password.charAt(i) * KEY);
		}
		return encryptPassword;
	}
	
	
//	비밀번호 변경(마이페이지)
//	비밀번호 변경(30일)
//	인증번호 전송
//	인증번호 확인
	
	public static void main(String[] args) {
		UserField uf = new UserField();
		System.out.println(uf.encrypt("rlaehdrjs"));
	}
}





