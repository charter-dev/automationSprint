package com.springboot.app.automation.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.springframework.stereotype.Component;


@Component
public class Loginpage extends Basepage {
	
	 @FindBy(how = How.NAME, using = "j_username")
	    public WebElement txtUserName;

	    @FindBy(how = How.NAME, using = "j_password")
	    public WebElement txtPassword;

	    @FindBy(how = How.CSS, using = ".inputbtnsubmitlogin")
	    public WebElement btnLogin;

	    public void Login(String userName, String password)
	    {
	        txtUserName.sendKeys(userName);
	        txtPassword.sendKeys(password);
	    }

	    public Homepage ClickLogin()
	    {
	        btnLogin.submit();
	        System.out.println("click login");
	        return new Homepage();
	    }

}
