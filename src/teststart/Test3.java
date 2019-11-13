package teststart;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test3 {

	@Test
	public void Demo4()
	{
		System.out.println("Welcome World");
	}
	
	@Test(groups={"Smoke"})
	public void Demo5()
	{
		System.out.println("Getout World");
	}
	
	@Test(dataProvider="getdata")
	public void Demo6(String Username, String Password)
	{
		System.out.println("Getin World");
		System.out.println(Username);
		System.out.println(Password);
	}
	
	@Test(dependsOnMethods={"Demo4"})
	public void Demo7()
	{
		System.out.println("Get through World");
		Assert.assertTrue(false);
	}
	
	@DataProvider
	public Object[][] getdata()
	{
		//Declaring a dataset with 3 rows and 2 columns
		Object[][] data=new Object[3][2];
		
		//Declaring 1st row data
		data[0][0]="A-1st row 1st col";
		data[0][1]="B-1st row 2nd col";
		
		//Declaring 2nd row data
		data[1][0]="C-2nd row 1st col";
		data[1][1]="D-2nd row 2nd col";
		
		//Declaring 3rd row data
		data[2][0]="E-3rd row 1st col";
		data[2][1]="F-3rd row 2nd col";
		return data;

	}
	
	
}
