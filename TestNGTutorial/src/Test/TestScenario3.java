package Test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestScenario3 
{

	@Test(enabled=false)     // Skips the execution of this test if it has a bug or its know that it is in error.
	public void WebLogin1()
	{
		System.out.println("Web Login1");
	}
	
	@Test(groups="smoke")
	public void WebLogin()
	{
		System.out.println("Web Login");
	}
	
	@BeforeTest
	public void MobileLogin()
	{
		System.out.println("Mobile Login");
		
	}
	
	@AfterTest
	public void MobileAPCall()
	{
		System.out.println("API Call");
	}
	
	@Test(dependsOnMethods= {"WebLogin"})    //Helper Attribute annotation
	public void TestAPI()
	{
		System.out.println("Execute me");
	}
}
