package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.steps.estore_steps;

public class VoPgObjec {
 WebDriver driver=estore_steps.driver;
 public WebElement irname_txt  = driver.findElement(By.xpath(".//*[@id='header1_lblNameNew']"));
 public WebElement RPP_btn = driver.findElement(By.xpath(".//*[@id='TabMenu1_lbnShopRPP']"));
 
 public void clickRPP(){
  RPP_btn.click();
 }
 public String getIRname(){
	 return irname_txt.getText();
 }
 public String validateRPBbtn(){
	 if(RPP_btn.isDisplayed()){
		 return "true";
	 }
	 else
		 return "false";
 }
}