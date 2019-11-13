package teststart;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test2 {
	@Test
	public void Demo3()
	{
		System.out.println("Wait World");
	}
	
	@BeforeTest
	public void Demobefore()
	{
		System.out.println("First test to run");
	}
	
	@AfterTest
	public void Demoafter()
	{
		System.out.println("last test to run");
	}
	
	@BeforeSuite
	public void DemobeforeSuite()
	{
		System.out.println("Test at the very begining");
	}
	
	@AfterSuite
	public void DemoafterSuite()
	{
		System.out.println("Test at the very ending");
	}
}
