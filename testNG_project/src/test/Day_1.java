package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day_1 {
	
	@Test(dataProvider="getData")
	public void firstTest(String userName, String password) {
		System.out.println("Leopa 1");
		System.out.println(userName);
		System.out.println(password);
	}

	@Test
	public void secondTest() {
		System.out.println("Leopa 2");
	}

	@DataProvider
	public Object[][] getData() {
		Object[][]data = new Object[3][2];
		data[0][0]="first User";
		data[0][1]="password_1";
		data[1][0]="second User";
		data[1][1]="password_2";
		data[2][0]="third User";
		data[3][1]="password_3";
		return data;
	}

}
