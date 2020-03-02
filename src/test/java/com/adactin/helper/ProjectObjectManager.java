package com.adactin.helper;

import org.openqa.selenium.WebDriver;

import com.adactin.pom.BookPage;
import com.adactin.pom.Bookstatus;
import com.adactin.pom.CancelPage;
import com.adactin.pom.LoginPage;
import com.adactin.pom.SearchPage;

//singleton design pattern for pom objects

public class ProjectObjectManager {
	
	public static WebDriver driver;
	
	private LoginPage lp;
	private SearchPage sp;
	private BookPage bp;
	private Bookstatus bs;
	private CancelPage cp;
	
	
	public ProjectObjectManager(WebDriver pdriver) {
		
		this.driver=pdriver;
		
		
	}
	public LoginPage getLp() {
		
		lp=new LoginPage(driver);
		return lp;
	}
	public SearchPage getSp() {
		
		sp=new SearchPage(driver);
		return sp;
	}
	public BookPage getBp() {
		
		bp=new BookPage(driver);
		return bp;
	}
	public Bookstatus getBs() {
		
		bs=new Bookstatus(driver);
		return bs;
	}
	public CancelPage getCp() {
		
		cp=new CancelPage(driver);
		return cp;
	}
	
	

}
