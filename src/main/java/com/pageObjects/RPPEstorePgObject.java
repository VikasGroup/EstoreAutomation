package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.steps.estore_steps;

public class RPPEstorePgObject {

 
 WebDriver driver=estore_steps.driver;
 
 
 public WebElement RPP_img = driver.findElement(By.xpath(".//*[@id='imgCategoryLogo']"));
 public WebElement select_dp = driver.findElement(By.xpath(".//*[@id='ddlSearchProduct']"));
 public WebElement search_txt  = driver.findElement(By.xpath(".//*[@id='tbSearchProduct']"));
 public WebElement search_btn = driver.findElement(By.xpath(".//*[@id='btnSearchProduct']"));
 public WebElement addcart_btn = driver.findElement(By.id("btnAddToCartMerged"));
 
 public WebElement start_value  = driver.findElement(By.xpath(".//*[@id='RadSliderDrag_ctl00_cphBody01_ctlSlider_rsdControl']/span"));
 public WebElement end_value  = driver.findElement(By.xpath(".//*[@id='RadSliderEndDrag_ctl00_cphBody01_ctlSlider_rsdControl']/span"));
 public WebElement range_value  = driver.findElement(By.xpath(".//*[@id='RadSliderSelected_ctl00_cphBody01_ctlSlider_rsdControl']"));
 
 public WebElement product_img = driver.findElement(By.xpath(".//*[@id='imgListProductProdImage']"));
 public WebElement prodname_txt = driver.findElement(By.id("hlListProductProdName"));
 public WebElement product_check = driver.findElement(By.xpath(".//*[@id='cbAddToCart']"));
 public WebElement bv_value = driver.findElement(By.xpath(".//*[@id='lblCUV']/table/tbody/tr/td[3]/b"));
 public WebElement rsp_value = driver.findElement(By.xpath(".//*[@id='lblDSP']/table/tbody/tr/td/b"));
 public WebElement rppPrice_value = driver.findElement(By.xpath(".//*[@id='lblPrice']"));
 public WebElement sh_value = driver.findElement(By.xpath(".//*[@id='lblShipFee']"));
 public WebElement Regular_value  = driver.findElement(By.xpath(".//*[@id='lblPriceRegularRepeat']"));
 public WebElement notAvailable_txt = driver.findElement(By.xpath(".//*[@id='lblSpecialIcon']"));
 
 public void selectProduct(String value){
  Select select_prod  = new Select(select_dp);
  select_prod.selectByVisibleText(value);
 }
 public void clicksearch(){
  search_btn.click();
 }
 public void clickRpp(){
  WebElement RPP_btn = driver.findElement(By.xpath("(//input[@type='checkbox'])[position()=1]"));
  RPP_btn.click();
 }
 public void clickAdd2cart(){
  addcart_btn.click();
 }
 public void enterSearch(String value){
  search_txt.sendKeys(value);
 } 
 public String getName(String value){
	 
	 WebElement nametxt=driver.findElement(By.xpath("id('hlListProductProdName')[.='" + value + "']"));
	   new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated( By.xpath("id('hlListProductProdName')[.='" + value + "']") ));
	 return nametxt.getText();
 }
 public String getImage(){
	 String value="";
	 WebElement imgelement=driver.findElement(By.xpath("id('imgListProductProdImage')[.='" + value + "']"));
	 if(product_img.isDisplayed())
	 return "true";
	 else
		 return "false";
 }
 public String getBV(String value){
	
	 WebElement bvelement=driver.findElement(By.xpath("id('lblCUV')[.='" + value + "']"));
	 return bvelement.getText();
 }
 public String getRSP(String value){
	 
	 WebElement rspelement=driver.findElement(By.xpath("id('lblDSP')[.='" + value + "']"));
	 
	 return rspelement.getText();
 }
 public String getRPP(String value){
	
	 WebElement rppelement=driver.findElement(By.xpath("id('lblPrice')[.='" + value + "']"));
	 
	 return rppelement.getText();
 }
 public String getSH(String value){
	 
	 WebElement shelement=driver.findElement(By.xpath("id('lblShipFee')[.='" + value + "']"));
	 
	 return shelement.getText();
 }
 public String getRegValue(){
	 if(Regular_value.isDisplayed())
	 return Regular_value.getText();
	 else
		 return "";
 }
 public String getAvalability(){
	 String value="(Temporarily Not Available)";
	 try{
	 WebElement availableelement=driver.findElement(By.xpath("id('lblSpecialIcon')[.='" + value + "']"));
	  return "false";
	 }catch(Exception ex){
		 return "true";
	 }
	 
	 
	
		
 }
}