package com.training.assignment3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		//loading the container
		ClassPathXmlApplicationContext myContext = 
				new ClassPathXmlApplicationContext("applicationContextAssignment3.xml");
		//creating the object
		JavaLanguage newWorld = myContext.getBean("javaWorld", JavaLanguage.class);
		
		//calling the method using the object
		System.out.println(newWorld.learningJava());
		
		//closing the container
		myContext.close();

	}

}
