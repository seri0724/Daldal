package com.daldal.springboot.uservo;

public class UserLoginVo {
	private String nickname;

	public UserLoginVo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserLoginVo(String nickname) {
		super();
		this.nickname = nickname;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	@Override
	public String toString() {
		return "UserLoginVo [nickname=" + nickname + "]";
	}
	
	
}
