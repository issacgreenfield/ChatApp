package Model;

public class Message {
	private final String fromUsername;
	private final String[] toUsernames;
	private final String messageText;
	
	public Message()
	{
		this.fromUsername = new String("test");
		this.toUsernames = new String[1];
		this.toUsernames[0] = new String("test");
		this.messageText = new String("This is a default test message");
	}
	
	public Message(String fromUsername, String[] toUsernames, String messageText)
	{
		this.fromUsername = new String(fromUsername);
		this.toUsernames = new String[toUsernames.length];
		for (int i = 0; i < this.toUsernames.length; i++)
		{
			this.toUsernames[i] = new String(toUsernames[i]);
		}
		this.messageText = new String(messageText);
	}
	
	public String getFromUsername()
	{
		return this.fromUsername;
	}
	
	public String[] getToUsernames()
	{
		return this.toUsernames;
	}
	
	public String getMessageText()
	{
		return this.messageText;
	}
}
