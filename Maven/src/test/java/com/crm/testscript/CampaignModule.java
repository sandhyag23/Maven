package com.crm.testscript;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.crm.generic.BaseClass;

public class CampaignModule extends BaseClass {
    @Test
	public static void createCampaign() throws IOException {
    String campaignname=f.getExcelData("createCampaign", 1, 0);
    String startdate=f.getExcelData("createCampaign", 1, 1);
    String enddate=f.getExcelData("createCampaign", 1, 2);
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("http://192.168.175.128:8080/crm/HomePage.do");
	driver.findElement(By.id("userName")).sendKeys("rashmi@dell.com");
	driver.findElement(By.id("passWord")).sendKeys("123456"+Keys.ENTER);
	driver.findElement(By.linkText("Campaigns")).click();
	driver.findElement(By.xpath("//input[@value='New Campaign']")).click();
	driver.findElement(By.name("property(Campaign Name)")).sendKeys("Car Expo"+Keys.ENTER);
	//driver.findElement(By.name("property(Type)")).sendKeys("Conference");
	//driver.findElement(By.name("property(Status)")).sendKeys("Active");
	//driver.findElement(By.xpath("//input[@name='property(Expected Revenue)']")).sendKeys("8000000");
	//driver.findElement(By.xpath("//input[@name='property(Actual Cost)']")).sendKeys("6500000");
	//driver.findElement(By.xpath("//input[@name='property(Num sent)']")).sendKeys("300");
	/*driver.findElement(By.xpath("//input[@name='property(Expected Response)']")).sendKeys("1500");*/
	String campName=driver.findElement(By.id("value_Campaign Name")).getText();
	Assert.assertEquals(campName, "Car Expo");
	Reporter.log("Campaign created", true);
	//System.out.println("Campaign is created");
	//driver.findElement(By.linkText("Campaigns")).click();
	//Reporter.log("Campaign page is displayed", true);
	//System.out.println("Campaign page is displayed");

	}
   @Test
    public void deleteCampaign() throws InterruptedException {
    WebDriver driver=new ChromeDriver();
    driver.findElement(By.linkText("Campaigns")).click();
    driver.findElement(By.linkText("Car Expo")).click();
    driver.findElement(By.cssSelector("input[value='Delete']")).click();
    Thread.sleep(2000);
    driver.switchTo().alert().accept();
    Reporter.log("Campaign deleted", true);
    }
}
