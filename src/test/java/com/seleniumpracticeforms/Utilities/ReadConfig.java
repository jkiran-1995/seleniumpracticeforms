package com.seleniumpracticeforms.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

	Properties pro;
	
	public ReadConfig()  {
		
		File file = new File("./configuration/config.properties");
		try {
			FileInputStream fis = new FileInputStream(file);
			pro = new Properties();
			pro.load(fis);
		}
		catch(Exception e){
			System.out.println("This Message is :"+e.getMessage());
		}
		
	}
	public String getApplicationURL() {
		String url = pro.getProperty("baseURL");
		return url;
	}
	public String getFirstName() {
		String firstname = pro.getProperty("FirstName");
		return firstname;
	}
	public String getLastName() {
		String lastname = pro.getProperty("LastName");
		return lastname;
	}
	public String getDate() {
		String date = pro.getProperty("Date");
		return date;
	}
	
	public String getchromepath() {
		String chromepath = pro.getProperty("chromepath");
		return chromepath;
	}
	public String getfirefoxpath() {
		String firefoxpath = pro.getProperty("firefoxpath");
		return firefoxpath;
	}
}
