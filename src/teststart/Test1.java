package teststart;

import org.testng.annotations.Test;

public class Test1 {
@Test(groups={"Smoke"})
	public void Demo1() {
		System.out.println("Hello World");

	}
@Test
public void Demo2() {
	System.out.println("Bye World");

}
}
