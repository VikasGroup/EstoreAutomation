package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RppPopupPgObject {
 WebDriver driver;
 public RppPopupPgObject(WebDriver driver) {
  this.driver = driver;
 }
 public WebElement confrim_btn  = driver.findElement(By.xpath(""));
 public WebElement cancel_btn  = driver.findElement(By.xpath(""));
 public WebElement rppConditions_link  = driver.findElement(By.xpath(""));
 
 public void clickConfirm(){
  confrim_btn.click();
 }
 public void clickCancel(){
  cancel_btn.click();
 }
 public void clickConditions(){
  rppConditions_link.click();
 }
}