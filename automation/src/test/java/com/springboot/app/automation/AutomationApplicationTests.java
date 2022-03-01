package com.springboot.app.automation;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;

import com.springboot.app.automation.page.Homepage;

@SpringBootTest(classes = AutomationApplication.class)
@Profile("second")
class AutomationApplicationTests {

	@Autowired
	private Homepage homePage;

	@Value("${app.url}")
	private String appUrl;

	@Value("chrome,firefox,edge")
	private List<String> browsers;

	@Value("testing")
	private String environment;

	@Test
	void contextLoads1() {
		System.out.println(appUrl);
//		homePage.Navigate(appUrl);
//		homePage.ClickLogin();
//		loginPage.Login("admin", "password");
//		loginPage.ClickLogin();
	}

	@Test
	void contextLoads2() {
		System.out.println(appUrl);
//		homePage.Navigate(appUrl);
//		homePage.ClickLogin();
//		loginPage.Login("admin", "password");
//		loginPage.ClickLogin();
	}


	@Test
	void contextLoads3() {
		System.out.println(appUrl);
//		homePage.Navigate(appUrl);
//		homePage.ClickLogin();
//		loginPage.Login("admin", "password");
//		loginPage.ClickLogin();
	}


	@Test
	@Profile("!qa")
	void contextLoads() {


		System.out.println(appUrl);
//		homePage.Navigate(appUrl);
//		homePage.ClickLogin();
//		loginPage.Login("admin", "password");
//		loginPage.ClickLogin();
	}

}
