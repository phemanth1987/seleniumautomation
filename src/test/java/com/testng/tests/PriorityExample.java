package com.testng.tests;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class PriorityExample {
  @Test(priority = 1)
  public void c_test() {
	  Assert.fail("c_test is a failure test case");
  }
  
  @Test(priority = 2, alwaysRun = true)
  public void a_test() {
	  System.out.println("Test 2");
  }
  
  @Test(priority = 3, alwaysRun = false)
  public void b_test() {
	  throw new SkipException("Skipping b_test()..");
  }
  
  
}
