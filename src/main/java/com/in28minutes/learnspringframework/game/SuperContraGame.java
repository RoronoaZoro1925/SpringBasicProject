package com.in28minutes.learnspringframework.game;

public class SuperContraGame implements GamingConsole 
{
	public void up() 
	{
		System.out.println("Up");
	}
	
	public void down() 
	{
		System.out.println("Duck");
	}
	
	public void left() 
	{
		System.out.println("Shield");
	}
	
	public void right() 
	{
		System.out.println("Shoot");
	}


}
