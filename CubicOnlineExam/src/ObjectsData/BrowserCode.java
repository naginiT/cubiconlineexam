package ObjectsData;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCode {

	
	public static WebDriver driver;
	public static void BrowserInvoke()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\vijju selenium\\chromedriver.exe");
	     driver=new ChromeDriver();
	     driver.manage().window().maximize();
	}
	public static void open() {
	     driver.get("http://localhost:8089/OnlineHibernate/");

	}
	public static void open3() {
	     driver.get("http://localhost:8089/OnlineHibernate/loginfail.jsp");

	}
	
	public static void open1() {
		driver.get("http://localhost:8089/OnlineHibernate/instructions.jsp");
	}
	public static void open2() {
		driver.get("http://localhost:8089/OnlineHibernate/adminlogin.jsp");
	}
	
	
	
	
}
