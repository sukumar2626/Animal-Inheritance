package com.tcs.training;

//This is sub class (Derive properties from Animal class)
public class Bird extends Animal {

	public Bird() {
		super("Bird");
		// TODO Auto-generated constructor stub
	}
	
	//print some Birds name
	public void names()
	 {
		 System.out.println("\n****** Bird class****");
		 System.out.println("Name: owl, dove, pigeon");
	 }

}
