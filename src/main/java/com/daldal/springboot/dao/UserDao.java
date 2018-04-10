package com.daldal.springboot.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.daldal.springboot.mapper.UserMapper;
import com.daldal.springboot.userdto.UserLoginDto;
import com.daldal.springboot.uservo.UserLoginVo;

@Repository
public class UserDao {
	
	@Autowired
	UserMapper usermapper;
	
	public UserLoginVo selectNickNameByUserIdAndPw(UserLoginDto userlogindto) {
		
		UserLoginVo userloginvo = usermapper.selectNickNameByUserIdAndPw(userlogindto);
		
		return userloginvo;
	}
}
