package FactoryDesignPatters;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTestNGClass {
	
	
	@Test(dataProvider = "dp",priority=3)
	public void test1(Integer n, String s) {
		System.out.println("Test 1====>This is Iteration number " + n + " and name is " + s);

	}

	
	@Test(dataProvider = "dp",priority=1)
	public void test2(Integer n, String s) {
		System.out.println("Test 2====>This is Iteration number " + n + " and name is " + s);

	}
	
	@BeforeMethod
	public void beforeMethod() {

		System.out.println("beforeMethod");
	}

	@AfterMethod
	public void afterMethod() {

		System.out.println("afterMethod");
	}

	@DataProvider
	public Object[][] dp() {
		return new Object[][] 
				{ 
			new Object[] { 1, "Sarath" }, 
			new Object[] { 2, "Prakash" },
			};
	}

	@BeforeClass
	public void beforeClass() {

		System.out.println("beforeClass");
	}

	@AfterClass
	public void afterClass() {

		System.out.println("afterClass");
	}

	@BeforeTest
	public void beforeTest() {

		System.out.println("beforeTest");
	}

	@AfterTest
	public void afterTest() {

		System.out.println("afterTest");
	}

	@BeforeSuite
	public void beforeSuite() {

		System.out.println("beforeSuite");
	}

	@AfterSuite
	public void afterSuite() {

		System.out.println("afterSuite");
	}

}
