package org.itmd566.assign2.assignment2_messenger.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message {
	
	
	private long id;
	private String profileName;
	private String firstName;
	private String lastName;
	private Date dateCreated;
 
	
	public Message()
	{
		
	}
	
	public Message(long id, String profileName, String firstName, String lastName) {
		super();
		this.id = id;
		this.profileName = profileName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateCreated = new Date();
	}
	

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getprofileName() {
		return profileName;
	}
	public void setprofileName(String profileName) {
		this.profileName = profileName;
	}
	public String getlastName() {
		return lastName;
	}
	public void setgetlastName(String lastName) {
		this.lastName = lastName;
	}
	public String getfirstName() {
		return firstName;
	}
	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	

}
