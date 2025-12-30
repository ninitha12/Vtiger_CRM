//package testng_practice;
//
//import org.testng.Assert;
//
//import genericutilities.BaseClass;
////import org.testng.annotations.AfterClass;
////import org.testng.annotations.AfterMethod;
////import org.testng.annotations.AfterSuite;
////import org.testng.annotations.BeforeClass;
////import org.testng.annotations.BeforeMethod;
////import org.testng.annotations.BeforeSuite;
////import org.testng.annotations.Test;
////
////import genericutilities.BaseClass;
////using configuration annotation
////@Listeners(genericutilities.ListenersImplementationClass.class)
//public class Testngpracticetest extends BaseClass{
////@BeforeMethod
////public void beforem() {
////	System.out.println("--before method-1---");
////}
////@BeforeMethod
////public void beforem2()
////{
////	System.out.println("--before method2------");
////}
////@BeforeSuite
////public void bs()
////{
////	System.out.println("Before suite--");
////}
////@BeforeClass
////public void bc()
////{
////	System.out.println("Before class");
////}
//	//grouping the methods
////@Test(groups = "smoke",retryAnalyzer = genericutilities.RetryImplementationClass.class)
////public void sample()
////{
////	System.out.println("----edit----");
////}
////@AfterClass
////public void ac()
////{
////	System.out.println("after class----");
////}
////@AfterMethod
////public void am()
////{
////	System.out.println("after method----");
////}
////@AfterMethod
////public void am2()
////{
////	System.out.println("after method2----");
////}
////@AfterSuite
////public void as()
////{
////	System.out.println("after suit---");
////}
//	@Test(groups = "regression")
//	public void demo_m1()
//	{
//		System.out.println("----create---");
//	}
//	@Test
//	public void impact()
//	{
//		System.out.println("this is impact method");
//	}
//	@Test
//	public void m2()
//	{
//		Assert.fail();
//		System.out.println("this is m2 method");
//	}
//}
//
