package com.ldeepak.learnspringframework;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ldeepak.learnspringframework.game.iterationThree.GamingConfiguration;
import com.ldeepak.learnspringframework.game.iterationThree.GameRunner;

// Using Spring Bean
public class GamingAppIterationThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
//			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
