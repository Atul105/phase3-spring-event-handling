package com.simplilearn.webapp.bean;

import org.springframework.context.ApplicationEvent;

public class CustomEvent extends ApplicationEvent{

	private static final long serialVersionUID = 1L;

	public CustomEvent(Object source) {
		super(source);
		// TODO Auto-generated constructor stub
	}
	
	public String toString() {
		return "--This Is A Custom Event--";
	}
	
	

}
