# testNG

#### Hierarchy 

		 Suite
	 		Test
	 			Class
	 				Method
	
#### Execution priority

    Before Suite
	  		Before Test
	  			  Before Class
            
	  				Before Method
	  				      @Test - Test Case 1
	  				After Method
					Before Method
					    @Test - Test Case 2
					After Method
					  ....
					Before Method
	  				      	@Test - Nth Test
	  				After Method
                
	  			After Class
	  		After Test
	  After Suite

#### Annotations
	@Test
	@BeforeSuite, @BeforeTest, @BeforeClass, @BeforeMethod and @BeforeGroups
	@AfterSuite, @AfterTest, @AfterClass, @AfterMethod and @AfterGroups
	@Parameters
	@DataProvider
	@Listener
	@ExpectedExceptions
	...
	More
#### Annotation attribute examples
|Annotations  |Attribute         |Configuration information for a TestNG class:                                                                                                                                                                                                                                                                                             |
|-------------|------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
|@BeforeSuite |                  |@BeforeSuite: The annotated method will be run before all tests in this suite have run.                                                                                                                                                                                                                                                   |
|@AfterSuite  |                  |@AfterSuite: The annotated method will be run after all tests in this suite have run.                                                                                                                                                                                                                                                     |
|@BeforeTest  |                  |@BeforeTest: The annotated method will be run before any test method belonging to the classes inside the <test> tag is run.                                                                                                                                                                                                               |
|@AfterTest   |                  |@AfterTest: The annotated method will be run after all the test methods belonging to the classes inside the <test> tag have run.                                                                                                                                                                                                          |
|@BeforeGroups|                  |@BeforeGroups: The list of groups that this configuration method will run before. This method is guaranteed to run shortly before the first test method that belongs to any of these groups is invoked.                                                                                                                                   |
|@AfterGroups |                  |@AfterGroups: The list of groups that this configuration method will run after. This method is guaranteed to run shortly after the last test method that belongs to any of these groups is invoked.                                                                                                                                       |
|@BeforeClass |                  |@BeforeClass: The annotated method will be run before the first test method in the current class is invoked.                                                                                                                                                                                                                              |
|@AfterClass  |                  |@AfterClass: The annotated method will be run after all the test methods in the current class have been run.                                                                                                                                                                                                                              |
|@BeforeMethod|                  |@BeforeMethod: The annotated method will be run before each test method.                                                                                                                                                                                                                                                                  |
|@AfterMethod |                  |@AfterMethod: The annotated method will be run after each test method.                                                                                                                                                                                                                                                                    |
|             |alwaysRun         |For before methods (beforeSuite, beforeTest, beforeTestClass and beforeTestMethod, but not beforeGroups): If set to true, this configuration method will be run regardless of what groups it belongs to.                                                                                                                                  |
|             |                  |For after methods (afterSuite, afterClass, ...): If set to true, this configuration method will be run even if one or more methods invoked previously failed or was skipped.                                                                                                                                                              |
|             |dependsOnGroups   |The list of groups this method depends on.                                                                                                                                                                                                                                                                                                |
|             |dependsOnMethods  |The list of methods this method depends on.                                                                                                                                                                                                                                                                                               |
|             |enabled           |Whether methods on this class/method are enabled.                                                                                                                                                                                                                                                                                         |
|             |groups            |The list of groups this class/method belongs to.                                                                                                                                                                                                                                                                                          |
|             |inheritGroups     |If true, this method will belong to groups specified in the @Test annotation at the class level.                                                                                                                                                                                                                                          |
|             |                  |                                                                                                                                                                                                                                                                                                                                          |
|             |                  |                                                                                                                                                                                                                                                                                                                                          |
|@DataProvider|                  |Marks a method as supplying data for a test method. The annotated method must return an Object[][] where each Object[] can be assigned the parameter list of the test method. The @Test method that wants to receive data from this DataProvider needs to use a dataProvider name equals to the name of this annotation.                  |
|             |name              |The name of this data provider. If it's not supplied, the name of this data provider will automatically be set to the name of the method.                                                                                                                                                                                                 |
|             |parallel          |If set to true, tests generated using this data provider are run in parallel. Default value is false.                                                                                                                                                                                                                                     |
|             |                  |                                                                                                                                                                                                                                                                                                                                          |
|             |                  |                                                                                                                                                                                                                                                                                                                                          |
|@Factory     |                  |Marks a method as a factory that returns objects that will be used by TestNG as Test classes. The method must return Object[].                                                                                                                                                                                                            |
|             |                  |                                                                                                                                                                                                                                                                                                                                          |
|             |                  |                                                                                                                                                                                                                                                                                                                                          |
|@Listeners   |                  |Defines listeners on a test class.                                                                                                                                                                                                                                                                                                        |
|             |value             |An array of classes that extend org.testng.ITestNGListener.                                                                                                                                                                                                                                                                               |
|             |                  |                                                                                                                                                                                                                                                                                                                                          |
|             |                  |                                                                                                                                                                                                                                                                                                                                          |
|@Parameters  |                  |Describes how to pass parameters to a @Test method.                                                                                                                                                                                                                                                                                       |
|             |value             |The list of variables used to fill the parameters of this method.                                                                                                                                                                                                                                                                         |
|             |                  |                                                                                                                                                                                                                                                                                                                                          |
|             |                  |                                                                                                                                                                                                                                                                                                                                          |
|@Test        |                  |Marks a class or a method as part of the test.                                                                                                                                                                                                                                                                                            |
|             |alwaysRun         |If set to true, this test method will always be run even if it depends on a method that failed.                                                                                                                                                                                                                                           |
|             |dataProvider      |The name of the data provider for this test method.                                                                                                                                                                                                                                                                                       |
|             |dataProviderClass |The class where to look for the data provider. If not specified, the data provider will be looked on the class of the current test method or one of its base classes. If this attribute is specified, the data provider method needs to be static on the specified class.                                                                 |
|             |dependsOnGroups   |The list of groups this method depends on.                                                                                                                                                                                                                                                                                                |
|             |dependsOnMethods  |The list of methods this method depends on.                                                                                                                                                                                                                                                                                               |
|             |description       |The description for this method.                                                                                                                                                                                                                                                                                                          |
|             |enabled           |Whether methods on this class/method are enabled.                                                                                                                                                                                                                                                                                         |
|             |expectedExceptions|The list of exceptions that a test method is expected to throw. If no exception or a different than one on this list is thrown, this test will be marked a failure.                                                                                                                                                                       |
|             |groups            |The list of groups this class/method belongs to.                                                                                                                                                                                                                                                                                          |
|             |invocationCount   |The number of times this method should be invoked.                                                                                                                                                                                                                                                                                        |
|             |invocationTimeOut |The maximum number of milliseconds this test should take for the cumulated time of all the invocationcounts. This attribute will be ignored if invocationCount is not specified.                                                                                                                                                          |
|             |priority          |The priority for this test method. Lower priorities will be scheduled first.                                                                                                                                                                                                                                                              |
|             |successPercentage |The percentage of success expected from this method                                                                                                                                                                                                                                                                                       |
|             |singleThreaded    |If set to true, all the methods on this test class are guaranteed to run in the same thread, even if the tests are currently being run with parallel="methods". This attribute can only be used at the class level and it will be ignored if used at the method level. Note: this attribute used to be called sequential (now deprecated).|
|             |timeOut           |The maximum number of milliseconds this test should take.                                                                                                                                                                                                                                                                                 |
|             |threadPoolSize    |The size of the thread pool for this method. The method will be invoked from multiple threads as specified by invocationCount.                                                                                                                                                                                                            |
|             |                  |Note: this attribute is ignored if invocationCount is not specified                                                                                                                                                                                                                                                                       |
	
