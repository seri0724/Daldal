package com.daldal.springboot.mapper;

import com.daldal.springboot.userdto.UserLoginDto;
import com.daldal.springboot.uservo.UserLoginVo;

public interface UserMapper {
	public String selectId(String joinIdCheck);
	public UserLoginVo selectNickNameByUserIdAndPw(UserLoginDto userlogindto);
}
