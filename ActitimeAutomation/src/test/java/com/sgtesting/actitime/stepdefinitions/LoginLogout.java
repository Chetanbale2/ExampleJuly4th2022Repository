package com.sgtesting.actitime.stepdefinitions;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginLogout {

	public static WebDriver oBrowser=null;

	@Test(priority=1)
	public void launchBrowser() 
	{
		try 
		{
			System.setProperty("webdriver.chrome.driver", "D:\\ExampleAutomation\\Automation\\ActitimeAutomation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}


	@Test(priority=2)
	public void navigate() 
	{
		try 
		{
			oBrowser.get("http://localhost:81/login.do");
			Thread.sleep(5000);
			getScreenShot("D:\\EXAMPLE\\ACtiTime.png");

		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	@Test(priority=3)
	public void login() 
	{
		try 
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}


	public static void getScreenShot(String destfilename)
	{
		try
		{
			TakesScreenshot obj=(TakesScreenshot) oBrowser;
			File sourceFile=obj.getScreenshotAs(OutputType.FILE);
			

			File destinationFile=new File(destfilename);
			org.apache.commons.io.FileUtils.copyFile(sourceFile, destinationFile);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}



}
