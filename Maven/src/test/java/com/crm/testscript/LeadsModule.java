package com.crm.testscript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LeadsModule {
    @Test
	public void createLeads() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://192.168.175.128:8080/crm/HomePage.do");
		driver.findElement(By.id("userName")).sendKeys("rashmi@dell.com");
		driver.findElement(By.id("passWord")).sendKeys("123456"+Keys.ENTER);
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.xpath("//input[@value='New Lead']")).click();
		driver.findElement(By.name("property(First Name)")).sendKeys("Nayana"+Keys.ENTER);
		//driver.findElement(By.name("property(Company)")).sendKeys("Smart Company");
		//driver.findElement(By.name("property(Last Name)")).sendKeys("Krishna");
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Krishna");
		driver.findElement(By.name("property(Mobile)")).sendKeys("9900256348"+Keys.ENTER);
	
		
	}
}
