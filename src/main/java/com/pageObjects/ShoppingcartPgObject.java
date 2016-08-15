package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

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
 

 public String getProdName(int i){
	 i=i+1;
	 WebElement product = driver.findElement(By.id("dlProductCategoryContainer_ctl01_dgProductCategory_ctl0"+i+"_lblProdName"));
	 return product.getText();
 }
 public String getRPP(int i){
	 i=i+1;
	 WebElement rppf = (driver.findElement(By.id("dlProductCategoryContainer_ctl01_dgProductCategory_ctl0"+i+"_ddlRepeatProduct")));
	 return rppf.getText();
 }
 public String getQTY(int i){
	 i=i+1;
	 WebElement qty = (driver.findElement(By.id("dlProductCategoryContainer_ctl01_dgProductCategory_ctl0"+i+"_tbQuantity")));
	 return qty.getText();
 }
 public String getPrice(int i){
	 i=i+1;
	 WebElement price = (driver.findElement(By.id("dlProductCategoryContainer_ctl01_dgProductCategory_ctl0"+i+"_lblPrice")));
	 return price.getText();
 }
 public String getBV(int i){
	 i=i+1;
	 WebElement bv = (driver.findElement(By.id("dlProductCategoryContainer_ctl01_dgProductCategory_ctl0"+i+"_lblCUV")));
	 return bv.getText();
 }
 public String getRSP(int i){
	 i=i+1;
	 WebElement rsp = (driver.findElement(By.id("dlProductCategoryContainer_ctl01_dgProductCategory_ctl0"+i+"_lblDSP")));
	 return rsp.getText();
 }
 public void selectRPP(int i,String value){
	 i=i+1;
	 Select rppf = new Select(driver.findElement(By.id("dlProductCategoryContainer_ctl01_dgProductCategory_ctl0"+i+"_ddlRepeatProduct")));
	 rppf.selectByVisibleText(value);
 }
 public void selectQTY(int i,String value) throws InterruptedException{
	 i=i+1;
	 WebElement qty = (driver.findElement(By.id("dlProductCategoryContainer_ctl01_dgProductCategory_ctl0"+i+"_tbQuantity")));
	 qty.clear();
	qty.sendKeys(value);
	WebElement price = (driver.findElement(By.id("dlProductCategoryContainer_ctl01_dgProductCategory_ctl0"+i+"_lblPrice")));
	 price.click();

	Thread.sleep(5000);
	 }
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
 public String validateChkBtn(){
	 if(check_btn.isEnabled()){
		 return "true";
	 }else{
		 return "false";
	 }
 }
}