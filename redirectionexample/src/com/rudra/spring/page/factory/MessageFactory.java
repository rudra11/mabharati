package com.rudra.spring.page.factory;

import java.util.HashMap;
import java.util.Map;

import com.rudra.spring.page.value.Message;
import com.rudra.spring.page.value.MessageValue;

public class MessageFactory {
	
	private MessageFactory(){
		
	}
	
	public static MessageFactory getFactory(){
		return new MessageFactory();
	}

	private Map<String, MessageValue> messageList = new HashMap<String, MessageValue>();
	{
		messageList.put("home", MessageValue.HOME);
		messageList.put("aboutus", MessageValue.ABOUTUS);
		messageList.put("contactus", MessageValue.CONTACTUS);
		messageList.put("events", MessageValue.EVENTS);
		messageList.put("ourwork", MessageValue.OURWORK);
		messageList.put("thankyou", MessageValue.THANKYOU);
	}
	
	public Message getMessage(String key){
		Message message = new Message(); 
		message.setMessage(messageList.get(key.trim().toLowerCase()).getMessage());
		return message;
	}
}
