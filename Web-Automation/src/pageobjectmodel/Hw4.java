package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw4 {

	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	public static void main(String[] args) {

		
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createcutomer();
		modifycustomer();
		deletecustomer();
		logout();
		closeApplication();
	}

	
	
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new ActiTimePage(oBrowser);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void navigate()
	{
		try
		{
			oBrowser.navigate().to("http://localhost:81/login.do");
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
			oPage.getUserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLogin().click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void minimizeFlyOutWindow()
	{
		try
		{
			oPage.getFlyOutWindow().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void createcutomer() 
	{
		try 
		{
			oPage.gettotask().click();
			Thread.sleep(3000);
			oPage.gettoaddnewdropdown().click();
			Thread.sleep(2000);
			oPage.gettonewcustomer().click();
			Thread.sleep(3000);
			oPage.entercustomername().sendKeys("Infosys");
			Thread.sleep(2000);
			oPage.gotocreatecustomer().click();
			Thread.sleep(3000);
			
			
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	
	
	private static void modifycustomer() 
	{
		try 
		{
			oPage.gettosettingstomodifycustomer().click();
			Thread.sleep(2000);
			oPage.gettoactivedropdown().click();
			Thread.sleep(2000);
			oPage.gettoarchive().click();
			oPage.gettosettingsaftermodifycustomer().click();
			
			
			
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	
	private static void deletecustomer() 
	{
		try 
		{
			oPage.gettosettings().click();
			Thread.sleep(2000);
			oPage.gotoactionstoclick().click();
			Thread.sleep(2000);
			oPage.gettodeletecustomer().click();
			Thread.sleep(2000);
			oPage.gettodeletecustomerpermanently().click();
			Thread.sleep(4000);
			
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	
	private static void logout()
	{
		try
		{
			oPage.getLogoutLink().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void closeApplication()
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
