package com.TestNg.Demo;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
	@BeforeTest	public void BeforeTest()
	{
		System.out.println("Before Test");
	}
	@Test
	public void Test()
	{
		System.out.println("Test Demo");	
	}
	@AfterTest
	public void AfterTest()
	{
		System.out.println("After Test");
	}
}
