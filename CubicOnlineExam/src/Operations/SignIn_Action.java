package Operations;

import java.sql.Driver;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import ObjectsData.BrowserCode;
import ObjectsData.InspectElements;
import Utilities.Excel;

public class SignIn_Action  extends Excel  {
	public static String s;
	

	
	//User Login
	public static void logon()  throws Exception
	{
		//String s;
		//System.out.println("Sheet.getLastRowNum() "+Sheet.getLastRowNum());
		//XSSFSheet Sheet = null;
		
		Excel.Code(" Test Data for USER LOGIN", "D:\\vijaylaxmi\\BookStoreSummary.xlsx");
		InspectElements.Login().click();

		for(int i=2;i<=Sheet.getLastRowNum();i++)
		{
			
			// Thread.sleep(3000);
		   try {
			   s=Excel.RowColumn1(i, 1);
		   
		  Thread.sleep(3000);
		InspectElements.Email().sendKeys(s);
		Thread.sleep(3000);
		s=Excel.RowColumn1(i, 2);
		Thread.sleep(3000);
        InspectElements.Pwd().sendKeys(s);
		Thread.sleep(3000);
		InspectElements.SignIn().click();
		Thread.sleep(3000);
		InspectElements.Signout().click();
		Thread.sleep(3000);
		InspectElements.Signout1().click();
		Thread.sleep(3000);
	    InspectElements.Login().click();
		   }
		   catch(Exception e) {
			   
			   s=Excel.RowColumn1(2, 1);
				  Thread.sleep(3000);
				InspectElements.Email().sendKeys(s);
				Thread.sleep(3000);
				InspectElements.Clickhere().click();
				Thread.sleep(3000);
				s=Excel.RowColumn1(2, 1);
				  Thread.sleep(3000);
				InspectElements.Email().sendKeys(s);
				Select sel=new Select(InspectElements.Technology());
				sel.selectByVisibleText("Testing");
				InspectElements.Reset().click();
				Thread.sleep(3000);
				s=Excel.RowColumn1(2, 1);
				  Thread.sleep(3000);
				InspectElements.Email().sendKeys(s);
				Select sel1=new Select(InspectElements.Technology());
				sel1.selectByVisibleText("Testing");
				InspectElements.Sendpassword().click();
				break;
		   }
		}
		}
		   public static void action1() throws Exception {
			   InspectElements.Login().click();
			   		
			   		Excel.Code(" Test Data for USER LOGIN", "D:\\vijaylaxmi\\BookStoreSummary.xlsx");
			   	    s=Excel.RowColumn1(2, 1);
			   	   // Thread.sleep(3000);
			   		InspectElements.Email().sendKeys(s);
			   		//Thread.sleep(3000);
			   		s=Excel.RowColumn1(2, 2);
			   		Thread.sleep(3000);
			   		InspectElements.Pwd().sendKeys(s);
			   		Thread.sleep(3000);
			   		InspectElements.SignIn().click();
		  
		Thread.sleep(3000);
		InspectElements.Contact().click();
		Thread.sleep(3000);
		Excel.Code("TestData for ContactUs page", "D:\\vijaylaxmi\\BookStoreSummary.xlsx");
		s=Excel.RowColumn1(3, 0);
		Thread.sleep(3000);
		InspectElements.Name().clear();
		Thread.sleep(3000);
		InspectElements.Name().sendKeys(s);
		s=Excel.RowColumn1(3, 1);
		Thread.sleep(3000);
		InspectElements.Email2().clear();
		Thread.sleep(3000);
		InspectElements.Email2().sendKeys(s);
		Thread.sleep(3000);
		s=Excel.RowColumn1(3, 2);
		Thread.sleep(3000);
		InspectElements.Subject().clear();
		Thread.sleep(3000);
		InspectElements.Subject().sendKeys(s);
		Thread.sleep(3000);
		s=Excel.RowColumn1(3, 3);
		Thread.sleep(3000);
		InspectElements.Message().clear();
		Thread.sleep(3000);
		InspectElements.Message().sendKeys(s);
		Thread.sleep(3000);
		InspectElements.Send().click();

		
			
		 
	}
	/*public static void forgotpassword() throws Exception {
		Excel.Code(" Test Data for USER LOGIN", "D:\\vijaylaxmi\\BookStoreSummary.xlsx");
	    s=Excel.RowColumn1(2, 1);
	  Thread.sleep(3000);
	InspectElements.Email().sendKeys(s);
	Thread.sleep(3000);
	}*/
	
	
	
	//Admin Login
	public static void serveron() throws Exception {
		Excel.Code("Test Data for Admin Login", "D:\\vijaylaxmi\\BookStoreSummary.xlsx");
	    s=Excel.RowColumn1(2, 1);
        Thread.sleep(3000);
        InspectElements.user().sendKeys(s);
        s=Excel.RowColumn1(2, 2);
        Thread.sleep(3000);
        InspectElements.pswd().sendKeys(s);
        Thread.sleep(3000);
        InspectElements.Btn().click();
        Thread.sleep(3000);
        //InspectElements.java().click();
        InspectElements.Testing().click();
        Thread.sleep(3000);
        InspectElements.questions().click();
        Thread.sleep(3000);
        InspectElements.cuttoffmarks().click();
        Thread.sleep(3000);
        InspectElements.serverOn().click();


	}
	
