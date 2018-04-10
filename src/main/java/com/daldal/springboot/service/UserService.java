package com.daldal.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daldal.springboot.dao.UserDao;
import com.daldal.springboot.userdto.UserLoginDto;
import com.daldal.springboot.uservo.UserLoginVo;

@Service
public class UserService {

	@Autowired
	private UserDao userdao;
	
	public UserLoginVo loginsession(UserLoginDto userlogindto) {
		
		UserLoginVo userloginvo = userdao.selectNickNameByUserIdAndPw(userlogindto);
		
		return userloginvo;
	}
}
