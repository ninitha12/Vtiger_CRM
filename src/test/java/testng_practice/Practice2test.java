package testng_practice;

import org.testng.annotations.Test;

import genericutilities.BaseClass;

public class Practice2test extends BaseClass {
@Test(retryAnalyzer = genericutilities.RetryImplementationClass.class)
public void tests()
{
	System.out.println("this is test method");
}
@Test
public void testing()
{

	System.out.println("this is a method");

	
}

}
