package com.appstart.config;

import org.springframework.context.annotation.Profile;

@Profile("prod")
public class production {
public void details()
{
	System.out.println("APPLICATION RUNS IN THE PRODUCTION ENVIRONMENT");
}

public production() {
	super();
	// TODO Auto-generated constructor stub
}

}
