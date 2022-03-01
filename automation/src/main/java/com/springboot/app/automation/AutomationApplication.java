package com.springboot.app.automation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.app.automation.page.DaftarPekerjaan;
import com.springboot.app.automation.page.Homepage;
import com.springboot.app.automation.page.Loginpage;

@SpringBootApplication
public class AutomationApplication implements CommandLineRunner{

	
	@Autowired
	private DaftarPekerjaan daftarPekerjaan;
	
	@Autowired
	private Homepage homePage;
	
	@Autowired
	private Loginpage loginpage;

	@Value("${app.url}")
	private String appUrl;

	@Value("chrome,firefox,edge")
	private List<String> browsers;

	@Value("testing")
	private String environment;
	
	public static void main(String[] args) {
		SpringApplication.run(AutomationApplication.class, args);
	}

	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		cars.getCar();
		contextLoads1();
	}
	
	
	


	void contextLoads1() {
		
			

		for (int i = 0; i < 3; i++) {
			try {
			System.out.println(appUrl);
			homePage.maxBrowser();
			homePage.Navigate(appUrl);
			loginpage.Login("hoesen", "P@ssw0rd");
			loginpage.ClickLogin();
			homePage.ClickDaftar();
			TimeUnit.SECONDS.sleep(5);;
			daftarPekerjaan.clicksearch();
			TimeUnit.SECONDS.sleep(5);
			daftarPekerjaan.isisearch("2022010000000024");
			daftarPekerjaan.clickpopupsearch();
			TimeUnit.SECONDS.sleep(5);
			daftarPekerjaan.clickproses();
			TimeUnit.SECONDS.sleep(20);
			daftarPekerjaan.clickpilihdispo();
			TimeUnit.SECONDS.sleep(10);
			daftarPekerjaan.clickdispo();
			TimeUnit.SECONDS.sleep(10);
			daftarPekerjaan.clickkonfirmasi();
			
			TimeUnit.SECONDS.sleep(1000);
			
			System.err.println("testing login ===============" + +i);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}	
		
	}


}
