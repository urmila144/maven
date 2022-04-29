package com.MAVEN_Practies;

import org.testng.annotations.Test;

public class ReadingTheDataFromCommandLineTest{
	@Test(groups = "smoke")
	public void ReadingTheDataFromCommandTest() {
		
		System.out.println("ReadingTheDataFromCommandLine");
		
		System.out.println(System.getProperty("url"));
		System.out.println(System.getProperty("username"));
		System.out.println(System.getProperty("password"));
	}
	@Test(groups = "regression")
	public void data() {
		System.out.println("this is the regression test");
		
	}


@Test(groups = "smoke")
public void fistdata() {
	System.out.println("SMOKE");
}
}


