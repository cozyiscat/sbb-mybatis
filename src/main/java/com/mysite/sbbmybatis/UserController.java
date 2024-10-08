package com.mysite.sbbmybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@Controller
public class UserController {
	@Autowired
	UserService userService;
	
	//로그인 페이지
	@GetMapping("/user/login") 
	public String login() {
		return "/user/login";
	}
	
	@PostMapping("/user/login")
	public void login2(@RequestBody User user){
		User newUser = user;
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
