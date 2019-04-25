package com.basic.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.basic.main.TestBase;

public class WebTableExample extends TestBase{

	public static void main(String[] args) {
		
		//Initialize WebDriver
		getWebDriver("chrome");
		
		//Navigate to URL
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		
		//Identify WebTable Header element
		WebElement table_head = driver.findElement(By.xpath("//table[@class='dataTable']/thead"));
		
		//Print all Column Headers
		List<WebElement> headers = table_head.findElements(By.tagName("th"));
		//Print no of cols
		int colCnt = headers.size();
		System.out.println("Number of Headers in table : "+colCnt);

		//Identify WebTable element
		WebElement table_body = driver.findElement(By.xpath("//table[@class='dataTable']/tbody"));
		
		//Get all rows of the table body
		List<WebElement> table_rows = table_body.findElements(By.tagName("tr"));
		
		//Print no of rows
		int rwCnt = table_rows.size();
		System.out.println("Number of rows in table : "+rwCnt);
		
		//Loop to print Headers
		for(WebElement header : headers) {
			//Print Column Data
			System.out.print(header.getText()+ "    ");
			
		}
		System.out.println();
		boolean dataFound = false;
		//Loop to Iterate on each row
		for(int i=0; i< rwCnt; i++) {
			//Get all columns of that row
			List<WebElement> columns = table_rows.get(i).findElements(By.tagName("td"));
			String companyName = columns.get(0).getText();
			//System.out.println("Current row no:"+(i+1));
			//Filtering based on Company Name
			if(companyName.equalsIgnoreCase("HDIL")) {
				dataFound = true;
				//Loop to Iterate on Columns using normal for loop
				for(WebElement column : columns) {
					//Print Column Data
					System.out.print(column.getText()+ "    ");
				}
				
				break;
			}
			//Logic to handle data not found scenario
			else if(i==rwCnt-1 && dataFound== false) {
				System.out.println("HDIL company not found");
			}
			
			//System.out.println();
		}
		
		cleanUp();
			

	}

}
