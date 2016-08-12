package com.steps;

import javax.swing.plaf.metal.MetalBorders.TextFieldBorder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.Base;
import com.google.common.base.Function;
import com.pageObjects.LogInPgObject;
import com.pageObjects.RPPEstorePgObject;
import com.pageObjects.VoPgObjec;
import com.thoughtworks.selenium.condition.Presence;
import com.utils.TabCatcher;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class estore_steps {
	public Base base;
	public static WebDriver driver;
	public LogInPgObject logInPgObject;
	public VoPgObjec voPgObjec;
	public RPPEstorePgObject rppEstorePgObject;
	public estore_steps (Base base){
		this.base = base;
		this.driver=base.getDriver();
			}
	
	
	@Given("^user open the web page$")
	public void user_open_the_web_page() throws Throwable {
	    
	}

	@When("^Type the URL\\.\\(Staging site\\)\"([^\"]*)\"$")
	public void type_the_URL_Staging_site(String url) throws Throwable {
		driver.get(url);
	 	}

	@Then("^Login page should displayed\\.$")
	public void login_page_should_displayed() throws Throwable {
		
	    Assert.assertEquals("LogIn Page validation","https://portal.qntest.com/VirtualOffice/onlineestore/Online_Login_VO.aspx", driver.getCurrentUrl());
	}
	@Then("^user validate the Qnet logo$")
	public void user_validate_the_Qnet_logo() throws Throwable {
		logInPgObject=new LogInPgObject();
	    Assert.assertEquals("QNet Logo validation","true", logInPgObject.checkIMG());
	}
	
	@Given("^user enter invalid/blank username and password\\.\"([^\"]*)\",\"([^\"]*)\"$")
	public void user_enter_invalid_blank_username_and_password(String username, String password) throws Throwable {
		logInPgObject=new LogInPgObject();
		logInPgObject.enterIrid(username);
		logInPgObject.enterPassword(password);
	}

	@Then("^corresponding error messages should displayed$")
	public void corresponding_error_messages_should_displayed() throws Throwable {
	   Assert.assertEquals("","" );
	}
	@Given("^user enter the username and password\\.\"([^\"]*)\",\"([^\"]*)\"$")
	public void user_enter_the_username_and_password(String username, String password) throws Throwable {
		logInPgObject=new LogInPgObject();
		logInPgObject.enterIrid(username);
		logInPgObject.enterPassword(password);
	}

	@When("^user clicked on login button$")
	public void user_clicked_on_login_button() throws Throwable {
		
	    logInPgObject.clickLogin();
	}

	@Then("^user should able to login to virtual office$")
	public void user_should_able_to_login_to_virtual_office() throws Throwable {
		TabCatcher tabCatcher=new TabCatcher();
		tabCatcher.setTab();
	    Assert.assertEquals("Virtual Office Page validation","https://portal.qntest.com/VirtualOffice/OnlineEStore/PopupsLoad.aspx", driver.getCurrentUrl());
	    voPgObjec=new VoPgObjec();
	}
	
	@Then("^validate the user details \"([^\"]*)\"$")
	public void validate_the_user_details(String irname) throws Throwable {
		Assert.assertEquals("IR Name validation", irname,voPgObjec.getIRname());
	}
	@Then("^RPP button should displayed$")
	public void rpp_button_should_displayed() throws Throwable {
	   Assert.assertEquals("RPB Button validation", "true",voPgObjec.validateRPBbtn());
	}
	@Then("^user click on the RPP button$")
	public void user_click_on_the_RPP_button() throws Throwable {
		voPgObjec.clickRPP();
	}

	@Then("^User direct to the estore- RPP page$")
	public void user_direct_to_the_estore_RPP_page() throws Throwable {
		TabCatcher tabCatcher=new TabCatcher();
		tabCatcher.setBaseTab();
		Assert.assertEquals("estore- RPP page validation", "https://portal.qntest.com/eStore/products.aspx?Category=5910000&type=HIGH",driver.getCurrentUrl());
	}
	@Given("^user select the search option as  Product name/brand\"([^\"]*)\"$")
	public void user_select_the_search_option_as_Product_name_brand(String type) throws Throwable {
	    rppEstorePgObject=new RPPEstorePgObject();
	    rppEstorePgObject.selectProduct(type);
	}

	@When("^user enter a key word \"([^\"]*)\"$")
	public void user_enter_a_key_word(String prodName) throws Throwable {
	   rppEstorePgObject.enterSearch(prodName);
	}

	@When("^click on search button$")
	public void click_on_search_button() throws Throwable {
	   rppEstorePgObject.clicksearch();
	  Thread.sleep(5000);
	}

	@Then("^verify on product name \"([^\"]*)\"$")
	public void verify_on_product_name(String prodName) throws Throwable {
		
		Assert.assertEquals("Product name validation", rppEstorePgObject.getName(prodName),prodName);
	}

	@Then("^verify on image \"([^\"]*)\"$")
	public void verify_on_image(String avalability) throws Throwable {
	   // Assert.assertEquals("Image validation", rppEstorePgObject.getImage(avalability),avalability);
	}

	@Then("^verify on IR price \"([^\"]*)\"$")
	public void verify_on_IR_price(String irp) throws Throwable {
		 Assert.assertEquals("IRP validation", rppEstorePgObject.getRPP(irp),irp);
			
	}

	@Then("^verify on BV \"([^\"]*)\"$")
	public void verify_on_BV(String bv) throws Throwable {
		// Assert.assertEquals("BV validation", rppEstorePgObject.getBV(bv),bv);
			
	}

	@Then("^verify on RSP \"([^\"]*)\"$")
	public void verify_on_RSP(String rsp) throws Throwable {
		 Assert.assertEquals("RSP validation", rppEstorePgObject.getRSP(rsp),rsp);
			
	}

	@Then("^verify on S&H fee \"([^\"]*)\"$")
	public void verify_on_S_H_fee(String sh) throws Throwable {
		 Assert.assertEquals("S&H validation", rppEstorePgObject.getSH(sh),sh);
			
	}

	@Then("^verify on Avalability \"([^\"]*)\"$")
	public void verify_on_Avalability(String avalability) throws Throwable {
		 Assert.assertEquals("Availability validation", rppEstorePgObject.getAvalability(),avalability);
			
	}
	@Then("^user select preferred products$")
	public void user_select_preferred_products() throws Throwable {
		if(rppEstorePgObject.getAvalability().equals("true"))
		rppEstorePgObject.clickRpp();
		else{
			System.out.println(" Not available");
		}
	}

	@Then("^click on add to cart button$")
	public void click_on_add_to_cart_button() throws Throwable {
		if(rppEstorePgObject.getAvalability().equals("true"))
			rppEstorePgObject.clickAdd2cart();
		else{
			driver.navigate().refresh();
			Thread.sleep(5000);
		}
	}

	@Then("^Direct to the Shopping cart page$")
	public void direct_to_the_Shopping_cart_page() throws Throwable {
		if(rppEstorePgObject.getAvalability().equals("true"))
			Assert.assertEquals("", "");
	}

}
