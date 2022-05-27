package com.practice8.util;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public enum ApplicationProperties {
	INSTANCE;
	private final Properties properties;
	private ApplicationProperties() {
		// TODO Auto-generated constructor stub
		properties=new Properties();
		try {
			properties.load(getClass().getResourceAsStream("/messages.properties"));
		} catch (Exception e) {
			// TODO: handle exception
			Logger.getLogger(getClass().getName()).log(Level.SEVERE,e.getMessage(), e);
		}
	}
	public String getValue(String key) {
		return properties.getProperty(key);
	}

}
