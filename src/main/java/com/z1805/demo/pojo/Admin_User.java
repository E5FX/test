package com.z1805.demo.pojo;

public class Admin_User {
	
	private int admin_user_id;
	
	private String login_user_name;
	
	private String login_password;
	
	private String nick_name;
	
	private int locked;
	
	public Admin_User() {
		// TODO Auto-generated constructor stub
	}

	public int getAdmin_user_id() {
		return admin_user_id;
	}

	public void setAdmin_user_id(int admin_user_id) {
		this.admin_user_id = admin_user_id;
	}

	public String getLogin_user_name() {
		return login_user_name;
	}

	public void setLogin_user_name(String login_user_name) {
		this.login_user_name = login_user_name;
	}

	public String getLogin_password() {
		return login_password;
	}

	public void setLogin_password(String login_password) {
		this.login_password = login_password;
	}

	public String getNick_name() {
		return nick_name;
	}

	public void setNick_name(String nick_name) {
		this.nick_name = nick_name;
	}

	public int getLocked() {
		return locked;
	}

	public void setLocked(int locked) {
		this.locked = locked;
	}

	public Admin_User(int admin_user_id, String login_user_name, String login_password, String nick_name, int locked) {
		super();
		this.admin_user_id = admin_user_id;
		this.login_user_name = login_user_name;
		this.login_password = login_password;
		this.nick_name = nick_name;
		this.locked = locked;
	}

	@Override
	public String toString() {
		return "Admin_User [admin_user_id=" + admin_user_id + ", login_user_name=" + login_user_name
				+ ", login_password=" + login_password + ", nick_name=" + nick_name + ", locked=" + locked + "]";
	}
	
}
