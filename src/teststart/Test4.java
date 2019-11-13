package teststart;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test4 {
	
	@BeforeClass
	public void DemoBeforeClass()
	{
		System.out.println("First to be executed in the class");
	}
	
	@AfterClass
	public void DemoAfterClass()
	{
		System.out.println("Last to be executed in the class");
	}
	
	@BeforeMethod
	public void DemoBeforeMethod()
	{
		System.out.println("Execute before each test case of TEST4 class");
	}

	@AfterMethod
	public void DemoAfterMethod()
	{
		System.out.println("Execute after each test case of TEST4 class");
	}
	
	@Parameters({"Id","Password"})
	@Test
	public void Demo8(int Idno, String Pass)
	{
		System.out.println("Forget World");
		System.out.println(Idno);
		System.out.println(Pass);
	}
	
	@Test(enabled=false)
	public void Demo9()
	{
		System.out.println("Forgive World");
	}
	
	@Test(groups={"Smoke"})
	public void Demo10()
	{
		System.out.println("Re-Enter World");
	}
	
	@Test(timeOut=4000)
	public void Demo11()
	{
		System.out.println("Exit World");
	}
}
