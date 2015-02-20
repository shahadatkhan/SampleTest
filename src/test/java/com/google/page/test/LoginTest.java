package com.google.page.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.google.page.LoginPage;

public class LoginTest {
WebDriver driver = new FirefoxDriver();
LoginPage LP = new LoginPage();
@BeforeClass
public void SetUp()
{
	driver.get("http://www.yahoomail.com");
}
@Test
public void loginTest()
{
	driver.findElement(By.xpath(LP.USERNAME_XPATH)).sendKeys("shahadat_it786");
	driver.findElement(By.xpath(LP.PASSWORD_XPATH)).sendKeys("saynasilovely");
}

@AfterClass
public void Setdown()
{
	driver.close();
}



	

}
