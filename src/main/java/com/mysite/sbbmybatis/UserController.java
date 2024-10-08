package com.mysite.sbbmybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;




@Controller
public class UserController {
	@Autowired
	UserService userService;
	
	//유저정보
	@GetMapping("/user/login") 
	public String login() {
		return "/user/login";
	}
	
	//상세정보
	@GetMapping("/user/{username}")
	//@ResponseBody
	public String getUser(@PathVariable("username") String username, Model model) {
		//String username = "hong";
		//사용자 아이디에 맞는 정보를 가져온다.
		User user = userService.getUser(username);
		model.addAttribute("user",user);
		return "/user/detail";
		//return userService.getUser(username);
	}
}
