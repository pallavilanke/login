package login;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestRegistration {

	
	Registration regObj ;
	@BeforeEach
	void setup()
	{
		regObj=new Registration();
		
		
		
	}
	
	
	
	@Test
	void testObject() {
		assertNotNull(regObj);
	}
	
	@Test
	void testIsMatching() {
		
		assertEquals(true,regObj.isMatching("hello@123", "hello@123"),"Matching password and Confirm Password");
	}
}
