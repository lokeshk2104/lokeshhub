package com.adactin.runner;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.helper.FileReaderManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)

@CucumberOptions (features= "src\\test\\java\\com\\adactin\\feature",   
                 tags = "@loginwithexamples,@login",
                 glue= "com\\adactin\\stepdefinition",
                plugin= {"pretty", "html:target/Destination"},

                dryRun=false,
                 strict= true,
               monochrome=true

)   
                                
		         

public class Runner {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void setup() throws IOException {

		//driver=BaseClass.getdriver("chrome");
		
		String browsername = FileReaderManager.getinstance().getinstanceCR().getbrowser();
		driver  = BaseClass.getdriver(browsername);
		
		
		
	}

}
