package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage {

	
	public ActiTimePage(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}
	
	//WebElement for User Name Text Field
	private WebElement username;
	
	public WebElement getUserName()
	{
		return username;
	}

	//WebElement for Password Text Field
	private WebElement pwd;
	public WebElement getPassword()
	{
		return pwd;
	}
	
	//WebElement for Login Button
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement oLogin;
	public WebElement getLogin()
	{
		return oLogin;
	}
	
	//WebElement for FlyOutWindow
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getFlyOutWindow()
	{
		return gettingStartedShortcutsPanelId;
	}
	
	//WebElement for Logout Link
	@FindBy(linkText="Logout")
	private WebElement oLogout;
	public WebElement getLogoutLink()
	{
		return oLogout;
	}
	
	
	//webelement for userfield
	
	@FindBy(xpath="//div[text()='USERS']")
	private WebElement oUSERS;
	public WebElement gettousers() 
	{
		return oUSERS;
	}
	
	//webelement for Adduser
	@FindBy(xpath="//*[@id=\'createUserDiv\']/div")
	private WebElement adduser;
	public WebElement gettoadduser() 
	{
		return adduser;
	}
	
	//webelement for firstname
	private WebElement firstName;
	public WebElement getfirstname() 
	{
		return firstName;
	}
	
	//webelement for lastname
	
	private WebElement lastName;
	public WebElement getlastname() 
	{
		return lastName;
	}
	
	//webelement for email
	
	private WebElement email;
	public WebElement getemail() 
	{
		return email;
	}
	
	//webelement for login username
	
	private WebElement userDataLightBox_usernameField;
	public WebElement getuserusername() 
	{
		return userDataLightBox_usernameField;
	}
	
	//webelement for userpassword
	
	private WebElement userDataLightBox_passwordField;
	public WebElement  getuserpassword() 
	{
		return userDataLightBox_passwordField;
	}
	
	
	//webelement to retype password
	private WebElement passwordCopy;
	public WebElement gettoretypepassword() 
	{
		return passwordCopy;
	}
	
	
	//webelement for create user button
	@FindBy(xpath="//*[@id=\'userDataLightBox_commitBtn\']/div/span")
	private WebElement createuser;
	public WebElement gettocreateuser() 
	{
		return createuser;
	}
	
	//webelement to userblock to delete user
	@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table")
	private WebElement userblock;
	public WebElement userblocktodeleteuser() 
	{
		return userblock;
	}
	
	//webelement to deleteuser button
	@FindBy(xpath="//*[@id=\'userDataLightBox_deleteBtn\']")
	private WebElement userDataLightBoxdeleteBtn;
	public WebElement gettodeletebutton() 
	{
		return userDataLightBoxdeleteBtn;
	}
	
	//webelement to userblock to modify user
		@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table")
		private WebElement modifyuserblock;
		public WebElement userblockmodifyuser() 
		{
			return userblock;
		}
		
		
		//webelement for modifyfirstname
		private WebElement userDataLightBox_firstNameField;
		public WebElement getmodifyfirstname() 
		{
			return userDataLightBox_firstNameField;
		}
		
		//webelement for modifylastname
		
		private WebElement userDataLightBox_lastNameField;
		public WebElement getmodifylastname() 
		{
			return userDataLightBox_lastNameField;
		}
		
		//webelement for email
		
		private WebElement userDataLightBox_emailField;
		public WebElement getmodifyemail() 
		{
			return userDataLightBox_emailField;
		}
		
		//webelement for login username
		@FindBy(xpath="//*[@id=\'userDataLightBox_usernameField\']")
		private WebElement modifyusername;
		public WebElement getmodifyuserusername() 
		{
			return modifyusername;
		}
		
		//webelement for modifyuserpassword
		@FindBy(xpath="//*[@id=\"userDataLightBox_passwordField\"]")
		private WebElement modifyuserpassword;
		public WebElement  getmodifyuserpassword() 
		{
			return modifyuserpassword;
		}
		
		
		//webelement to  modify retype password
		private WebElement userDataLightBox_passwordCopyField;
		public WebElement getmodifyretypepassword() 
		{
			return userDataLightBox_passwordCopyField;
		}
		
		//web element to savechanges button after modification
		
		@FindBy(xpath="//*[@id=\"userDataLightBox_commitBtn\"]/div/span")
		private WebElement modifysavedchanges;
		public WebElement getmodifysavechangebutton() 
		{
			return modifysavedchanges;
		}
		
		//web element to go to task and click on it
		
		@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr[1]/td[3]/a")
		private WebElement togototask;
		public WebElement gettotask() 
		{
			return togototask;
		}
		
		//web element to click on add new 
		
		@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")
		private WebElement togotoaddnew;
		public WebElement gettoaddnewdropdown() 
		{
			return togotoaddnew;
		}
		
		
		//web element to create new customer
		
		@FindBy(xpath="/html/body/div[14]/div[1]")
		private WebElement gotonewcustomer;
		public WebElement gettonewcustomer() 
		{
			return gotonewcustomer;
		}
		
		//weeb element to enter the customer name
		
		@FindBy(xpath="//*[@id=\'customerLightBox_nameField\']")
		private WebElement customername;
		public WebElement entercustomername() 
		{
			return customername;
		} 
		
		//web element for create customer button  
		@FindBy(xpath="//*[@id=\'customerLightBox_commitBtn\']/div/span")
		private WebElement tocreatecustomer;
		public WebElement gotocreatecustomer() 
		{
			return tocreatecustomer;
		}
		
		
		//web element to deletecutomer settings button
		@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
		private WebElement clickonsettings;
		public WebElement gettosettings() 
		{
			return clickonsettings;
		}
		
		//web element to click on actions 
		@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div/div[2]")
		private WebElement clickonactions;
		public WebElement gotoactionstoclick() 
		{
			return clickonactions;
		}
		
       //web element to click on delete
		
		@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[4]/div/div[3]/div")
		private WebElement clickondelete;
		public WebElement gettodeletecustomer() 
		{
			return clickondelete;
		}
		
		//web element to delete customer permanently
		@FindBy(xpath="//*[@id=\'customerPanel_deleteConfirm_submitTitle\']")
		private WebElement todeletecustomer;
		public WebElement gettodeletecustomerpermanently() 
		{
			return todeletecustomer;
		}
		
		
		//web element to modify customer 
		@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
		private WebElement tomodifycustomer;
		public WebElement gettosettingstomodifycustomer() 
		{
			return tomodifycustomer;
		}
		
		
		//to click on active dropdown to modify customer status
		@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[2]/div[1]/div[2]/div[1]/div[3]/div/div[1]")
		private WebElement toclickonactivedrodown;
		public WebElement gettoactivedropdown() 
		{
			return toclickonactivedrodown;
		}
		
		//web element to click on archive to modify status of customer
		@FindBy(xpath="/html/body/div[23]/div[2]/div")
		private WebElement toclickonarchive;
		public WebElement gettoarchive() 
		{
			return toclickonarchive;
		}
		
		
		//web element to come out of modify customer by click on settings button
		
		@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
		private WebElement toclickonsettings;
		public WebElement gettosettingsaftermodifycustomer() 
		{
			return toclickonsettings;
		}
		///CREATION OF NEW PROJECT
		
		//web element to click on add new to create new project 

		@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")
		private WebElement togotoaddnewtoaddnewproject;
		public WebElement gettoaddnewdropdownforproject() 
		{
			return togotoaddnewtoaddnewproject;
		}
		
		//web element to click on new project
		@FindBy(xpath="/html/body/div[14]/div[2]")
		private WebElement clickonnewproject;
		public WebElement gettoclickonnewproject() 
		{
			return clickonnewproject;
		}
		
		//web element to enter the project name
		@FindBy(xpath="//*[@id=\'projectPopup_projectNameField\']")
		private WebElement enterprojectname;
		public WebElement getenterprojectname() 
		{
			return enterprojectname;
		}
		
		//web to click on create project button
		@FindBy(xpath="//*[@id=\'projectPopup_commitBtn\']/div/span")
		private WebElement clickoncreateproject;
		public WebElement getclickoncreateproject() 
		{
			return clickoncreateproject;
		}
		
		
		//webelements to modify the project
		
		//webelement to click on settings to open action 
		@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
		private WebElement toclickonsettingsmodify;
		public WebElement gettosettingdtomodify() 
		{
			return toclickonsettingsmodify;
		}
		
		//webelement to click on description 
		@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")
		private WebElement toclickondescription;
		public WebElement getclickondescription() 
		{
			return toclickondescription;
		}
		
		
		//webelement to create new task
		
		//web element to click on addnew task
		@FindBy(xpath="//*[@id=\'taskListBlock\']/div[1]/div[1]/div[3]/div/div[2]")
		private WebElement toclickonaddnewtask;
		public WebElement gettoclickonaddnewtask() 
		{
			return toclickonaddnewtask;
		}
		
		
		//web element to click on create new task
		@FindBy(xpath="/html/body/div[13]/div[1]")
        private WebElement toclickoncreatenewtask;
		public WebElement gettoclickoncreatenewtask() 
		{
			return toclickoncreatenewtask;
		}
		
		//web element to enter task name
		@FindBy(xpath="//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[1]/td[1]/input")
		private WebElement toentertask;
		public WebElement gettoentertask() 
		{
		   return toentertask;	
		}
		
		//web element to click on createnew task button
		@FindBy(xpath="//*[@id=\'createTasksPopup_commitBtn\']/div/span")
		private WebElement clickoncreatenewtaskbutton;
		public WebElement gettoclickoncreatenewtaskbutton() 
		{
			return clickoncreatenewtaskbutton;
		}
		
		
		//web element to delete task
		//web element to click on task name to delete it
		@FindBy(xpath="//*[@id=\'taskListBlock\']/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[2]")
		private WebElement todeletetask;
		public WebElement gettoclicktodeletetask() 
		{
			return todeletetask;
		}
		
		
		//web element to click on actions to delete task
		@FindBy(xpath="//*[@id=\'taskListBlock\']/div[3]/div[1]/div[2]/div[3]/div/div/div[2]")
		private WebElement toclickonaction;
		public WebElement gettoclickonactions() 
		{
			return toclickonaction;
		}
		
		
		//web element to click on delete to delete task
		
		@FindBy(xpath="//*[@id=\'taskListBlock\']/div[3]/div[4]/div/div[3]/div")
		private WebElement toclickondelete;
		public WebElement gettoclickondeletetotask() 
		{
			return toclickondelete;
		}
		
		//web element to click on delete permanently
		@FindBy(xpath="//*[@id=\'taskPanel_deleteConfirm_submitTitle\']")
		private WebElement ondeletetaskpermanently;
		public WebElement gettodeletetaskpermanently() 
		{
			return ondeletetaskpermanently;
		}
		
		
		//web element to delete project by click on settings beside project name folder
		
		@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
		private WebElement todeleteproject;
		public WebElement gettoclickonsettingstodeleteproject() 
		{
			return todeleteproject;
		}
		
		//web element to click on actions todelete project
		@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")
		private WebElement clicktodeleteproject;
		public WebElement getclickonactionstodeleteproject() 
		{
			return clicktodeleteproject;
		}
		
		//web element to select delete button after action
		@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[4]/div/div[3]/div")
		private WebElement toclickdeleteproject;
		public WebElement getclickondeleteproject() 
		{
			return toclickdeleteproject;
		}
		
		//web element to click on delete permanently
		
		@FindBy(xpath="//*[@id=\'projectPanel_deleteConfirm_submitTitle\']")
		private WebElement toclickondeletepermanently;
		public WebElement getclickondeletepermanrntly() 
		{
			return toclickondeletepermanently;
		}
		
		
		
} 
