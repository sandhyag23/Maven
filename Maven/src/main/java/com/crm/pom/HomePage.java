package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

@FindBy(linkText = "Campaigns")
private WebElement campaignmainTab;
@FindBy(linkText = "Leads")
private WebElement leadsTab;
@FindBy(linkText = "Potentials")
private WebElement potentialsTab;
@FindBy(linkText = "Products")
private WebElement productsTab;
@FindBy(linkText = "Vendors")
private WebElement vendorsTab;
@FindBy(linkText = "Price Books")
private WebElement priceBookTab;
@FindBy(linkText = "Quotes")
private WebElement quotesTab;
@FindBy(linkText = "Sales Orders")
private WebElement salesOrderTab;
@FindBy(linkText = "Invoices")
private WebElement invoiceTab;


public HomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public void setCampaignPage() {
	campaignmainTab.click();
}

public void setLeadsPage() {
	leadsTab.click();
}

public void setPotentialsPage() {
	potentialsTab.click();
}

public void setProductsPage() {
	productsTab.click();
}

public void setVendorsPage() {
	vendorsTab.click();
}

public void setPriceBookPage() {
	priceBookTab.click();
}

public void setQuotesPage() {
	quotesTab.click();
}

public void setSalesOrderPage() {
	salesOrderTab.click();
}

public void setInvoicePage() {
	invoiceTab.click();
}
	
}


