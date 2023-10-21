package org.itmd566.assign2.assignment2_messenger.database;
import java.util.HashMap;
import java.util.Map;

import org.itmd566.assign2.assignment2_messenger.model.Message;
import org.itmd566.assign2.assignment2_messenger.model.Profile;
public class DatabaseClass {

	private static Map<String, Message> messages = new HashMap<>();
	private static Map<String, Profile> profiles = new HashMap<>();
	
	
	public static Map<String,Message> getMessages(){
		return messages;
	}
	
	
	public static Map<String,Profile> getProfiles(){
		return profiles;
	}
} 

