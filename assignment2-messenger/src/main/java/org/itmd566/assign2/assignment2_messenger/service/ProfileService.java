package org.itmd566.assign2.assignment2_messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.itmd566.assign2.assignment2_messenger.database.DatabaseClass;
import org.itmd566.assign2.assignment2_messenger.model.Profile;


public class ProfileService {
	private Map<String,Profile> profiles = DatabaseClass.getProfiles();
	
	public ProfileService()
	{
		//profiles.put("Bhavana",new Profile(1L,"ADMIN", "BAHAVAN", "SSHHH"));
	}
	public List<Profile> getAllProfiles()
	{
		//Profile m1 = new Profile(1L,"Hello World from User1", "user1");
		//Profile m2 = new Profile(2L,"Hello World from User2", "user2");
		//List <Profile> ProfileList = new ArrayList<>();
		
		//Profiles.put(1L, m1);
		//Profiles.put(2L, m2);
		//System.out.printf("ss",profiles.values());
		
		return new ArrayList<Profile>(profiles.values());
		
	}
	
	public Profile getProfile(String profileName)
	{
		return profiles.get(profileName);
	}
	
	public Profile addProfile(Profile profile)
	{
		profile.setId(profiles.size()+1);
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}
	

	public Profile updateProfile(Profile profile)
	{
		 if (profile.getProfileName() == null || profile.getProfileName().isEmpty()) {
		        return null;
		    }

		    Profile existingProfile = profiles.get(profile.getProfileName());

		    if (existingProfile != null) {
		        // Preserve the original ID when updating
		        profile.setId(existingProfile.getId());
		        profiles.put(profile.getProfileName(), profile);
		        return profile;
		    }
		    return null;
	}
	
	public Profile removeProfile(String profileName)
	{
	
		return profiles.remove(profileName);
	}
}


