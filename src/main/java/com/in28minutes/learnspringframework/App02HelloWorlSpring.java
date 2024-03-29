package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.PacmanGame;
import com.in28minutes.learnspringframework.game.SuperContraGame;

public class App02HelloWorlSpring {

	public static void main(String[] args) 
	{
//		Launch a spring context
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
//		Configure
		System.out.println(context.getBean("name"));
		
		System.out.println(context.getBean("person"));
		
		System.out.println(context.getBean("address"));

	}

}
