package com.MAVEN_Practies;

import org.testng.annotations.Test;

public class SecondTest {
	@Test(groups = "regression")
	public void secondTest() {
		
		System.out.println("hi");
		
	}
	
	@Test(groups = "smoke")
	public void testdata() {
		System.out.println("this is the smoke test");

}
@Test(groups = "regression")
public void testdata2() {
	System.out.println("REGRESSION");
	}
}
