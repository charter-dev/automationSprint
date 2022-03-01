package com.springboot.app.automation.page;


import javax.annotation.PostConstruct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class Basepage {

	@Autowired
    public WebDriver Driver;

    @PostConstruct
    public void initDriver() {
        PageFactory.initElements(Driver, this);
    }

    public void Navigate(String url) {
        this.Driver.navigate().to(url);
    }
    
    public void maxBrowser() {
        this.Driver.manage().window().maximize();
    }
	
}
