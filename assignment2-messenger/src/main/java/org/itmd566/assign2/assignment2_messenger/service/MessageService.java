package org.itmd566.assign2.assignment2_messenger.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.itmd566.assign2.assignment2_messenger.database.DatabaseClass;
import org.itmd566.assign2.assignment2_messenger.model.Message;
public class MessageService {

	private Map<String,Message> messages = DatabaseClass.getMessages();
	public List<Message> getAllMessages()
	{
		Message m1 = new Message(1L,"Hello World from User1", "user1", "userjj");
		Message m2 = new Message(2L,"Hello World from User2", "user2", "ydyydy");
		//List <Message> messageList = new ArrayList<>();
		
		messages.put("admin", m1);
		messages.put("admins", m2);
		
		return new ArrayList<Message>(messages.values());
		
	}
	
	public Message getMessage(String profileName)
	{
		return messages.get(profileName);
	}
	
	public Message addMessage(Message message)
	{
		message.setId(messages.size()+1);
		messages.put(message.getprofileName(), message);
		return message;
	}
	

	public Message updateMessage(Message message)
	{
		if (message.getprofileName().isEmpty())
			return null;
		messages.put(message.getprofileName(), message);
		return message;
	}
	
	public Message removeMessage(String profileName)
	{
	
		return messages.remove(profileName);
	}
	
}
