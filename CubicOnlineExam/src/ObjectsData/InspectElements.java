package ObjectsData;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class InspectElements extends BrowserCode{
	//user credentials
	static By signin=By.xpath("/html/body/nav/div[1]/div[2]/ul/li[1]/a");
	static By email=By.name("email");
	static By password=By.name("password");
	static By signin1=By.cssSelector(".tp > input:nth-child(1)");
	static By contact=By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[4]/a/span");
	static By name=By.xpath("//*[@id=\"input-20\"]");
	static By email2=By.cssSelector("#input-21");
	static By subject=By.name("subject");
	static By message=By.xpath("/html/body/div[2]/div[2]/div/div/div[1]/form/textarea");
	static By send=By.xpath("/html/body/div[2]/div[2]/div/div/div[1]/form/input");
	static By exam=By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[3]/a/span");
	static By startexam=By.xpath("/html/body/center/form/input");
	static By results=By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[4]/a/span");
	static By home=By.xpath("/html/body/center/a");
	static By signout=By.xpath("/html/body/nav/div[1]/div[2]/ul/li[2]/a");
	static By signout1=By.xpath("//*[@id=\"myModal2\"]/div/div/div/div[1]/div/form/input");
	static By login=By.cssSelector("#reg_form > fieldset > div:nth-child(3) > div > button.btn.btn-success.btn-lg");
	static By reset=By.xpath("//*[@id=\"reg_form\"]/fieldset/div[3]/div/button[2]");
	static By clickhere=By.cssSelector("#reg_form > fieldset:nth-child(3) > h2:nth-child(4) > a:nth-child(1)");
	//static By email1=By.name("email");
	//static By technology=By.name("technology");
	//static WebElement element1=driver.findElement(By.name("technology"));
	//static By technology=By.xpath("//*[@id=\"reg_form\"]/fieldset/div[2]/div/div/select");
	static By technology=By.cssSelector("#reg_form > fieldset > div:nth-child(2) > div > div > select");
	static By sendpassword=By.cssSelector("button.btn:nth-child(1)");
	//admin credentials
	static By user=By.name("email");
	static By pswd=By.id("userPw");
	static By loginBtn=By.cssSelector("#reg_form > fieldset > div:nth-child(3) > div > button.btn.btn-success.btn-lg");
	//static By java =By.cssSelector("#bs-example-navbar-collapse-1 > ul > li:nth-child(3) > a > span");
	static By testing =By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[5]/a/span");
	static By questions =By.cssSelector("#bs-example-navbar-collapse-1 > ul > li.dropdown > a > span");
	static By cuttoffmarks =By.cssSelector("#bs-example-navbar-collapse-1 > ul > li.dropdown.open > ul > li:nth-child(2) > a");
	static By serveron=By.xpath("/html/body/div[2]/table/tbody/tr[4]/td[3]/font/input");

	
	//user credentials
	public static  WebElement Login()
	{
		return driver.findElement(signin);
		
	}
	public static  WebElement Email()
	{
		return driver.findElement(email);
		
	}
	public static  WebElement Pwd()
	{
		return driver.findElement(password);
		
	}
	public static  WebElement SignIn()
	{
		return driver.findElement(signin1);
		
	}
	public static  WebElement Contact()
	{
		return driver.findElement(contact);
		
	}
	public static WebElement  Name()  {

		return driver.findElement(name);

	}
	public static WebElement  Email2()  {

		return driver.findElement(email2);

	}
	public static WebElement  Subject()  {

		return driver.findElement(subject);

	}
	public static WebElement  Message()  {

		return driver.findElement(message);

	}
	public static WebElement  Send()  {

		return driver.findElement(send);

	}
	public static WebElement  Exam()  {

		return driver.findElement(exam);

	}
	public static WebElement  results()  {

		return driver.findElement(results);

	}
	public static WebElement  home()  {

		return driver.findElement(home);

	}
	public static WebElement  Startexam()  {

		return driver.findElement(startexam);

	}
	//admin credentials
	public static WebElement user() {
		
		return driver.findElement(user);
		
	}

	public static WebElement pswd() {
		
		return driver.findElement(pswd);
		
	} 

	public static WebElement Btn() {    
		
			return driver.findElement(loginBtn);
		
	}
	/*public static WebElement java() {    
		
		return driver.findElement(java);

	}*/
public static WebElement Testing() {    
		
		return driver.findElement(testing);

	}
	public static WebElement questions() {    
		
		return driver.findElement(questions);

	}
	public static WebElement cuttoffmarks() {    
		
		return driver.findElement(cuttoffmarks);

	}
	public static WebElement serverOn() {    
		
		return driver.findElement(serveron);

	}
public static WebElement Signout() {    
		
		return driver.findElement(signout);

	}
	public static WebElement Signout1() {    
		
		return driver.findElement(signout1);

	}
public static WebElement Login1() {    
		
		return driver.findElement(login);

	}
public static WebElement Reset() {    
	
	return driver.findElement(reset);

}
public static WebElement Clickhere() {    
	
	return driver.findElement(clickhere);

}
public static WebElement Technology() {    
	
	return driver.findElement(technology);

}
public static WebElement Sendpassword() {    
	
	return driver.findElement(sendpassword);

}


	

	
	

}
