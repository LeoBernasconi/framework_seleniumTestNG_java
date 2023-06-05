package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day_2 {
	
	@AfterTest
	public void anotherLoan() {
		System.out.println("D2 - I will execute last");
	}
	
	@Test(enabled=false)//Skip the test when executing
	public void pLoan() {
		System.out.println("D2 - good");
	}
	
	@AfterSuite
	public void afterSUITE(){
		System.out.println("D2 - Executed at the very end");
	}

	@BeforeTest
	public void prerequisite() {
		System.out.println("D2 - I will execute first");
	}

	@Test(groups= {"smoke"})
	public void anotherTest() {
		System.out.println("D2 - anotherTest");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("D2 - Before method");
	}

	
	
}
