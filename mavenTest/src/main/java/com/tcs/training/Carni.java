package com.tcs.training;

//This is sub class (Derive properties from Mammals class)

public class Carni extends Mammals {

	public Carni() {
		// TODO Auto-generated constructor stub
		//System.out.println("This is  carnivorous");
	}
	

	////print characteristics of carnivorous
	public void characteristics()
	{
		System.out.println("\n**************Carni Class*************");
		System.out.println("Mammals that eat only meat are carnivorous");
	}
}
