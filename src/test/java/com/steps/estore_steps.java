package com.steps;

import javax.swing.plaf.metal.MetalBorders.TextFieldBorder;

import org.openqa.selenium.WebDriver;

import com.base.Base;
import com.pageObjects.LogInPgObject;
import com.pageObjects.VoPgObjec;
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
	  Assert.assertEquals("estore- RPP page validation", "https://portal.qntest.com/VirtualOffice/OnlineEStore/Online_DashBoardNew.aspx",driver.getCurrentUrl());
	}
}
