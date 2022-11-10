import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ManagementCompanyTest {
	Property prop;
	ManagementCompany mang ; 

	@BeforeEach
	void setUp() throws Exception {
		mang= new ManagementCompany("Sam", "555555555",7);
		prop = new Property ("Strive", "Beckman", 2613, "BillyBob Wilson",2,5,2,2);	
	}

	@AfterEach
	void tearDown() throws Exception {
		mang=null;
	}

	@Test
	void testAddPropertyProperty() {
		assertEquals(mang.addProperty(prop),0,0);	
		assertEquals(1, mang.getPropertiesCount());
	}

	@Test
	void testGetPropertiesCount() {
				 
		assertEquals(mang.addProperty(prop),0,0);	
		assertEquals(1, mang.getPropertiesCount());
	}

	@Test
	void testToString() {
				 
		assertEquals(mang.addProperty(prop),0,0);
		assertEquals("List of the properties for Sam, taxID: 555555555\n" +
				"_______________________________________\n" + 
		"Strive,Beckman,BillyBob Wilson,2613.0\n" +  "________________________________________\n" +
		"\nTotal management fee: " + ((2613.0 * 7) / 100), mang.toString());
	}

}
