package com.rudra.spring.page.pane.value;

public enum EnumAboutUs implements IEnumPage{
	INTIALSPARK("home","The Intial Spark"),
	VISION("ourWork", "Vision"),
	OURFAMILY("contactUs", "Our Family"),
	OURPRIORITIES("thankYou", "Our priorities");
	private String name ;
	private String value;
	private EnumAboutUs(String n, String v) {
		setName(n);
		setValue(v);
	}
	@Override
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
}
