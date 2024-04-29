package com.ldeepak.learnspringframework.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

// Configure the things that we want Spring to manage
@Configuration
public class HelloWorldConfiguration {
	// Spring bean is an object that form the backbone of your application and that is managed by the Spring IoC container. 
	// A bean is an object that is instantiated, assembled, and otherwise managed by a Spring IoC container. 
	// Otherwise, a bean is simply one of many objects in your application.
	
	// Indicates that a method produces a bean to be managed by the Spring container.
	@Bean
	public String name() {
		return "Deepak";
	}
	
	@Bean
	public int age() {
		return 15;
	}
	
	@Bean
	public Person person() {
		var person = new Person("Ranga", 20);
		return person;
	}
	
	// Default name of the bean is the method name. But it can be changed like so.
	@Bean(name = "myBean")
	public Person person2() {
		var person = new Person("Deepak", 30);
		return person;
	}
	
	// Bean using existing beans
	@Bean
	public Person person3(String name, int age) {
		var person = new Person(name, age);
		return person;
	}
	
	// This is the primary bean for type Person
	@Bean
	@Primary
	public Person person4() {
		var person = new Person("Test", 30);
		return person;
	}
}
