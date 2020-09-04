package com.appstart;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.appstart.entity.products;
import com.appstart.services.SERVICE_LAYER;


@SpringBootApplication
//@ComponentScan(basePackages= {"dao"})
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
	int ch=0;
	while(ch!=4)
	{
		System.out.println("select the choice you neeed to perform  1.get_by_id  2.get_all  3.get_offers  4.terminate");
		ch=num.nextInt();
		switch (ch)
		{
		case 1:
			get_by_id();
			System.out.println("\n");
			break;
		case 2:
			getall();
			System.out.println("\n");
			break;
		case 3:
			get_offers();
			System.out.println("\n");
			break;
		case 4:
			System.out.println("terminate");
			System.out.println("\n");
			break;
		default:
			System.out.println("wrong choice please select the correct one");
			System.out.println("\n");
			break;
		}
	}
}
private void get_offers() {
System.out.println("expected offer amount : ");
double price=num.nextDouble();
List<products>pro=SE.discounts(price);
for(products pr:pro)
{
	System.out.println(pr);
}	
}
private void getall() {
List<products>pro=SE.getall();
for(products pr:pro)
{
	System.out.println(pr);
}
}
private void get_by_id() {
	List<products> pro=SE.get_by_id(100);
	for(products pr:pro)
	{
		System.out.println(pr);
	}
}


}
