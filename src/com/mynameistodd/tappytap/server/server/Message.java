package com.mynameistodd.tappytap.server.server;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

/**
 * Created by ckempton on 9/7/13.
 * A Message is a text that a User has sent.  It can be reused.
 */
@Entity
public class Message {
	
	@Id Long id;
	String message;
	
	private Message() {}
	
	public Message(String message) {
		this.message = message;
	}
}
