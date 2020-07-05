package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class test123 {
  @Test(dataProvider = "dp",groups= {"kk"})
  public void f22(Integer n, String s) {
	  System.out.println(456789);
	  
  }
  
  @Test(dataProvider = "dp",groups="ll")
  public void ear(Integer n, String s) {
	  System.out.println(s);
  }
  @Test(dataProvider = "dp",groups= {"kk","ll"})
  public void f2(Integer n, String s) {
	  System.out.println(n);
  }
  @BeforeMethod
  public void beforeMethod() throws IOException {
	  Properties properties=new Properties();
	  FileInputStream fis=new FileInputStream("C:\\Users\\USER\\Desktop\\try123\\testng\\src\\prop.properties");
	  properties.load(fis);
	  boolean b=properties.contains("false");
	  System.out.println(b);
	  
  }

  @AfterMethod
  public void afterMethod() {
  }


  @DataProvider
  public Object[][] dp() {
    Object[][] pk=new Object[1][2];
    pk[0][0]=1;
    pk[0][1]="rest";
    return pk;
    
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
