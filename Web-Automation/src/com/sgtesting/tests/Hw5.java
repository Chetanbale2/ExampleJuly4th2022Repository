package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw5 {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {

		Launchbrowser();
		navigate() ;
		login() ;
		minimizeFlyoutwindow();
		createcustomer();
		createproject();
		deleteproject();
		 deletecustomer();
		 logout();
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
	
	private static void createcustomer() 
	{
		try 
		{
			
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[3]/a")).click();
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")).click();
			
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("Infosys");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'customerLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(2000);
			
	        
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	
    private static void createproject() 
    {
    	try 
    	{
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.id("projectPopup_projectNameField")).sendKeys("Automation of robot");
            Thread.sleep(2000);
            oBrowser.findElement(By.xpath("//*[@id=\'projectPopup_commitBtn\']/div/span")).click();
    		Thread.sleep(2000);
    	}catch(Exception e) 
    	{
    		e.printStackTrace();
    	}
    }
    
    private static void deleteproject() 
    {
    	try 
    	{
    		oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")).click();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[4]/div/div[3]/div")).click();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.xpath("//*[@id=\"projectPanel_deleteConfirm_submitTitle\"]")).click();
    		Thread.sleep(2000);
    		
    	}catch(Exception e) 
    	{
    		e.printStackTrace();
    	}
    }
    
    
    private static void deletecustomer() 
	{
		try 
		{
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
            Thread.sleep(2000);
            oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'customerPanel_deleteConfirm_submitTitle\']")).click();
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
