package org.itmd566.assign2.assignment2_messenger.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

public class Profile {
	
	
	private long id;
	private String profileName;
	private String firstName;
	private String lastName;
	private Date dateCreated;
	
	public Profile()
	{
		
	}
	
	public Profile(long id, String profileName, String firstName, String lastName) {
	    
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
	public String getProfileName() {
		return profileName;
	}
	public void setProfileName (String profileName) {
		System.out.print("ffff"+profileName);
		this.profileName = profileName;
	}
	public String getfirstName() {
		return firstName;
	}
	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getlastName() {
		return lastName;
	}
	public void setlastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	

}
