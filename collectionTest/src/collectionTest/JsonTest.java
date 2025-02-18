package collectionTest;

import java.util.HashMap;

import org.json.simple.JSONObject;

public class JsonTest {
	public static void main(String[] args) {
//		json(프론트)한테 넘겨줄 때는 map으로 넘겨줘야한다.
		HashMap<String, Object> userMap = new HashMap<String, Object>();
		userMap.put("id", "kdg1008");
		userMap.put("password", "3238");
		userMap.put("name", "김동건");
		userMap.put("age", 26);
		
		JSONObject json = new JSONObject(userMap);
		System.out.println(json);
	}
}
