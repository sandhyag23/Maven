package com.crm.testscript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AccountsModule {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("http://192.168.175.128:8080/crm/HomePage.do");
	driver.findElement(By.id("userName")).sendKeys("rashmi@dell.com");
	driver.findElement(By.id("passWord")).sendKeys("123456"+Keys.ENTER);
	driver.findElement(By.linkText("Accounts")).click();
	driver.findElement(By.xpath("//input[@onclick='createAction()']")).click();
	driver.findElement(By.xpath("//input[@name='property(Account Name)']")).sendKeys("tyco");
	WebElement ele=driver.findElement(By.name("property(Rating)"));
	ele.click();
	Select s=new Select(ele);
	s.selectByValue("Acquired");
	driver.findElement(By.name("property(Phone)")).sendKeys("9900253314");
	driver.findElement(By.name("property(Website)")).sendKeys("www.tyco.com");
	WebElement ele1=driver.findElement(By.name("property(Account Type)"));
	ele1.click();
	Select s1=new Select(ele1);
	s1.selectByValue("Customer");
	driver.findElement(By.xpath("//input[@name='property(Employees)']")).sendKeys("300");
	driver.findElement(By.name("property(Industry)")).sendKeys("Small/Medium Enterprises");
	driver.findElement(By.name("property(Ownership)")).sendKeys("Private");
	driver.findElement(By.xpath("//input[@name='property(Annual Revenue)']")).sendKeys("500000");
	driver.findElement(By.xpath("//input[@name='property(Billing Street)']")).sendKeys("HSR Layout");
	driver.findElement(By.xpath("//input[@name='property(Billing City)']")).sendKeys("Bengaluru");
	driver.findElement(By.xpath("//input[@name='property(Billing State)']")).sendKeys("Karnataka");
	driver.findElement(By.xpath("//input[@name='property(Billing Code)']")).sendKeys("570022");
	driver.findElement(By.xpath("//input[@name='property(Billing Country)']")).sendKeys("India");
	driver.findElement(By.id("copyAddress")).click();
	driver.findElement(By.xpath("//td[text()='Billing to Shipping']")).click();
	driver.findElement(By.xpath("//input[@value='Save']")).click();
	System.out.println("Account is created");
	driver.findElement(By.linkText("Accounts")).click();
	driver.findElement(By.xpath("//input[@name='searchString']")).sendKeys("tyco");
	driver.findElement(By.xpath("//input[@type='button' and @value='Go']")).click();
	System.out.println("tyco account is displayed");
	
	
}
}
