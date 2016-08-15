package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.steps.estore_steps;

public class ShoppingcartPgObject {
 WebDriver driver=estore_steps.driver;
 
 public WebElement donation_txt  = driver.findElement(By.xpath(".//*[@id='txtRFDonation']"));
 public WebElement donation_check = driver.findElement(By.xpath(".//*[@id='chkRFDonation']"));
 public WebElement TandC_check = driver.findElement(By.xpath(".//*[@id='chkAgree']"));
 public WebElement TandC_link = driver.findElement(By.xpath(".//*[@id='hypPMA']"));
 public WebElement ryFoun_link = driver.findElement(By.xpath(".//*[@id='pnlRFDonation']/table/tbody/tr/td[1]/span/label/a"));
 public WebElement add_btn = driver.findElement(By.xpath(".//*[@id='cmdShop']"));
 public WebElement empty_btn = driver.findElement(By.xpath(".//*[@id='cmdSave']"));
 public WebElement check_btn = driver.findElement(By.xpath(".//*[@id='cmdConfirm']"));
 public WebElement rpp_text = driver.findElement(By.xpath(".//*[@id='pnlAutoShip']/span/label"));
 
 
 public void enterDonation(String value){
  donation_txt.sendKeys(value);
 }
 public void clickDonation(){
  donation_check.click();
 }
 public void clickRythem(){
  ryFoun_link.click();
 }
 public void acceptAgreement(){
  TandC_check.click();
 }
 public void clickTandClink(){
  TandC_link.click();
 }
 public void clickEmpty(){
 empty_btn.click(); 
 }
 public void clickAdd(){
  add_btn.click();
 }
 public void clickCheck(){
  check_btn.click();
 }
}