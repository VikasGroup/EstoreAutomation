package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.steps.estore_steps;

public class LogInPgObject {
	WebDriver driver = estore_steps.driver;
	WebElement shopnow_check = driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_chkRedirectToEStore']"));
	WebElement qnet_img = driver.findElement(By.xpath(".//*[@id='pnlLogo']/h1/a"));
	WebElement irid_txt = driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_txtTCO']"));
	WebElement passowrd_txt = driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_txtPassword']"));
	WebElement login_btn = driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_btnLogin']"));

	public void enterIrid(String value) {

		irid_txt.sendKeys(value);
	}

	public void enterPassword(String value) {

		passowrd_txt.sendKeys(value);
	}

	public void clickLogin() {

		login_btn.click();
	}
	public String checkIMG(){
		if(qnet_img.isDisplayed()){
			return "true";
		}else
			return "false";
	}

}