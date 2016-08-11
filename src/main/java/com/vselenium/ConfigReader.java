package com.vselenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {

	private static Properties configFile;
	private String path = Default.CONFIG_PATH.getValue();

	public Properties readConfig() {

		InputStream istream = getClass().getResourceAsStream(path);
		if (null == istream) {
			try {
				istream = new FileInputStream(path);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		configFile = new java.util.Properties(getDefaultProp());
		try {
			configFile.load(istream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return configFile;
	}

	private Properties getDefaultProp() {
		Properties prop = new Properties();

		return prop;
	}

}
