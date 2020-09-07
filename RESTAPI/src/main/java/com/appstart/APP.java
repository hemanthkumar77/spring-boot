package com.appstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
public class APP {
public static void main(String args[])
{
	ConfigurableApplicationContext appconn=SpringApplication.run(APP.class, args);
}
}
