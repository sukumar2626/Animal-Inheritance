package com.tcs.training;

//This is sub class (Derive properties from Animal class)

public class Mammals extends Animal {
	//public static String nspecies="Mammals";
	
	public Mammals()
	{
		super("Mammals");
		
	}
	
	//print some Mammals  name
	 public void names()
	 {
		 System.out.println("\n****** Mammals class****");
		 System.out.println("Name: dogs, cats, horses");
	 }
}
