package com.UtilitiesClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	
	Properties prop;
	String path="D:\\Feb_19\\HybridFrameWork\\Configuration\\Config.properties";
	
	public ReadConfig() 
	{
		prop=new Properties();
		
		try {
			FileInputStream ip = new FileInputStream(path);
			prop.load(ip);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	public String getBaseUrl()
	{
		String value=prop.getProperty("BaseUrl");
		return value;
	}
	public String getBrowser()
	{
		String value=prop.getProperty("Browser");
		return value;
	}

}
