package com.automationpractice;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class validateAnnotations {
  
	/**
	 * This test is for open the bw
	 * @param user
	 */
	@Test(priority=1, groups="group2", description="This test open the browser")
	  public void openBrowser() {
		SoftAssert softAssert = new SoftAssert();
			System.out.println("Open Browser");
			Assert.assertEquals("aa", "aa");
			AssertJUnit.assertEquals("a", "a");
					
			softAssert.assertAll();
	  }

@Parameters({"user"})
@Test( priority=2, groups="group2",dependsOnMethods ="openBrowser")
  public void login(@Optional("epacolombia@gmail.com") String user) {
		System.out.println("login with user: " + user);
  }
	
	@Test(priority=3, groups={"group1","group2"})
	  public void signUp() {
			System.out.println("sign Up");
	}
	
	@Test(priority=4, groups={"group1","group2"})
	  public void search() {
			System.out.println("search");
	}
  
 

	@BeforeMethod
	  public void beforeMethod() {
		  System.out.println("Before Method");
	  }

	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("After Method");
	  }
	  
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before Suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After Suite");
  }

}
