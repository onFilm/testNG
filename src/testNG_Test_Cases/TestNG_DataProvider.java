package testNG_Test_Cases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG_DataProvider {
	
@DataProvider
public String[][] getData(){
	String myTwoDimensionalStringArray[][]= {{"Prajwal","Password1"},{"Abhi","Password2"},{"Nagesh","Password3"},{"Yogesh","Password4"}};
	return myTwoDimensionalStringArray;
}
	
  @Test(dataProvider="getData")
  public void testDataProvider(String username, String password) {
	  System.out.println("Username : "+username+" -> Password : "+password);
  }
  
}
