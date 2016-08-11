package com.vselenium;

import java.util.Properties;

public class DefaultConfig implements Config{
	
	private Properties configfile;
	
	public static Config config =null;
	
	public DefaultConfig(){
		ConfigReader reader = new ConfigReader();
		configfile = reader.readConfig();
	}

	public static Config getConfigReader(){
		if(config == null){
			config = new DefaultConfig();
		}
		return config;
	}
	public String getValue(String key) {
		String value = configfile.getProperty(key);
		return value;
	}

}
