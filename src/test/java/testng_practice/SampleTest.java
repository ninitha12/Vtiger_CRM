package testng_practice;

import org.testng.annotations.Test;
//using atributes
public class SampleTest {
	@Test
	public void sample_m1()
	{
		int a[]= {1,2,3};
		//java.lang.ArrayIndexOutOfBoundsException:
		//if the method throws exception it will fail
		System.out.println(a[4]);
		
		System.out.println("----create-----");
	}
	@Test(priority = -1)
	public void sample_m3()
	{
		System.out.println("---edit----");
	}
	@Test()
	public void sample_m2()
	{
		System.out.println("---delete----");
	}
	//this method skips execution if the sample m1 has exception
	//so for the dependsonmethod to work the other method should work
	@Test(dependsOnMethods ="sample_m1")
	public void sample_m4()
	{
	System.out.println("---test----");	
	}
	}
	

