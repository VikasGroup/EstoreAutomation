package com.vselenium;

public enum Default {

	CONFIG_PATH("/config/config.cfg"),
	TEST_DATA_FILE("/testdata/dev.properties");
	
	private String value;
	
	private Default(String value){
		this.value = value;
	}
	public String getValue(){
		return this.value;	
	}
}
