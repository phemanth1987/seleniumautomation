package com.testng.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
 
public class ParameterTest {
	
	//Example for TestNG.xml
    /**
     * Following method takes one parameter as input. Value of the
     * said parameter is defined at suite level.
     */
    @Parameters({ "suite-param" })
    @Test
    public void prameterTestOne(String param) {
        System.out.println("Test one suite param is: " + param);
    }
 
    /**
     * Following method takes one parameter as input. Value of the
     * said parameter is defined at test level.
     */
    @Parameters({ "test-two-param" })
    @Test
    public void prameterTestTwo(String param) {
        System.out.println("Test two param is: " + param);
    }
 
    /**
     * Following method takes two parameters as input. Value of the
     * test parameter is defined at test level. The suite level
     * parameter is overridden at the test level.
     */
    @Parameters({ "suite-param", "test-three-param" })
    @Test
    public void prameterTestThree(String param, int paramTwo) {
        System.out.println("Test three suite param is: " + param);
        System.out.println("Test three param is: " + paramTwo);
    }
    
    
    
    
    
    
    ///Example for DatProviders
    
    @DataProvider(name = "Authentication")
    public static Object[][] credentials() {

          return new Object[][] { 
        	  { "testuser_1", "Test@1" }, 
        	  { "testuser_2", "Test@1" },
        	  { "testuser_3", "Test@1"}
          	};
          }

//    }

    // Here we are calling the Data Provider object with its Name

    @Test(dataProvider = "Authentication")
    public void dataproviderTest(String sUsername, String sPassword) {
    	
    	System.out.println("The usrename is : "+sUsername);
    	System.out.println("The password is : "+sPassword);
    	
    }
    
    
}