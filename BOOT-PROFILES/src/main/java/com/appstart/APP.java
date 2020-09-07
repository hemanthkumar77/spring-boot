package com.appstart;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.appstart.config.developer;
import com.appstart.config.production;
import com.appstart.config.support;

@SpringBootApplication
public class APP implements CommandLineRunner{
	@Autowired
	private DataSource DS;
public static void main(String args[])
{
	SpringApplication.run(APP.class, args);
}

public void run(String... args) throws Exception {
	System.out.println("INFO: "+DS);
	new support().details();
}

}
