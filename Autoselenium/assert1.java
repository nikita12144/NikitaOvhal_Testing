package Autoselenium;

import org.junit.Assert;
public class assert1 {
	public static void main(String[] args) {  
        Assert.assertNotEquals("Hello", "How are you");  
        System.out.println("Actual result or expected result are not equal");  
        
        Assert.assertEquals("Hello", "Hello");  
        System.out.println("Actual result or expected result are equal");  
    }  
  
} 