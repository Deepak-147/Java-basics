package com.ldeepak.learnspringframework.helloworld;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorldSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (
			//1. Launch a Spring context
			var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
			
			// 2. Retrieving beans managed by Spring
			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age"));
			System.out.println(context.getBean("person")); // user defined type
			System.out.println(context.getBean("myBean")); // user defined type
			System.out.println(context.getBean("person3")); // user defined type
			System.out.println(context.getBean(Person.class)); // getting bean by type. This will throw an exception as multiple matching candidate beans are found and if there is no any primary bean defined.
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
