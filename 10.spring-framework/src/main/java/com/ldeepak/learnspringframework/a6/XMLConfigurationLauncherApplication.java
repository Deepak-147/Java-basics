package com.ldeepak.learnspringframework.a6;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class XMLConfigurationLauncherApplication {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (var context = new ClassPathXmlApplicationContext("contextConfiguration.xml")) {
			
			System.out.println(context.getBean("name"));
			
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
