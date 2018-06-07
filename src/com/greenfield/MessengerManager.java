package com.greenfield;

import java.util.Arrays;

import com.greenfield.Message;

public class MessengerManager {
	private Message allTexts;
	private String[] otherUsers;
	/**
	 * @param allTexts
	 * @param otherUsers
	 */
	public MessengerManager(Message allTexts, String[] otherUsers) {
		this.allTexts = allTexts;
		this.otherUsers = otherUsers;
	}
	/**
	 * @return the allTexts
	 */
	public Message getAllTexts() {
		return allTexts;
	}
	/**
	 * @param allTexts the allTexts to set
	 */
	public void setAllTexts(Message allTexts) {
		this.allTexts = allTexts;
	}
	/**
	 * @return the otherUsers
	 */
	public String[] getOtherUsers() {
		return otherUsers;
	}
	/**
	 * @param otherUsers the otherUsers to set
	 */
	public void setOtherUsers(String[] otherUsers) {
		this.otherUsers = otherUsers;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Messenger [allTexts=" + allTexts + ", otherUsers=" + Arrays.toString(otherUsers) + "]";
	}
}
