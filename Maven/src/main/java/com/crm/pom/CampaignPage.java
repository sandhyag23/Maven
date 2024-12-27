package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CampaignPage {

	@FindBy(xpath="//input[@name='property(Campaign Name)']")
	private WebElement campaignnameTbx;
	@FindBy(xpath="//select[@name='property(Type)']")
	private WebElement typelistBox;
	@FindBy(xpath="//input[@name='property(Start Date)']")
	private WebElement startdate;
	@FindBy(xpath="//select[@name='property(Status)']")
	private WebElement statuslistBox;
	@FindBy(xpath="//input[@name='property(End Date)']")
	private WebElement enddateTbx;
	@FindBy(xpath="//input[@name='property(Expected Revenue)']")
	private WebElement expactedrevenuTbx;
	@FindBy(xpath="//input[@name='property(Actual Cost)']")
	private WebElement actualcostTbx;
	@FindBy(xpath="//input[@name='property(Num sent)']")
	private WebElement numsentTbx;
	@FindBy(xpath="//input[@name='property(Budgeted Cost)']")
	private WebElement budgetedcost;
	@FindBy(xpath="//input[@name='property(Expected Response)']")
	private WebElement exceptedresponse;
	@FindBy(xpath="//input[@value='Save']")
	private WebElement savebutton;
	
	public CampaignPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getCampaignnameTbx() {
		return campaignnameTbx;
	}

	public WebElement getTypelistBox() {
		return typelistBox;
	}

	public WebElement getStartdate() {
		return startdate;
	}

	public WebElement getStatuslistBox() {
		return statuslistBox;
	}

	public WebElement getEnddateBx() {
		return enddateTbx;
	}

	public WebElement getExpactedrevenuTbx() {
		return expactedrevenuTbx;
	}

	public WebElement getActualcostTbx() {
		return actualcostTbx;
	}

	public WebElement getNumsentTbx() {
		return numsentTbx;
	}

	public WebElement getBudgetedcost() {
		return budgetedcost;
	}

	public WebElement getExceptedresponse() {
		return exceptedresponse;
	}

	public WebElement getSavebutton() {
		return savebutton;
	}
	
}