	//User Login
	public static void action() throws Exception {
		 InspectElements.Login().click();
	   		
	   		Excel.Code(" Test Data for USER LOGIN", "D:\\vijaylaxmi\\BookStoreSummary.xlsx");
	   	    s=Excel.RowColumn1(2, 1);
	   	   Thread.sleep(3000);
	   		InspectElements.Email().sendKeys(s);
	   		Thread.sleep(3000);
	   		s=Excel.RowColumn1(2, 2);
	   		Thread.sleep(3000);
	   		InspectElements.Pwd().sendKeys(s);
	   		Thread.sleep(3000);
	   		InspectElements.SignIn().click();
		Thread.sleep(3000);
		System.out.println(BrowserCode.driver.getCurrentUrl());
        InspectElements.Exam().click();
	/*	System.out.println(BrowserCode.driver.getCurrentUrl());

		Thread.sleep(3000);
String er="http://localhost:8089//OnlineHibernate//instructions.jsp";
		if(BrowserCode.driver.getCurrentUrl().equalsIgnoreCase(er))
		{
System.out.println(er);		}
		InspectElements.Startexam().click();
*/
	}
	public static void nexttab() throws Exception {
		
		InspectElements.Startexam().click();
		Thread.sleep(3000);           
		System.out.println(BrowserCode.driver.getCurrentUrl());
		/*Thread.sleep(3000);                 
		Screen sc=new Screen();
		Pattern p=new Pattern("D:\\sikuli images\\Capture.PNG1.PNG");
        sc.click(p);*/
		
	}
		
		
		/*public static void scroll()
		{
		JavascriptExecutor driver = null;
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement element=((WebElement) driver).findElement(By.xpath("//*[@id=\"input-20\"]"));
		 js.executeScript("arguments[0].scrollIntoView();", element);
		}*/
		//Excel.Code("TestData for ContactUs page", "D:\\vijaylaxmi\\BookStoreSummary.xlsx");
		   
		
		/*s=Excel.RowColumn1(3, 1);
		Thread.sleep(3000);
		InspectElements.Email2().clear();
		Thread.sleep(3000);
		InspectElements.Email2().sendKeys(s);;
		s=Excel.RowColumn1(3, 2);
		Thread.sleep(3000);
		InspectElements.Subject().clear();
		Thread.sleep(3000);
		InspectElements.Subject().sendKeys(s);
		s=Excel.RowColumn1(3, 3);
		Thread.sleep(3000);
		InspectElements.Message().clear();
		Thread.sleep(3000);
		InspectElements.Message().sendKeys(s);
		Thread.sleep(3000);
		InspectElements.Exam().click();
		Thread.sleep(3000);
		InspectElements.Startexam().click();
		InspectElements.Signout().click();
		Thread.sleep(3000);
		InspectElements.Signout1().click();
		Thread.sleep(3000);*/
			
			
			/*public static void action2() throws Exception
			{
				InspectElements.signin().click();

				Excel.Code(" Test Data for USER LOGIN", "D:\\vijaylaxmi\\BookStoreSummary.xlsx");

		s=Excel.RowColumn1(5, 1);
		Thread.sleep(3000);
		InspectElements.email().sendKeys(s);
		s=Excel.RowColumn1(5, 2);
		Thread.sleep(3000);
		InspectElements.password().sendKeys(s);
		Thread.sleep(3000);
		InspectElements.reset().click();
		Thread.sleep(3000);
		InspectElements.clickhere().click();
		Thread.sleep(3000);
		s=Excel.RowColumn1(4, 1);
		Thread.sleep(3000);
		InspectElements.email().sendKeys(s);
		s=Excel.RowColumn1(4, 2);
		Thread.sleep(3000);
		InspectElements.technology().click();

		WebElement element = InspectElements.technology() ;
		Select sel=new Select(element);
				
				sel.selectByVisibleText("Testing");
				InspectElements.sendpassword().click();
			
			}
			public static void action3() throws Exception 
			{
				//Inspectelement.profile().click();
				Excel.Code("Test Data for Admin Login", "D:\\vijaylaxmi\\BookStoreSummary.xlsx");
				s=Excel.RowColumn1(3, 1);
				Thread.sleep(3000);
				InspectElements.user().sendKeys(s);
				s=Excel.RowColumn1(2, 2);
				Thread.sleep(3000);
				InspectElements.pswd().sendKeys(s);
				Thread.sleep(3000);
		InspectElements.Btn().click();
		Thread.sleep(3000);
		InspectElements.profile().click();
		Excel.Code("TestData For Profile", "D:\\vijaylaxmi\\BookStoreSummary.xlsx");
		s=Excel.RowColumn1(4, 1);
		Thread.sleep(3000);
		InspectElements.fullname().clear();
		Thread.sleep(3000);
		InspectElements.fullname().sendKeys(s);
		Thread.sleep(3000);
		InspectElements.email1().clear();
		Thread.sleep(3000);
		InspectElements.email1().sendKeys(s);
		s=Excel.RowColumn1(4, 2);
		Thread.sleep(3000);
		InspectElements.password1().clear();
		Thread.sleep(3000);
		s=Excel.RowColumn1(4, 3);
		Thread.sleep(3000);
		InspectElements.confirmpassword().clear();
		Thread.sleep(3000);
		InspectElements.confirmpassword().sendKeys(s);
		Thread.sleep(3000);
		InspectElements.update().click();
		Thread.sleep(3000);
		InspectElements.reset1().click();
		
		
		*/
//	}

}
