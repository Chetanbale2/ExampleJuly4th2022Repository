package com.sgtesting.objectmapdemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw1 {

	public static WebDriver oBrowser=null;
	public static ObjectMap objectmap=null;
	public static void main(String[] args) {
		
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWin();
		createuser() ;
		deleteuser();
		logout();
		closeApp();

	}
	
	private static void launchBrowser()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			objectmap=new ObjectMap("objectmap.properties");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:81/login.do");
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void login()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("loginpageusername")).sendKeys("admin");
			oBrowser.findElement(objectmap.getLocator("loginpagepassword")).sendKeys("manager");
			oBrowser.findElement(objectmap.getLocator("loginpageloginbtn")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void minimizeFlyOutWin()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("homepageflyoutwin")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	private static void createuser() 
	{
		try 
		{
			oBrowser.findElement(objectmap.getLocator("usersclick")).click();
			Thread.sleep(3000);
			oBrowser.findElement(objectmap.getLocator("adduserbutton")).click();
			Thread.sleep(3000);
			oBrowser.findElement(objectmap.getLocator("adduserfirstname")).sendKeys("chetan");
			oBrowser.findElement(objectmap.getLocator("adduserlastname")).sendKeys("Bale");
			oBrowser.findElement(objectmap.getLocator("adduseremail")).sendKeys("chetanbale2@gmail.com");
			oBrowser.findElement(objectmap.getLocator("adduserusername")).sendKeys("chetan123");
			oBrowser.findElement(objectmap.getLocator("adduserpassword")).sendKeys("9731826668");
			oBrowser.findElement(objectmap.getLocator("adduserretypepassword")).sendKeys("9731826668");
			oBrowser.findElement(objectmap.getLocator("addusercreateuserbuttton")).click();
			Thread.sleep(3000);
			
			
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void deleteuser() 
	{
		try 
		{
			oBrowser.findElement(objectmap.getLocator("clickonusers")).click();
			Thread.sleep(3000);
			oBrowser.findElement(objectmap.getLocator("deleteuserbutton")).click();
			Thread.sleep(3000);
			Alert oAlert =oBrowser.switchTo().alert();
		    oAlert.accept();
			Thread.sleep(2000);
			
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void logout()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("homepagelogoutlnk")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void closeApp()
	{
		try
		{
			oBrowser.quit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}


}
