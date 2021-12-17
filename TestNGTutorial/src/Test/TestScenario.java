package Test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestScenario {

	@Parameters({"URL"})
	@Test
	public void Demo(String url)
	{
	    // TODO Auto-generated method stub
		System.out.println("Hello World");
		System.out.println(url);
	}
	
	@Test
	public void Demo2()
	{
		System.out.println("Bye!");
	}
}
