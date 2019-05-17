package com.testng.tests;

import java.lang.reflect.Method;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParalleExecutionExample {
	@BeforeMethod
	public void before(Method m) {
		long id = Thread.currentThread().getId();
		System.out.println("Thread of Before method for test "+m.getName()+" is :"+id);
	}
	
  @Test
  public void test_one() {
	  long id = Thread.currentThread().getId();
	  System.out.println("Test method One thread is :"+id);
  }
  
  @Test
  public void test_two() throws InterruptedException {
	  long id = Thread.currentThread().getId();
	  Thread.sleep(3000);
	  System.out.println("Test method Two thread is :"+id);
  }
  
  @Test(threadPoolSize = 2, invocationCount = 4)
  public void test_three() {
	  long id = Thread.currentThread().getId();
	  System.out.println("Test method Three thread is :"+id);
  }
  
  @AfterMethod
	public void after(Method m) {
		long id = Thread.currentThread().getId();
		System.out.println("Thread of After method for test "+m.getName()+" is :"+id);
	}
}
