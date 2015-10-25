package com.selenium.session4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementIdentification {

	private WebDriver driver;
	
	
	public ElementIdentification(WebDriver driver)
	{
		this.driver=driver;
	}
	List<String>expectedLanguages;
	List<String>actualLanguages;
	public boolean linkIdentification(){
		

		expectedLanguages=Arrays.asList("हिन्दी","मराठी","తెలుగు","தமிழ்");
		actualLanguages = new ArrayList<String>();
		
		driver.get("http://www.google.co.in/");
		
		List<WebElement> anchorList=driver.findElements(By.tagName("a"));
		
		for(WebElement element:anchorList){
			System.out.println(element.getText());
			actualLanguages.add(element.getText());
		}
		return true;
	}
}
