package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw2 {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		
		Launchbrowser();
		navigate() ;
		login() ;
		minimizeFlyoutwindow();
		createuser();
		modifyuser();
		deleteuser();
		logout() ;
		closeapplication();
		

	}
	
	private static void Launchbrowser() 
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
	
	private static void navigate() 
	{
		try 
		{
			oBrowser.get("http://localhost:81/login.do");
			Thread.sleep(5000);
			
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void login() 
	{
		try 
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			//if no attributes than go for xpath
			Thread.sleep(5000);
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void minimizeFlyoutwindow() 
	{
		try 
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
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
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("demo");
			oBrowser.findElement(By.name("lastName")).sendKeys("user1");
			oBrowser.findElement(By.name("email")).sendKeys("demouser1@gmail.com");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("username")).sendKeys("chetan23123");
			oBrowser.findElement(By.name("password")).sendKeys("9731826668");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("9731826668");
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(3000);
			
			
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void modifyuser() 
	{
		try 
		{
			oBrowser.findElement(By.xpath("//span[text()='user1, demo']")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.name("firstName")).clear();
			oBrowser.findElement(By.name("firstName")).sendKeys("demo1");
			oBrowser.findElement(By.name("lastName")).clear();
			oBrowser.findElement(By.name("lastName")).sendKeys("user12");
			oBrowser.findElement(By.name("email")).clear();
			oBrowser.findElement(By.name("email")).sendKeys("demouser12@gmail.com");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("username")).clear();
			oBrowser.findElement(By.name("username")).sendKeys("chetan223123");
			oBrowser.findElement(By.name("password")).clear();
			oBrowser.findElement(By.name("password")).sendKeys("97318126668");
			oBrowser.findElement(By.name("passwordCopy")).clear();
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("97318126668");
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
			//oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(3000);
			//oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			//Thread.sleep(2000);
			
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	
	private static void deleteuser() 
	{
		try 
		{
			oBrowser.findElement(By.xpath("//span[text()='user1, demo']")).click();
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			//oBrowser.findElement(By.xpath("//button[text()='Delete User']")).click();
			//oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_deleteBtn\"]")).click();
			Thread.sleep(2000);
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
			//oBrowser.findElement(By.linkText("Logout")).click();
			//oBrowser.findElement(By.id("logoutLink")).click();
			//oBrowser.findElement(By.className("logout")).click();
			oBrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			Thread.sleep(2000);
		   
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void closeapplication() 
	{
		try 
		{
			oBrowser.quit();
			//oBrowser.close();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}



}
