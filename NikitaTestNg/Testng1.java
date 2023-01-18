package NikitaTestNg;

import org.testng.annotations.Test;

public class Testng1 {
  @Test
  public void cource1()  
  {  
  System.out.println("Html");  
  }  
  @Test  
  public void cource2()  
  {  
  System.out.println("CSS");  
  }  
  @Test(dependsOnMethods= {"cource1"})  
  
  public void cource3()  
  {  
  System.out.println("Javascript");  
  }  
  }  