package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPgObject {
 WebDriver driver;
 public CheckoutPgObject(WebDriver driver) {
  this.driver = driver;
 }
 public WebElement totalAmnt_txt = driver.findElement(By.xpath(""));
 public WebElement deliveryFee_txt = driver.findElement(By.xpath(""));
 public WebElement deliAdd_btn = driver.findElement(By.xpath(""));
 public WebElement pickupFee_txt = driver.findElement(By.xpath(""));
 public WebElement pickup_btn = driver.findElement(By.xpath(""));
 public WebElement pickup_dp = driver.findElement(By.xpath(""));
 public WebElement countinue_btn = driver.findElement(By.xpath(""));
 public WebElement cancel_btn = driver.findElement(By.xpath(""));
 
 public void clcikDilivery(){
  deliAdd_btn.click();
 }
 public void clickPickup(){
  pickup_btn.click();
 }
 public void selectPickup(String value){
  Select select_pickup  = new Select(pickup_dp);
  select_pickup.selectByVisibleText(value);
 }
 public void clickCancel(){
  cancel_btn.click();
 }
 public void clickCountinue(){
  countinue_btn.click();
 }
}