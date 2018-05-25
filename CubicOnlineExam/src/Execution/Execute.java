package Execution;

import org.testng.annotations.Test;

import ObjectsData.BrowserCode;
import Operations.SignIn_Action;
//committig purpose
public class Execute {
	@Test
	public void exe() throws Exception
	{
		BrowserCode.BrowserInvoke();
		BrowserCode.open();
	    SignIn_Action.logon();
	    BrowserCode.BrowserInvoke();
		BrowserCode.open();
		SignIn_Action.action1();
		BrowserCode.BrowserInvoke();
		BrowserCode.open2();                   
		SignIn_Action.serveron();
		BrowserCode.BrowserInvoke();
        BrowserCode.open();
       SignIn_Action.action();
   	BrowserCode.BrowserInvoke();
    BrowserCode.open1();
        SignIn_Action.nexttab();

		
	}

}
