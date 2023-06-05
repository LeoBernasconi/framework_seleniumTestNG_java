package test;

import org.testng.annotations.Test;

public class Day_1 {

	
	
	@Test(groups= {"smoke"})
	public void Demo() {
		System.out.println("D1 - Hello Leo");
	}
	

	@Test(timeOut=40000)//Set a special timeout for this test. Only after 40 second will fail
	public void secondTest() {
		System.out.println("D1 - Bye");
	}
	
}
