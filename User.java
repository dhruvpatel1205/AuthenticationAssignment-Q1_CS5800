package model.entities;

public class User {
	private static User user=new User();
	
	private String userName;
	
	private String password;
	
	public User (String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	public User() {
		
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static User getInstance() {
		// TODO Auto-generated method stub
		return user;
	}
	
}
