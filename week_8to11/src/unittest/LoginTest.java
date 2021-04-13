package unittest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import utils.Login;

class LoginTest {

	@Test
	void test() {
		Login lg = new Login();
		
	    //testing login by adding user that exists
	    boolean result= lg.checkLogin("diptan","regmi321");
	    assertEquals(true, result);
	    
	  //testing login by adding non existent user
	  	boolean result1= lg.checkLogin("username", "password"); 
	  	assertEquals(false, result1);
	}

}
