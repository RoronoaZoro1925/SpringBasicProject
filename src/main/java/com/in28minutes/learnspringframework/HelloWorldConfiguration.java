package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age) {};

record Address(String firstline, String city) {};

@Configuration
public class HelloWorldConfiguration 
{
	@Bean
	public String name() 
	{
		return "Sarthak";
		
	}
	
	@Bean
	public int age() 
	{
		return 24;
	}
	
	@Bean
	public Person person() 
	{
		var Person = new Person("Shriansh", 24);
		return Person;
		
	}
	
	@Bean
	public Address address() 
	{
		var Address = new Address("Telephone Nagar", "Indore");
		return Address;
	}

}
