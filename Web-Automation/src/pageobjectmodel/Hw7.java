package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw7 {

	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	public static void main(String[] args) {

		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createcutomer();
	    createproject();
	    createtask();
	    deletetask();
	    deleteproject();
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
			oPage.gotocreatecustomer().click();
			Thread.sleep(3000);
			
			
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void createproject() 
	{
		try 
		{
			
			oPage.gettoaddnewdropdownforproject().click();
			Thread.sleep(2000);
			oPage. gettoclickonnewproject().click();
			Thread.sleep(3000);
			oPage.getenterprojectname().sendKeys("Automation of application");
			oPage.getclickoncreateproject().click();
			Thread.sleep(3000);			
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void createtask() 
	{
		try 
		{
		
			oPage.gettoclickonaddnewtask().click();
			Thread.sleep(3000);
			oPage.gettoclickoncreatenewtask().click();
			Thread.sleep(4000);
			oPage.gettoentertask().click();
			oPage.gettoentertask().sendKeys("To build an application");
			Thread.sleep(2000);
			oPage.gettoclickoncreatenewtaskbutton().click();
			Thread.sleep(3000);
			
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void deletetask() 
	{
		try 
		{
			
			oPage.gettoclicktodeletetask().click();
			Thread.sleep(2000);
			oPage.gettoclickonactions().click();
			Thread.sleep(3000);
			oPage.gettoclickondeletetotask().click();
			Thread.sleep(2000);
			oPage.gettodeletetaskpermanently().click();
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
			oPage.gettoclickonsettingstodeleteproject().click();
			Thread.sleep(3000);
			oPage.getclickonactionstodeleteproject().click();
			Thread.sleep(3000);
			oPage.getclickondeleteproject().click();
			Thread.sleep(2000);
			oPage.getclickondeletepermanrntly().click();
			Thread.sleep(4000);

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
