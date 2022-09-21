package pageobjectmodel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw2 {

	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	public static void main(String[] args) {
		
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createuser() ;
		modifyuser();
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
	
	
	private static void modifyuser() 
	{
		try 
		{
			oPage.userblockmodifyuser().click();
			Thread.sleep(3000);
			oPage.getmodifyfirstname().clear();
			oPage.getmodifyfirstname().sendKeys("chetan");
			oPage.getmodifylastname().clear();
			oPage.getlastname().sendKeys("Bale");
			oPage.getmodifyemail().clear();
			oPage.getmodifyemail().sendKeys("Chetanbale2@gmail.com");
			oPage.getmodifyuserusername().clear();
			oPage.getmodifyuserusername().sendKeys("Chetan123");
			oPage.getmodifyuserpassword().clear();
			oPage.getmodifyuserpassword().sendKeys("9845526803");
			oPage.getmodifyretypepassword().clear();
			oPage.getmodifyretypepassword().sendKeys("9845526803");
			oPage.getmodifysavechangebutton().click();
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
			Thread.sleep(5000);
			
			
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
