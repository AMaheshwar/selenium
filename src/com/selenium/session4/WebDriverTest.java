package com.selenium.session4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebDriverTest extends SelTestCase {
	
	
	@Test
public void testCollection()
{
ElementIdentification el=new ElementIdentification(driver);
// el.linkIdentification();
	
	assert el.linkIdentification();
	 
}
}
