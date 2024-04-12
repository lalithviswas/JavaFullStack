package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoApplication {

	public static void main(String[] args) {

		// OBJECT WHICH IS GENERALLY CREATED BY THE PROGRAMMER

		Fresher f = new Fresher();
		f.getSkilled();
		f.giveInterview();


		// OBJECT WHICH CAN BE CREATED BY THE SPRING APPLICATION IN TWO WAYS:

		// 1. USING XML
		
		ClassPathXmlApplicationContext context1 = new ClassPathXmlApplicationContext("ctx.xml");
		Fresher f1 = (Fresher) context1.getBean("fresh");
		f1.getSkilled();
		f1.giveInterview();

		context1.close();	
		

		// 2. USING ANNOTATIONS (for this we need to create another class file which returns a bean, here - SpringConfig.class

		AnnotationConfigApplicationContext context2 = new AnnotationConfigApplicationContext(SpringConfig.class);
		Fresher f2 = (Fresher) context2.getBean("fresh");
		f2.getSkilled();
		f2.giveInterview();

		context2.close();

	}
}