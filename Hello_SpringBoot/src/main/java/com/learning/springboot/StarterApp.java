package com.learning.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

//@SpringBootConfiguration
//@EnableAutoConfiguration
//@ComponentScan
@SpringBootApplication
@PropertySource("classpath:myProps/my.properties")
public class StarterApp {
	public static void main(String[] args) {
		// start my app here
//		SpringApplication application=new SpringApplication(StarterApp.class);
//		ConfigurableApplicationContext container = application.run(args);
//		SpringApplication.run(StarterApp.class, args);
//      College college = container.getBean(College.class);
//		System.out.println("College object : "+college);
//		college.printCollegeName();
	
		ConfigurableApplicationContext container = SpringApplication.run(StarterApp.class, args);
		MyApp myApp = container.getBean(MyApp.class);
//		System.out.println(myApp.getAppName());
	}


}
