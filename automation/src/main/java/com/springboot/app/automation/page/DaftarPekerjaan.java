package com.springboot.app.automation.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.springframework.stereotype.Component;

@Component
public class DaftarPekerjaan extends Basepage {
	
		@FindBy(how = How.CSS, using = ".glyphicon-search.orange.buttonboxlistfooter.z-button")
	    public WebElement buttonsearch;

	    @FindBy(how = How.XPATH, using = "/html/body[@class='webkit webkit1 breeze']/div/div/div/div/div/div/div/div/div/table/tbody/tr/td/div/div/div/div/div/div/div/div/input[@placeholder='Nomor Registrasi']")
	    public WebElement txtnoregistrasi;

	    
	    
	    @FindBy(how = How.CSS, using = ".btn.btn-sm.btn-primary")
	    public WebElement buttonpopupcari;
	   
	    @FindBy(how = How.CSS, using = ".btn.btn-xs.btn-primary.z-button")
	    public WebElement buttonproses;
	    
	    
	    @FindBy(how = How.XPATH, using = "/html/body[@class='webkit webkit1 breeze']/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div[2]/div/div/div/div/div/div/div/div/div/div/div/div/div/table/tbody/tr/td/div/span")
	    public WebElement pilihdispo;
	    
	    
	    @FindBy(how = How.XPATH, using = "/html/body[@class='webkit webkit1 breeze']/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div[2]/div/div/div/div/button[contains(.,'Disposisi')]")
	    public WebElement buttondispo;
	    
	    
	    @FindBy(how = How.XPATH, using = "/html/body[@class='webkit webkit1 breeze']/div/div/table/tbody/tr/td/table/tbody/tr/td/button[contains(.,'Yes')]")
	    public WebElement buttonKonfirmasi;
	    

	    
	    public Homepage clicksearch() {
	    	buttonsearch.click();
	    	 System.out.println("click cari");
			return new Homepage();
	    }
	    
	    public Homepage isisearch(String nomorRegistrasi) {
	    	txtnoregistrasi.sendKeys(nomorRegistrasi);
	    	System.out.println("isi nomor registrasi");
	    	return new Homepage();
	    }

	    public Homepage clickpopupsearch() {
	    	buttonpopupcari.click();
	    	System.out.println("clik cari search");
	    	return new Homepage();
	    }
	    
	    public Homepage clickproses() {
	    	buttonproses.click();
	    	System.out.println("klik proses");
	    	return new Homepage();
	    }
	    
	    
	    public Homepage clickpilihdispo() {
	    	pilihdispo.click();;
	    	System.out.println("pilihdispo");
	    	return new Homepage();
	    }
	    
	    
	    public Homepage clickdispo() {
	    	buttondispo.click();
	    	System.out.println("prosesdispo");
	    	return new Homepage();
	    }
	    
	    
	    public Homepage clickkonfirmasi() {
	    	buttonKonfirmasi.click();
	    	System.out.println("proseskonfirmasi");
	    	return new Homepage();
	    }
	    
	    
	    
	   

}