#### TestNG Tests Running Order
	By Default, testNG runs the test methods based on the alphabetical order of test method names.
	The running of the test method can be handled by specifying the priority
	eg. @Test(priority = 1)
	    @Test(priority = 2)
	   
### TestNG Asserts and verify
**Soft Assert** - Soft Assert collects errors during @Test. Soft Assert does not throw an exception when an assert fails and would 		continue with the next step after the assert statement.

**Hard Assert** - Hard Assert throws an AssertException immediately when an assert statement fails and test suite continues with 			next @Test

**Verify** - When a “verify” command fails, the test will continue executing and logging the failure
	
### TestNG Grouping
	@Test(groups={"car","luxury"})
	
Add below the tags in .xml runner file

	<groups>
		<run>
			<include name="bike"></include>
			<include name="luxury"></include>
		</run>
	</groups>
or

	<groups>
		<define name="all">
			<include name="bike"></include>
			<include name="luxury"></include>
		</define>
		<run>
			<include name="all"></include>
		</run>
	</groups>
	
### TestNG dependsOnMethod and alwaysRun
	@Test(dependsOnMethods = {"testMethod2"}, alwaysRun=true)  - this test depends on testMethod 2 and runs the test irrespective 		of the testMethod2 pass/fail
	
	
### TestNG test enable/disable
	@Test(enabled=true)  - test execution is enabled
	@Test(enabled=false) - test execution is disabled
	
