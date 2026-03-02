package com.edison.springdebug;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringDebugApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDebugApplication.class, args);

		ClassPathXmlApplicationContext ctx =
				new ClassPathXmlApplicationContext("applicationContext.xml");

		HelloService helloService = ctx.getBean(HelloService.class);
		helloService.sayHello();

		ctx.close();
	}

}
