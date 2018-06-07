package com.greenfield;

import java.util.Arrays;

public class Message {
	private String fromUsername;
	private String[] toUsernames;
	private String messageText;
	/**
	 * @param fromUsername
	 * @param toUsernames
	 * @param messageText
	 */
	public Message(String fromUsername, String[] toUsernames, String messageText) {
		this.fromUsername = fromUsername;
		this.toUsernames = toUsernames;
		this.messageText = messageText;
	}
	/**
	 * @return the fromUsername
	 */
	public String getFromUsername() {
		return fromUsername;
	}
	/**
	 * @param fromUsername the fromUsername to set
	 */
	public void setFromUsername(String fromUsername) {
		this.fromUsername = fromUsername;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Message [fromUsername=" + fromUsername + ", toUsernames=" + Arrays.toString(toUsernames)
				+ ", messageText=" + messageText + "]";
	}
	/**
	 * @return the toUsernames
	 */
	public String[] getToUsernames() {
		return toUsernames;
	}
	/**
	 * @param toUsernames the toUsernames to set
	 */
	public void setToUsernames(String[] toUsernames) {
		this.toUsernames = toUsernames;
	}
	/**
	 * @return the messageText
	 */
	public String getMessageText() {
		return messageText;
	}
	/**
	 * @param messageText the messageText to set
	 */
	public void setMessageText(String messageText) {
		this.messageText = messageText;
	}
	
}

