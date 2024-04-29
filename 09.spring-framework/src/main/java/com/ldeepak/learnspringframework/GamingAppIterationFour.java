package com.ldeepak.learnspringframework;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.ldeepak.learnspringframework.game.iterationFour.GameRunner;

// Rather than just managing the objects, we can let spring create objects for us.

@Configuration
@ComponentScan("com.ldeepak.learnspringframework.game.iterationFour")
public class GamingAppIterationFour {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (var context = new AnnotationConfigApplicationContext(GamingAppIterationFour.class)) {
//			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
