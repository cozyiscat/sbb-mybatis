package com.mysite.sbbmybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
	//데이터베이스에서 값을 가져오는것
	@Autowired
	private MessageMapper messageMapper;
	public Message getMessage(Integer id) {
		return messageMapper.getMessageById(id);
//		return "hello!";
	}
    public void createMessage(Message message) {
        messageMapper.insertMessage(message);
    }
    public List<Message> getMessageLimit10(){
    	return messageMapper.getMessageLimit10();
    }

}
