package com.springboot.app.automation.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.springframework.stereotype.Component;

@Component
public class Homepage extends Basepage {

	@FindBy(how = How.LINK_TEXT, using = "Daftar Pekerjaan")
    public WebElement lnkLogin;

    @FindBy(how = How.LINK_TEXT, using = "Employee List")
    public WebElement lnkEmployeeList;

    public Loginpage ClickDaftar ()
    {
        lnkLogin.click();
        System.out.println("Click Daftar Pekerjaan");
        return new Loginpage();
    }

//    public void ClickEmployeeList() {lnkEmployeeList.click();}
	
}
