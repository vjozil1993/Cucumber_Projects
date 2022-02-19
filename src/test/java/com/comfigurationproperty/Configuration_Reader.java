package com.comfigurationproperty;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Reader {
	
	public static Properties p;
	
	public Configuration_Reader() throws Throwable {
		
		
		File f = new File("C:\\Users\\Hari\\eclipse-workspace\\cucumbertutorilas\\src\\test\\java\\com\\comfigurationproperty\\Configuration.properties");
	
	FileInputStream fis = new FileInputStream(f);
	
	p = new Properties();
	p.load(fis);
	
	
	}
	
	public String getBrowser() {
		
		String browser = p.getProperty("browser");
		
		return browser;

	}
	
	public  String getURL() {
		
		String url = p.getProperty("url");
		
		return url;

	}
	
	
	
	
	

}
