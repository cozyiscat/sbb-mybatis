package com.mysite.sbbmybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@GetMapping ("/user/login")
	public String login() {
		return "/user/login";
	}
	
    @GetMapping("/user/{username}")
    public User getMessage(@PathVariable("username") String username) {
        return userService.getUser(username);
    }

}
