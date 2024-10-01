package com.mysite.sbbmybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MessageController2 {
	@Autowired
	private MessageService2 messageService2;
	
	@GetMapping("/message2/{num}")
	@ResponseBody
	public Integer message2(@PathVariable("num") Integer num) {
		return messageService2.getMessage(num);
	}
}
