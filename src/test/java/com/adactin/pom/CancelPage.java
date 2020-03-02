package com.adactin.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CancelPage {
	
	private WebDriver driver;
	
	@FindBy(xpath="//*[@name='ids[]']")
	private List<WebElement> cselect;
	
	@FindBy(name="cancelall")
	private WebElement cancel;
	
	@FindBy(id="logout")
	private WebElement logout;
	

	
   public CancelPage(WebDriver cdriver) {
		
		this.driver=cdriver;
		PageFactory.initElements(driver, this);
	}

	public List<WebElement> getCselect() {
		return cselect;
	}
	
	public WebElement getCancel() {
		return cancel;
	}
	
	public WebElement getLogout() {
		return logout;
	}
	

}
