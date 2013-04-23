package com.rudra.spring.page.value;

public enum MessageValue {
	HOME("I am Home"),
	EVENTS("I am Events"),
	OURWORK("I am Our Work"),
	THANKYOU("I am Thank You"),
	CONTACTUS("I am Contact Us"),
	ABOUTUS("I am About Us");
	private String message;
	MessageValue(String m) {
		setMessage(m);
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
