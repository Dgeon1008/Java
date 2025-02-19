package optionalTest;

public class User2 {
	private Long id;
	private String userName;
	private String userId;
	private String userpassword;
	private static Long seq;
	
//	객체화 될때 마다 실행
	static {
		seq = 0L;
	}
	
	{
		this.id = seq++;
	}
	
	public User2() {;}

	public User2(String userName, String userId, String userpassword) {
		this.userName = userName;
		this.userId = userId;
		this.userpassword = userpassword;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserpassword() {
		return userpassword;
	}

	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}

	public static Long getSeq() {
		return seq;
	}

	public static void setSeq(Long seq) {
		User2.seq = seq;
	}

	@Override
	public String toString() {
		return "User2 [id=" + id + ", userName=" + userName + ", userId=" + userId + ", userpassword=" + userpassword
				+ "]";
	}
	
	
	
}
