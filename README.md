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
	  					      @Test   - Test Case 1
	  				    After Method
                Before Method
                    @Test	-	Test Case 2
                After Method
                  ....
                Before Method
	  				      	@Test  -  Nth Test
	  				    After Method
                
	  			After Class
	  		After Test
	  After Suite
	  
