package com.training.assignment2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		//loading the container
		ClassPathXmlApplicationContext myContext = 
				new ClassPathXmlApplicationContext("applicationContextAssignmnet2.xml");
		//creating the object
		JavaLanguage newWorld = myContext.getBean("Framework", JavaLanguage.class);
		
		//calling the method using the object
		System.out.println(newWorld.learningJava());
		System.out.println(newWorld.learningPython());
		
		//closing the container
		myContext.close();

	}

}
