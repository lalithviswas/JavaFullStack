package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("injection.xml");
		Person p = (Person) context.getBean("person");

		System.out.println(p);

		context.close();
	}

}
