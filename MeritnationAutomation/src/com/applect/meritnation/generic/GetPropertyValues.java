package com.applect.meritnation.generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GetPropertyValues {
	public static String getPropertyValue(String key)
	{
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream(new File("/home/applect/workspace/MeritnationAutomation/config.properties")));
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		String value = prop.getProperty(key);
		return value;
	}
}


