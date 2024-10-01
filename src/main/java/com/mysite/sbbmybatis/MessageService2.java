package com.mysite.sbbmybatis;

import org.springframework.stereotype.Service;

@Service
public class MessageService2 {
	//데이터베이스에서 값을 가져오는것
	public Integer getMessage(Integer num) {
	//	return messageMapper.getMessageById(id);
		int result = num*99999;
		return result;
	}
}
