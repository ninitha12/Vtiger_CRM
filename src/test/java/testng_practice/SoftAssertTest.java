package testng_practice;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTest {
@Test
public void m1()
{
	SoftAssert sa=new SoftAssert();
	System.out.println("--hi---");
	System.out.println("--good---");
	sa.assertEquals("a", "b");
	System.out.println("--morning---");
	System.out.println("--hello---");	
	sa.assertAll();
	//AssertionError: 
}
@Test

public void testnul()

{ SoftAssert sa=new SoftAssert();
	int a=111;

	System.out.println("--step1--");
	System.out.println("--step2--");
	sa.assertNull(a);
	Assert.assertTrue(false);

	System.out.println("--step3--");
	System.out.println("--step4--");
	sa.assertAll();

}
@Test
public void testnuvl()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.myntra.com/");
	String exp="Myntra";
	
	String act = driver.getTitle();
	System.out.println("--step1--");
	System.out.println("--step2--");
	//Assert.assertNull(a);
	Assert.assertTrue(act.contains(exp));
	System.out.println("--step3--");
	System.out.println("--step4--");
}

}
