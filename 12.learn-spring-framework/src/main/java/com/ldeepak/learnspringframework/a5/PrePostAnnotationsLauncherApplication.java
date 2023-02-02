package com.ldeepak.learnspringframework.a5;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;


@Component
class SomeClass {
	private SomeDependency someDependency;
	
	public SomeClass(SomeDependency someDependency) {
		super();
		this.someDependency = someDependency;
		System.out.println("All dependencies are ready");
	}
	
	// The PostConstruct annotation is used on a method that needs to be executed after dependency injection is done to perform any initialization. 
	@PostConstruct
	public void initialize() {
		someDependency.getReady();
	}
	
	// The PreDestroy annotation is used on a method as a callback notification to signal that the instance is in the process of being removed by the container. 
	// The method annotated with PreDestroy is typically used to release resources that it has been holding.
	@PreDestroy
	public void cleanUp() {
		System.out.println("Cleanup");
	}
}

@Component
class SomeDependency {

	public void getReady() {
		System.out.println("Some logic using dependency");
		
	}
	
}

@Configuration
@ComponentScan
public class PrePostAnnotationsLauncherApplication {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (var context = new AnnotationConfigApplicationContext(PrePostAnnotationsLauncherApplication.class)) {
			
			
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
