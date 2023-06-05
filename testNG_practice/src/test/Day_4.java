package test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day_4 {

	@Test
	public void webLogin_homeLoan() {
		System.out.println("D4 - webLogin_homeLoan");
		Assert.assertTrue(false);
		//Selenium
	}
	
	@Test(dataProvider="getData")
	public void MobileLogin_homeLoan(String username, String password) {
		System.out.println("User " + username + " and pass " + password);
		//Appium automation
	}

	@Test(groups= {"smoke"})
	public void APILogin_homeLoan() {
		System.out.println("D4 - APILogin_homeLoan");
		//Rest API automation
	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[3][2]; //3 means the number of iterations and 2 it's the number of values to send
		//1st iteration
		data[0][0]="Leopa";
		data[0][1]="123";
		//2ns iteration
		data[1][0]="Richard";
		data[1][1]="456";
		//3rd iteration
		data[2][0]="Paola";
		data[2][1]="789";
		return data;
	}
}
