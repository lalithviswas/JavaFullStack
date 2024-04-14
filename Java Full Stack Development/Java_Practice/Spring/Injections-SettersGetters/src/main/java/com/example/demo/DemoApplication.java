package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("injections.xml");
		
		Laptop lpy = (Laptop) context.getBean("lappy");

		System.out.println(lpy);

		context.close();
	}

}
