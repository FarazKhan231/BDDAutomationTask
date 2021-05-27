package com.Test.Faraz;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	public static final String UserName = "testemail@mailinator.com";
	public static final String Password = "Password_01";
	public static WebDriver Driver;

	protected void TestSetup() {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + File.separator + "chromedriver.exe");
		Driver = new ChromeDriver();
		Driver.manage().window().maximize();

	}

	protected void TestTearDown() {
		Driver.quit();
	}
}
