package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadsPage {

	@FindBy(xpath="//input[@name='property(Company)']")
	private WebElement companynameTbx;
	@FindBy(xpath="//input[@name='property(First Name)']")
	private WebElement firstnameTbx;
	@FindBy(xpath="//input[@name='property(Last Name)")
	private WebElement lastnameTbx;
	@FindBy(xpath="//input[@name='property(Designation)")
	private WebElement designationTbx;
	@FindBy(xpath="//input[@name='property(Email)']")
	private WebElement emailTbx;
	@FindBy(xpath="//input[@name='property(Phone)']")
	private WebElement phoneTbx;
	@FindBy(xpath="//input[@name='property(Mobile)']")
	private WebElement mobileTbx;
	@FindBy(xpath="//input[@name='property(Fax)']")
	private WebElement foxTbx;
	@FindBy(xpath="//input[@name='property(Website)']")
	private WebElement websiteTbx;
	@FindBy(xpath="//select[@name='property(Lead Source)']")
	private WebElement leadsourcelistBox;
	@FindBy(xpath="//select[@name='property(Industry)']")
	private WebElement industrylistBox;
	@FindBy(xpath="//select[@name='property(Lead Status)']")
	private WebElement leadstatuslistBox;
	@FindBy(xpath="//input[@name='property(Annual Revenue)']")
	private WebElement annualrevenueTbx;
	@FindBy(xpath="//input[@name='property(No of Employees)']")
	private WebElement noofempTbx;
	@FindBy(xpath="//img[@title='Campaign Name Lookup']")
	private WebElement campaignnamelookup;
	@FindBy(linkText="Car Expo")
	private WebElement campaignname;

	public LeadsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getCompanynameTbx() {
		return companynameTbx;
	}

	public WebElement getFirstnameTbx() {
		return firstnameTbx;
	}

	public WebElement getLastnameTbx() {
		return lastnameTbx;
	}

	public WebElement getDesignationTbx() {
		return designationTbx;
	}

	public WebElement getEmailTbx() {
		return emailTbx;
	}

	public WebElement getPhoneTbx() {
		return phoneTbx;
	}

	public WebElement getMobileTbx() {
		return mobileTbx;
	}

	public WebElement getFoxTbx() {
		return foxTbx;
	}

	public WebElement getWebsiteTbx() {
		return websiteTbx;
	}

	public WebElement getLeadsourcelistBox() {
		return leadsourcelistBox;
	}

	public WebElement getIndustrylistBox() {
		return industrylistBox;
	}

	public WebElement getLeadstatuslistBox() {
		return leadstatuslistBox;
	}

	public WebElement getAnnualrevenueTbx() {
		return annualrevenueTbx;
	}

	public WebElement getNoofempTbx() {
		return noofempTbx;
	}

	public WebElement getCampaignnamelookup() {
		return campaignnamelookup;
	}

	public WebElement getCampaignname() {
		return campaignname;
	}
}
