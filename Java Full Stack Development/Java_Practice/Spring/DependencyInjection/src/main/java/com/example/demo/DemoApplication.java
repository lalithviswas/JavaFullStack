package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoApplication {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ctx.xml");
		Classroom cr = (Classroom) context.getBean("classroom");

		System.out.println(cr);

		context.close();		
	}
}
