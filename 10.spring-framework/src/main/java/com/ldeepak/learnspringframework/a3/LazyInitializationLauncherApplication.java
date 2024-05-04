package com.ldeepak.learnspringframework.a3;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA {
	
}

// By default it is Eager initialization (The bean is initialized even before it is used).
// In Lazy initialization, the initialization will happen only on use.
@Component
@Lazy
class ClassB {
	
	private ClassA classA;
	
	public ClassB(ClassA classA) {
		// Complex initialization logic
		System.out.println("Initialization called");
		this.classA = classA;
	}
	
	public void doSomething() {
		System.out.println("Do something");
	}
}

@Configuration
@ComponentScan
public class LazyInitializationLauncherApplication {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (var context = new AnnotationConfigApplicationContext(LazyInitializationLauncherApplication.class)) {
			
//			context.getBean(ClassA.class); // only ClassA bean will be created, ClassB bean is not created as it is marked Lazy.
			context.getBean(ClassB.class).doSomething(); // Both ClassA and ClassB bean will be created.
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
