package com.daldal.springboot.userdto;

public class UserJoinDto {
	private String id;
	private String nickname;
	private String pw;
	private int age;
	private String email;
	public UserJoinDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserJoinDto(String id, String nickname, String pw, int age, String email) {
		super();
		this.id = id;
		this.nickname = nickname;
		this.pw = pw;
		this.age = age;
		this.email = email;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "UserJoinDto [id=" + id + ", nickname=" + nickname + ", pw=" + pw + ", age=" + age + ", email=" + email
				+ "]";
	}
	
}
