package testNG_Test_Cases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Grouping {
	
  @Test(groups = {"car","luxury"})
  public void benz() {
	  System.out.println("BENZ");
  }
  
  @Test(groups = {"car","luxury"})
  public void audi() {
	  System.out.println("AUDI");
  }
  
  @Test(groups = {"car","midrange"})
  public void maruti() {
	  System.out.println("Maruti");
  }
  
  @Test(groups = {"bike","performance"})
  public void ktm() {
	  System.out.println("KTM");
  }
  
  @Test(groups = {"bike","performance"})
  public void ducati() {
	  System.out.println("DUCATI");
  }
  
  @Test(groups = {"bike","midrange"})
  public void royalEnfield() {
	  System.out.println("ROYAL ENFIELD");
  }
  
  @BeforeMethod(alwaysRun=true)
  public void beforeMethod() {
	  System.out.println("Before Method");
  }

  @AfterMethod(alwaysRun=true)
  public void afterMethod() {
	  System.out.println("After Method");
  }

}
