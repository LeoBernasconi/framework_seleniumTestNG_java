package test;

import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Day_3 {

	@Parameter({"url", "key"})
	@Test
	public void test_A(String url, String key) {
		System.out.println("Leopa A");
		System.out.println(url);
	}

	@Test
	public void test_B() {
		System.out.println("Leopa B");
	}

	@Test
	public void test_C() {
		System.out.println("Leopa C");
	}

	
}
