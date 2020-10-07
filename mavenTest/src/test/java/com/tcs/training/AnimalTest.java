package com.tcs.training;



import static org.junit.Assert.assertNotNull;


import org.junit.Test;

public class AnimalTest {

	@Test
	public void test() {
		Carni m= new Carni();
		
	//calling carni class method
		m.characteristics();
		
	//calling mammals class method
		m.names();
		
	//calling animal class methods
		m.move();
		m.speak();
		System.out.println();
	//
		assertNotNull(m);
		
		
	}

}