### TestNG test timeOut
	@Test(timeOut=100)  - test fails if it takes more than 100 mili seconds.
	
### TestNG Parameters
	@Parameter({"browser","url"})   - test method should have same no of parameters to accept these
	
	<parameter name ="browser" value ="chrome"></parameter>
	<parameter name ="url" value ="https://www.google.com"></parameter>   // paste in testNG runner xml

### TestNG DataProvider
	@DataProvider
	public String[][] getData(){
		String myTwoDimensionalStringArray[][]= {{"Prajwal","Password1"},{"Abhi","Password2"},{"Nagesh","Password3"},			{"Yogesh","Password4"}};
		return myTwoDimensionalStringArray;
		}
	
	 @Test(dataProvider="getData")
	 public void testDataProvider(String username, String password) {
		  System.out.println("Username : "+username+" -> Password : "+password);
	 }
	  
	 @Test(dataProvider="getData", dataProviderClass="testData.class")  -- use this if the getData method is in different class.
	 
### TestNG ITestResult
	@AfterMethod
	  public void afterMethod(ITestResult testResult) {
		  if(testResult.getStatus() == testResult.FAILURE) {
			  System.out.println("Failed : " + testResult.getMethod().getMethodName());
		  }

		  if(testResult.getStatus() == testResult.SUCCESS) {
			  System.out.println("Success : " + testResult.getName());
		  }
	  }
	  
### TestNG ITestListener

**ISuiteListener**: We can use this test suite listener to perform some operations when test suite starts and when all the tests are executed. This interface contains two methods – onStart(ISuite suite) and onFinish(ISuite suite) and provides access to test suite object.

**ITestListener**: We can use this listener to analyze test methods, perform logging. We can also use them to send notifications if any test fails by implementing onTestFailure(ITestResult result) method.

**IAnnotationTransformer**: We can implement this interface to modify the annotations for any @Test method. Note that we can use this annotation only with TestNG XML configuration.

**IAnnotationTransformer2**: We can implement this interface to modify the annotations for any method other than @Test method.This annotation can be used with TestNG XML configuration only.

**IConfigurable**: If a test class implements this interface, its run() method will be invoked instead of each configuration method found.

**IConfigurationListener**: Listener interface for events related to configuration methods.

**IExecutionListener**: This listener is used to monitor when a TestNG run starts and ends.

**IHookable**: If a test class implements this interface, its run() method will be invoked instead of each @Test method found.

**IInvokedMethodListener**: A listener that gets invoked before and after a method is invoked by TestNG.

**IMethodInterceptor:** This class is used to alter the list of test methods that TestNG is about to run.

**IReporter**: This interface can be implemented by clients to generate a report
