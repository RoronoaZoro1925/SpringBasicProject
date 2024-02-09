package com.in28minutes.learnspringframework.game;

public class MarioGame implements GamingConsole
{
	public void up() 
	{
		System.out.println("Jump");
	}
	
	public void down() 
	{
		System.out.println("In the hole");
	}
	
	public void left() 
	{
		System.out.println("Duck");
	}
	
	public void right() 
	{
		System.out.println("Accelerate");
	}

}
