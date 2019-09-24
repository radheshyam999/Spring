package io;

public class Message {
private String message;

public String getMessage() {
	System.out.println("i am message" +message);
	return message;
}

public void setMessage(String message) {
	this.message = message;
}
}
