package com.employees;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.employees.entities.employee;
import com.employees.service.service;

@SpringBootApplication
@EnableCaching
public class appstart {
	
public static void main(String args[])
{
SpringApplication.run(appstart.class, args);
}

/*@Bean
public CacheManager method()
{
	return new ConcurrentMapCacheManager("employee");
}*/

}
