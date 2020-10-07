package com.tcs.training;

//This is sub class (Derive properties from Animal class)
public class Reptiles extends Animal {

	public Reptiles() {
		super("Reptiles");
		// TODO Auto-generated constructor stub
	}

	//print some Reptiles species name
	public void names()
	 {
		 System.out.println("\n****** Reptiles class****");
		 System.out.println("Name: Snakes, lizards, crocodiles");
	 }
}
