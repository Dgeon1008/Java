package collectionTest.arrayList.task;

import java.util.ArrayList;
import java.util.HashMap;

import org.json.simple.JSONObject;

import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

public class UserField {
	public ArrayList<User> users = DBConnecter.users;
	public static String userId;
	public static String code;
	final String SALT = "company";
	final int KEY = 300;
	
	
//	아이디 검사(중복 검사)
//	재사용하기 위해서 User로 리턴
//	for (자료형 변수명 : 배열 또는 리스트)
	public User checkId(String id) {
		for(User user : users) {
			if(user.getId().equals(id)) {
				return user;
			}
		}
		return null;
	}
	
//	회원가입
//	15분
	public void join(User user) {
		User userInDB = checkId(user.getId());
		String encryptPassword = null;
		if(userInDB == null) {
			encryptPassword = encrypt(user.getPassword()); 
			user.setPassword(encryptPassword);
			System.out.println(encryptPassword);
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
//			
//		}
//		return false;
//	}
	
//	로그인 로직
//	세션 공간에다가 모든 곳에 로그인을 넣어준다.
	public boolean login(User user) {
//		아이디 확인
		User userInDB = checkId(user.getId());
		if(userInDB != null) {
//			비밀번호 확인
			if(userInDB.getPassword().equals(encrypt(user.getPassword()))) {
//				로그인 성공 시 userId에 현재 사용자 아이디 저장
				userId = user.getId();
				return true;
			}
		}
		return false;
	}
	
//	로그아웃
//	10분
	public void logout() {
		userId = null;
	}
	
//	암호화
//	20분
	public String encrypt(String password) {
		String encryptPassword = SALT + password;
		String encryptedPassword = "";
		for(int i = 0; i < encryptPassword.length(); i++) {
			encryptedPassword += (char)(encryptPassword.charAt(i) * KEY);
		}
		return encryptedPassword;
	}
	
//	비밀번호 변경(마이페이지)
//	매개변수는 이미 변경된 값을 가져왔다.
	public void update(User user) {
		User userInDB = checkId(user.getId());
		if(userInDB != null) {
			userInDB.setPassword(encrypt(user.getPassword()));
		}
	}
	
//	비밀번호 변경(30일)
	public boolean update(String password, String newPassword) {
		User userInDB = checkId(userId);
		if(userInDB.getPassword().equals(password)) {
			userInDB.setPassword(encrypt(newPassword));
			return true;
		}
		return false;
	}
	
//	인증번호 전송
	public void sendSms(String phoneNumber) {
	     String api_key = "";
	      String api_secret = "";
	      Message coolsms = new Message(api_key, api_secret);
	      
	      // 4 params(to, from, type, text) are mandatory. must be filled
	      HashMap<String, String> params = new HashMap<String, String>();
	      
//	      createCode();
	      params.put("to", phoneNumber);
	      params.put("from", "01047099813");
	      params.put("type", "SMS");
	      params.put("text", "[인증번호 6자리]\n" + code + "테스트 문자 발송!");
	      params.put("app_version", "text app 1.2"); // application name and version

	      try {
	         JSONObject obj = (JSONObject) coolsms.send(params);
	         System.out.println(obj.toString());
	      } catch (CoolsmsException e) { 
	         System.out.println(e.getMessage());
	         System.out.println(e.getCode());
	      }
	}
	
//	인증번호 생성
	public void createCode() {
		String randomCode = "";
		for(int i = 0; i<6; i++) {
			randomCode += (int)Math.floor(Math.random() * 10);
		}
		code = randomCode;
	}
	
//	인증번호 확인	
	public boolean checkCode(String inputcode) {
		if(code.equals(inputcode)) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		UserField uf = new UserField();
		System.out.println(uf.encrypt("abcdefg")); 
		uf.createCode();
		uf.sendSms("01032380971");
		System.out.println(code);
		System.out.println(uf.checkCode("123456"));
	}
		
}













