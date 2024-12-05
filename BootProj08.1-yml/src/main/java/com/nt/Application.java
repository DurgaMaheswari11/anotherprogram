package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.Company;
import com.nt.sbeans.Customer;
@EnableConfigurationProperties(Company.class)
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
		Company company = ctx.getBean("comp", Company.class);
	    System.out.println(company);
	    Customer cust=ctx.getBean("cust",Customer.class);
	    System.out.println(cust);
	    yughdhujhuhhhuhuh;
	    // No need to get the same bean again
	    ((ConfigurableApplicationContext) ctx).close();

	}

}
