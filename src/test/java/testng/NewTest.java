package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test(dataProvider = "dp",groups= {"kk"})
  public void f(Integer n, String s) {
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
  public void beforeMethod() {
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
