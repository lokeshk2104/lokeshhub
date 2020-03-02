package com.adactin.helper;

import java.io.IOException;


//singleton design pattern for property file

public class FileReaderManager {

	private FileReaderManager() {

	}
	
	public static FileReaderManager getinstance() {

		FileReaderManager f=new FileReaderManager();
		return f;
		
	}
	
	public ConfigurationReader getinstanceCR() throws IOException {

		ConfigurationReader cr=new ConfigurationReader();
		return cr;
		
	}
	
}
