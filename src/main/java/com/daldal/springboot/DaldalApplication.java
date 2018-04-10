package com.daldal.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.daldal.springboot.interceptor.UserInterceptor;


@Configuration 
@SpringBootApplication()
@MapperScan("com.daldal.springboot.mapper")
public class DaldalApplication extends WebMvcConfigurerAdapter{
	
	public static void main(String[] args) {
		SpringApplication.run(DaldalApplication.class, args);
	}
	
	@Autowired
	UserInterceptor userinterceptor;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// TODO Auto-generated method stub
		super.addInterceptors(registry);
		registry.addInterceptor(userinterceptor)
				.addPathPatterns("/user/writeform");
	}
	
}
