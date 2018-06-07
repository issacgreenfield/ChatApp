package com.greenfield;

public class ActiveUsers {
	private String[] usernames;
	
	/**
	 * @param usernames
	 */
	public ActiveUsers(String[] usernames) {
		super();
		this.usernames = usernames;
	}
	
	/**
	 * @return the usernames
	 */
	public String[] getUsernames() {
		return usernames;
	}

	/**
	 * @param usernames the usernames to set
	 */
	public void setUsernames(String[] usernames) {
		this.usernames = usernames;
	}

	
}
