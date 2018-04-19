package com.daldal.springboot.api.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.daldal.springboot.mapper.UserMapper;
import com.daldal.springboot.service.UserService;
import com.daldal.springboot.userdto.UserJoinDto;
import com.daldal.springboot.userdto.UserLoginDto;
import com.daldal.springboot.uservo.UserLoginVo;
import com.daldal.springboot.writedto.WriteMongoDto;

@RestController
@RequestMapping(value="/api/user")
public class ApiUserController {

	@Autowired
	private UserMapper usermapper;
	
	@Autowired
	private UserService userservice;
	
	@RequestMapping(value="/overlap")
	public String test(@RequestBody Map<String,String> map) {
		
		String getId =  map.get("joinidcheck");
		System.out.println(getId);
		String userid = usermapper.selectId(getId);
		String res;
		if(userid == null) {
			res = "possible";
		}else {
			res = "impossible";
		}
		System.out.println("res:"+res);
		return res;
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public UserLoginVo login(@RequestBody UserLoginDto userlogindto, HttpSession session) {
		System.out.println(userlogindto.toString());
		UserLoginVo userloginvo = userservice.loginsession(userlogindto);
		session.setAttribute("authUser", userloginvo);
		
		return userloginvo;
	}
	
	@RequestMapping(value="/logout")
	public String logout(HttpSession session) {
		session.removeAttribute("authUser");
		return "";
	}
	
	@RequestMapping(value="/join",method=RequestMethod.GET)
	public UserJoinDto join(@RequestBody UserJoinDto userjoindto) {
		System.out.println(userjoindto.toString());
		return userjoindto;
	}
	
	@RequestMapping(value="/write")
	public WriteMongoDto write(@RequestBody WriteMongoDto writemongodto) {
		System.out.println(writemongodto.toString());
		//세션에서 아이디값 받아와서 dto에 넣어줘야함
		return writemongodto;
	}
	
	
}
