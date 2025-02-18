package collectionTest;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonTest2 {
	public static void main(String[] args) {
//		바꿔주고 -> 모인다.
//		바꿔주는거
		JSONObject userJSON = new JSONObject();
//		바꿔주는게 모여있는거
//		생성자로 넘길 수 없다.
		JSONArray usersJSON = new JSONArray();
		
		ArrayList<User> users = new ArrayList<User>();
		
		User user1 = new User(1, "김동건", 26, "개발자");
		User user2 = new User(2, "김동건2", 27, "학생2");
		User user3 = new User(3, "김동건3", 28, "학생3");
		User user4 = new User(4, "김동건4", 29, "학생4");
		User user5 = new User(5, "김동건5", 30, "학생5");
		
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		users.add(user5);
		
		System.out.println(users);
		
//		users를 반복문 돌려서 user를 Object로 바꿔야한다.
		
//		for(User user : users) {
//			JSONObject jsonUser = new JSONObject(user);
//		}
		
//		users.stream().map(user -> new JSONObject(user)).forEach(user -> {                
//			usersJSON.put(user);
//		});
		
//		받은 값을 바로 쓰고 싶으면
		users.stream().map(JSONObject::new).forEach(usersJSON::put);
		
		System.out.println(usersJSON);
		
		users.forEach((user) -> {
			System.out.println(user.toString());
		});
		
	}
}
















