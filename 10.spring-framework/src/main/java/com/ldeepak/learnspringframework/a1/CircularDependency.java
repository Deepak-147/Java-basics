package com.ldeepak.learnspringframework.a1;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class DependencyA {
  private DependencyB depB;
  
  public DependencyA(DependencyB depB) {
	  this.depB = depB;
  }
  
  // Use setter injection instead of constructor injection
//  public void setDependencyB(DependencyB depB) {
//	  this.depB = depB;
//  }
}

@Component
class DependencyB {
  private DependencyC depC;
  
  public DependencyB(DependencyC depC) {
	  this.depC = depC;
  }
  
  // Use setter injection instead of constructor injection
//  public void setDependencyC(DependencyC depC) {
//	  this.depC = depC;
//  }
}

@Component
class DependencyC {
  private DependencyA depA;

  public DependencyC(DependencyA depA) {
	  this.depA = depA;
  }
  
  // Use setter injection instead of constructor injection
//  public void setDependencyA(DependencyA depA) {
//	  this.depA = depA;
//  }
}

@Configuration
@ComponentScan
public class CircularDependency {
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		try (var context = new AnnotationConfigApplicationContext(CircularDependency.class)) {
			
			/**
			 * This gives error as there is a circular dependency.
			 * To resolve use setter injection, this way Spring creates beans, but the dependencies aren’t injected until they are needed.
			 */
			System.out.println(context.getBean(DependencyA.class));
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
