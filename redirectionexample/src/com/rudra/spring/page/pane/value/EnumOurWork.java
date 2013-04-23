package com.rudra.spring.page.pane.value;

public enum EnumOurWork implements IEnumPage{
	EDUCATION("home","Education"),
	SELFHELP("ourWork", "Self Help Group"),
	GAUPROTECTION("contactUs", "Gau Protection Group"),
	SOCIALCONCERN("thankYou", "Other Social Concern"),
	HOWWE("thankYou", "How We work"),
	BEWITHUS("thankYou", "Be with Us"),
	SUGGESTION("thankYou", "Suggestion");
	private String name ;
	private String value;
	private EnumOurWork(String n, String v) {
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

