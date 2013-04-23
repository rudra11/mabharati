package com.rudra.spring.page.pane.value;

public enum EnumEvents implements IEnumPage{
	CURRENTEVENTS("home","Current Events"),
	PLANNEDEVENTS("ourWork", "planned Events"),
	HISTORY("contactUs", "Events History"),
	SUGGESTUS("thankYou", "Suggests Us");
	private String name ;
	private String value;
	private EnumEvents(String n, String v) {
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
