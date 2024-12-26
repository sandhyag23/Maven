package com.crm.testscript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CampaignModule {
    @Test
	public void createCampaign() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("http://192.168.175.128:8080/crm/HomePage.do");
	driver.findElement(By.id("userName")).sendKeys("rashmi@dell.com");
	driver.findElement(By.id("passWord")).sendKeys("123456"+Keys.ENTER);
	driver.findElement(By.linkText("Campaigns")).click();
	driver.findElement(By.xpath("//input[@value='New Campaign']")).click();
	driver.findElement(By.name("property(Campaign Name)")).sendKeys("car expo"+Keys.ENTER);
	//driver.findElement(By.name("property(Type)")).sendKeys("Conference"+Keys.ENTER);
	//driver.findElement(By.name("property(Status)")).sendKeys("Active");
	//driver.findElement(By.xpath("//input[@name='property(Expected Revenue)']")).sendKeys("8000000");
	//driver.findElement(By.xpath("//input[@name='property(Actual Cost)']")).sendKeys("6500000");
	//driver.findElement(By.xpath("//input[@name='property(Num sent)']")).sendKeys("300");
	/*driver.findElement(By.xpath("//input[@name='property(Expected Response)']")).sendKeys("1500");
	driver.findElement(By.xpath("//input[@name='property(Start Date)']")).sendKeys("12/27/2024");
	driver.findElement(By.xpath("//input[@name='property(End Date)']")).sendKeys("12/30/2024");
	driver.findElement(By.xpath("//input[@name='property(Budgeted Cost)']")).sendKeys("50000");*/
	System.out.println("Campaign is created");
	driver.findElement(By.linkText("Campaigns")).click();
	System.out.println("Campaign page is displayed");

	}
}
