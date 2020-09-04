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
	
	int value=0;
	while(value!=7)
	{
		System.out.println("select the number to perform the following operations: 1.getbyid  2.check price by range 3.name the price discount 4.minimum three discounts 5.get five products by ids in descending 6.get by name or id 7.terminate");
	   System.out.println("enter the option: ");
		value=num.nextInt();
		switch (value)
	{
	case 1:
		getbyid();
		System.out.println("\n");
		break;
	case 2:
		between();
		System.out.println("\n");
		break;
	case 3:
		discount();
		System.out.println("\n");
		break;
	case 4:
		highest_discount();
		System.out.println("\n");
		break;
	case 5:
		top_five_productname();
		System.out.println("\n");
		break;
	case 6:
		call_by_id_or_name();
		top_five_productname();
		System.out.println("\n");
		break;
	case 7:
		System.out.print("terminated");
		System.out.println("\n");
		break;
	default:
		System.out.print("wrong option please enter again");
		System.out.println("\n");
		break;
	}
	}	
}

private void call_by_id_or_name() {
	System.out.println("enter the id or name");
	System.out.println("enter the id: ");
	int id=num.nextInt();
	System.out.println("enter the name: ");
	String name=alp.nextLine();
	products pro=SE.findval(id,name);
	if(pro!=null)
	{
	System.out.print(pro);
}
	else
	{
		System.out.println("value not in db");
	}
}

private void top_five_productname() {
	List<products>pro=SE.call_by_id();
	if(pro!=null)
	{
	 for(products pr:pro)
		{
			System.out.println(pr);
		}
}
	else
	{
		System.out.println("value not found in db");
	}
}

private void highest_discount() {
	System.out.println("top discount products: ");
    List<products> pro=SE.topdiscount();
    if(pro!=null)
    {
    for(products pr:pro)
	{
		System.out.println(pr);
	}
    }
    else
    {
    	System.out.println("value not found in db");
    }
    
}

public void getbyid()
{
System.out.println("enter the id value to retrive from db: ");
int id=num.nextInt();
  products pro=SE.findbyid(id);
  if(pro!=null)
  {
  System.out.println(pro);
  }
  else
  {
		System.out.println("value not found in db");
  }
}
public void between()
{
	System.out.println("enter the price low range: ");
	double price1=num.nextDouble();
	System.out.println("enter the high range: ");
	double price2=num.nextDouble();
	List<products> pro=SE.range(price1,price2);
	if(pro!=null)
	{
	for(products pr:pro)
	{
		System.out.println(pr);
	}
	}
	else
	{
		System.out.println("value not found in db");
	}
}
public void discount()
{
	System.out.println("enter the discount you except:  ");
	double price=num.nextDouble();
	List<products>pro=SE.discounts(price);
	if(pro!=null)
	{
	for(products pr:pro)
	{
		System.out.println(pr);
	}}
	else
	{
		System.out.println("value not found in db");
	}
	
}
}
