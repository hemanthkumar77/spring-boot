package com.appstart;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

import com.appstart.entity.products;
import com.appstart.services.SERVICE_LAYER;


@SpringBootApplication
@EnableAsync
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
	asyncmethod();
}

private void asyncmethod() throws Exception {
	CompletableFuture<products>pro=SE.getdetails(100);
	products prod= pro.get(15,TimeUnit.SECONDS);
	System.out.println(prod);
}

}
