package NikitaTestNg;

import org.testng.annotations.Test;

public class Testng2 {
	
	@Test  (priority=2)
	public void test1()  
	{  
	System.out.println("this is car");  
	}  
	@Test(priority=3)  
	public void test2()  
	{  
	System.out.println("this is cycle");  
	}  
	@Test(priority=1)  
	public void test3()  
	{  
	System.out.println("this is train");  
	}  
	}  