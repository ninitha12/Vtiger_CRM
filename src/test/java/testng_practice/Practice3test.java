package testng_practice;

import org.testng.annotations.Test;

public class Practice3test {
	@Test(groups = "regression")
	public void method1()
	{
		System.out.println("---hi----");
	}
	@Test(retryAnalyzer = genericutilities.RetryImplementationClass.class)
	public void method2()
	{

		System.out.println("--this is ninitha--");

		
	}

	}

