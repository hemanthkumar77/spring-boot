package com.appstart.config;

import org.springframework.context.annotation.Profile;

@Profile("dev")
public class developer {
	
public void details()
{
	System.out.println("APPLICATION RUNS IN DEVELOPER ENVIRONEMENT");
}

public developer() {
	super();
	// TODO Auto-generated constructor stub
}

}
