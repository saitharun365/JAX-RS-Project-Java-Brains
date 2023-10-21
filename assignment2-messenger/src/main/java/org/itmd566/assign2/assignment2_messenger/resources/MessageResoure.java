package org.itmd566.assign2.assignment2_messenger.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.itmd566.assign2.assignment2_messenger.model.Message;
import org.itmd566.assign2.assignment2_messenger.service.MessageService;

@Path("/profiled")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class MessageResoure {
	
	MessageService messageService = new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMessages()
	{
		return messageService.getAllMessages();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message addMessage(Message message)
	{
		return messageService.addMessage(message);
	}
	
	
	@PUT
	@Path("/{profileName}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message updateMessage(@PathParam("profileName") String profileName,Message message)
	{   message.setprofileName(profileName);
		return messageService.updateMessage(message);
	}
	
	@DELETE
	@Path("/{profileName}")
	@Produces(MediaType.APPLICATION_JSON)
	public void deleteMessage(@PathParam("profileName") String  profileName)
	{
		messageService.removeMessage(profileName);
	}
	
	
	@GET
	@Path("/{profileName}")
	@Produces(MediaType.APPLICATION_JSON)
	public Message getMessage(@PathParam("profileName") String profileName)
	{
		return messageService.getMessage(profileName);
	}

}
