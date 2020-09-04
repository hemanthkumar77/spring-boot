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
	@Autowired
	SERVICE_LAYER SE;
	Scanner obj=new Scanner(System.in);
public static void main(String args[])
{
	ConfigurableApplicationContext appconn=SpringApplication.run(APP.class, args);
}

@Override
public void run(String... args) throws Exception {
	//get_by_id();
	//get_cart();
	deals();
}

private void deals() {
	System.out.println("enter the deal amount you want: ");
	double price=obj.nextDouble();
	 List<products>pro=SE.getdeals(price);
	 if(pro!=null)
	 {
	 for(products pr:pro)
	 {
	 	System.out.println(pr);
	 }
	 }
	 else
	 {
	 	System.out.println("not found in db");
	 }
	 
}

private void get_cart() {
List<products>pro=SE.get_all();
if(pro!=null)
{
for(products pr:pro)
{
	System.out.println(pr);
}
}
else
{
	System.out.println("not found in db");
}
}

private void get_by_id() {
	System.out.println("enter the id please: ");
	int id=obj.nextInt();
	products pro=SE.get_by_id(id);
	if(pro!=null)
	{
    System.out.println(pro);
	}
	else
	{
		System.out.println("not found in db");
	}
}


}
