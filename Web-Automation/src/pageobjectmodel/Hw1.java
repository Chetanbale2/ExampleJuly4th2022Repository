package pageobjectmodel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw1 {

	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	public static void main(String[] args) {
		

		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createuser() ;
		deleteuser();
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
	
	
	private static void createuser() 
   {
		try 
		{
			oPage.gettousers().click();
			Thread.sleep(3000);
			oPage.gettoadduser().click();
			Thread.sleep(2000);
			oPage.getfirstname().sendKeys("crazyuser");
			oPage.getlastname().sendKeys("demo");
			oPage.getemail().sendKeys("userdemo@gmail.com");
			oPage.getuserusername().sendKeys("user123");
			oPage.getuserpassword().sendKeys("9731826668");
			oPage.gettoretypepassword().sendKeys("9731826668");
			oPage.gettocreateuser().click();
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
			oPage.userblocktodeleteuser().click();
			Thread.sleep(3000);
			oPage.gettodeletebutton().click();
			Thread.sleep(3000);
			Alert oAlert =oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
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
			oPage.getLogoutLink().click();
			Thread.sleep(2000);
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
