package testng_practice;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericutilities.BaseClass;
//@Listeners(genericutilities.ListenersImplementationClass.class)
public class Practicetest extends BaseClass {
@Test(groups = "smoke",retryAnalyzer = genericutilities.RetryImplementationClass.class)
public void m1()
{
	System.out.println("hello");
//	Assert.fail();
}
@Test(groups = "regression")
public void m2()
{
	System.out.println("goodmorning");
}
@Test
public void sample_m4()
{
	
System.out.println("---test----");	
}

}
