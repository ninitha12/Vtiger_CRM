package testng_practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Democonfigurationantest {
@Test
public void tests_m2()
{
	System.out.println("--create--");
}
@BeforeSuite
public void bs()
{
	System.out.println("before s");
}
@BeforeClass
public void bc()
{
	System.out.println("before class");
}
@BeforeMethod
public void bm()
{
	System.out.println("before method");
}
@AfterClass
public void ac()
{
	System.out.println("After class");
	
}
@AfterMethod
public void am()
{
	System.out.println("after method");
}
@AfterSuite
public void as()
{
	System.out.println("After suit");
}@Test
public void m_1()
{
	System.out.println("---name--");
}
}
