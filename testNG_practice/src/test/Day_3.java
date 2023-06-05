package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day_3 {

	@BeforeClass
	public void beforeClass() {
		System.out.println("D3 - Before class");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("D3 - After class");
	}
	
	@Test(groups= {"smoke"})
	public void webLogin_carLoan() {
		System.out.println("D3 - webLogin_carLoan");
		//Selenium
	}
	
	@Test(dependsOnMethods= {"MobileLogin_2_carLoan"})//Indicates that this test should be executed before "MobileLogin_2_carLoan". Several test may be added on the ()
	public void MobileLogin_1_carLoan() {
		System.out.println("D3 - MobileLogin_1_carLoan");
		//Appium automation
	}

	@Test
	public void MobileLogin_2_carLoan() {
		System.out.println("D3 - MobileLogin_2_carLoan");
		//Appium automation
	}

	@Parameters({"url"})//Takes data from the xml file
	@BeforeSuite
	public void beforeSuite(String url) {
		System.out.println("D3 - Something at the very beginning");
		System.out.println("URL: " + url);
	}
	
	@Parameters({"url","username"})//Takes data from the xml file
	@Test
	public void MobileLogin_3_carLoan(String url, String username) {
		System.out.println("D3 - MobileLogin_3_carLoan");
		System.out.println(url);
		System.out.println(username);
		//Appium automation
	}

	@AfterMethod
	public void beforeMethod() {
		System.out.println("D3 - After method");
	}
	
	@Test
	public void APILogin_carLoan() {
		System.out.println("D3 - APILogin_carLoan");
		//Rest API automation
	}

}
