package cts.mvc;

public class LoginBean {
	private String userName, password;

	public LoginBean() {
	}

	public String getUserName() {
		System.out.println("from getuserName()");
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
		System.out.println("from setuserName()");
	}

	public String getPassword() {
		System.out.println("from getpassword()");
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
		System.out.println("from password()");
	}
}