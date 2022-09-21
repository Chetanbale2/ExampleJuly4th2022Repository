package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practiceone {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		
		launchbrowser() ;
		 navigate() ;
		 login() ;
		 downloadnotes();
		 logout() ;
		 close();
		
	}
	
	
	public static void launchbrowser() 
	{
		try 
		{
			System.setProperty("webdriver.chrome.driver", "D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	
	public static void navigate() 
	{
		try 
		{
			
			oBrowser.get("http://sgtestinginstitute.com/login.php");
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}

	
	public static void login() 
	{
		try 
		{
			oBrowser.findElement(By.name("email")).sendKeys("chetanbale2@gmail.com");
			oBrowser.findElement(By.id("password")).sendKeys("9731826668");
			oBrowser.findElement(By.xpath("//button[text()='Sign in']")).click();
			Thread.sleep(3000);
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public  static void downloadnotes() 
	{
		try 
		{
			
			oBrowser.findElement(By.xpath("/html/body/header/div/div[2]/ul/li[5]/a")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("/html/body/header/div/div[2]/ul/li[5]/ul/li[1]/a")).click();
	        Thread.sleep(3000);
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public static  void logout() 
	{
		try 
		{
			oBrowser.findElement(By.xpath("//span[text()='Ch']")).click();
			oBrowser.findElement(By.linkText("\'logout.php\'")).click();
	        Thread.sleep(2000);		
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void close() 
	{
		try 
		{
			oBrowser.close();
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
}
