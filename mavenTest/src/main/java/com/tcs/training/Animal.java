package com.tcs.training;

//This is super class
public class Animal {
	
	public String name;
	
	public Animal(String nspecies)
	{
		name=nspecies;
	}
	
	public void speak()   
	{
		System.out.println("\n****** Animal class****");
		System.out.println(name+" can speak");
	}
	public void move()
	{
		System.out.println("\n******Animal class****");
		System.out.println(name+" can move");
	}


}
