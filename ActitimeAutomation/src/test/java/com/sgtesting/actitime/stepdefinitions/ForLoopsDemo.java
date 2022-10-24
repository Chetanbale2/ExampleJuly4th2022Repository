package com.sgtesting.actitime.stepdefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class ForLoopsDemo {

	
	public static Logger Log=LogManager.getLogger(ForLoopsDemo.class);
	@Test(priority=1)
	public void showNumbers() 
	{
		Log.info("For loop has started here");
		
		for(int i=20;i<=40;i++) 
		{
			Log.info("The generated number is :" +i);
		}
		Log.info("For loop has ended here");
	}
}
