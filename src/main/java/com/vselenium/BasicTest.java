package com.vselenium;

public class BasicTest {
	
	public static Config config ;
	public BasicTest() {
		config = DefaultConfig.getConfigReader();
		// TODO Auto-generated constructor stub
	}
	
	public BasicTest getbasicTest(){
		return new BasicTest();
	}

	public Config getcon(){
		return this.config;
	}
}
