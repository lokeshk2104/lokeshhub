package com.adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class ConfigurationReader {
	
	public static Properties p;
	
	public ConfigurationReader() throws IOException {
		
		File f=new File("D:\\testing\\GREENSTECH1(New eclipse)\\CucumberProject\\src\\test\\java\\com\\adactin\\properties\\Configuration.properties");
		FileInputStream fis=new FileInputStream(f);
		p=new Properties();
		p.load(fis);
	}
	
    public String getbrowser() {
    	String browsername = p.getProperty("browsername");
    	 return browsername;
 
    	}
    
    public String geturl() {

    	String url = p.getProperty("url");
    	return url;
    	
	}

}
