package com.webelement;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Element {
	public static void main(String []args) {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	List <WebElement> listofelement= driver.findElements(By.className("nav-a"));
	int count=listofelement.size();
	System.out.println("total count = "+count);
	for(WebElement v : listofelement) 
	{
		System.out.println(v.getText());
	}
	
	}

}
