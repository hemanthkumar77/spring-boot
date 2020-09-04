package com.appstart;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;

import com.appstart.entity.products;
import com.appstart.services.SERVICE_LAYER;


@SpringBootApplication
public class APP implements CommandLineRunner {
Scanner num=new Scanner(System.in);
Scanner alp=new Scanner(System.in);
	@Autowired
	SERVICE_LAYER SE;
public static void main(String args[])
{
	ConfigurableApplicationContext appconn=SpringApplication.run(APP.class, args);
}
@Override
public void run(String... args) throws Exception {
getdiscounts();
}

private void getdiscounts() {
	System.out.println("enter the discount amount excepted: ");
	double price=num.nextInt();
	List<products>pro=SE.getdiscounts(price,new PageRequest(0,6,Direction.DESC,"discount"));
	for(products pr:pro)
	{
		System.out.println(pr);
	}
}



}
