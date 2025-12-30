package testng_practice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

public class HardAssertTest {

	@Test
	public void asserttest()
	{
		System.out.println("--hi---");
		System.out.println("--good---");
		Assert.assertEquals("a", "b","did not match ");
		System.out.println("--morning---");
		System.out.println("--hello---");
	}
	@Test
	public void asserttestequals()
	{
		System.out.println("--hi---");
		System.out.println("--good---");
		Assert.assertNotEquals("a", "a");
		System.out.println("--morning---");
		System.out.println("--hello---");
	}
	@Test
	public void test2()
	{   int a=10;
		System.out.println("--step1--");
		System.out.println("--step2--");
		Assert.assertNull(a);
		System.out.println("--step3--");
		System.out.println("--step4--");
	}
	@Test
	public void testnul()
	{   int a=111;
		System.out.println("--step1--");
		System.out.println("--step2--");
		Assert.assertNull(a);
		System.out.println("--step3--");
		System.out.println("--step4--");
	}
	@Test
	public void test3() {
		String exp="vitger";
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		String actual=driver.getTitle();
		Assert.assertEquals(actual, exp);
	}
}
