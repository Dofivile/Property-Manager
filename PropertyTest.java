import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyTest {
	Property property;
	@BeforeEach
	void setUp() throws Exception {
	property = new Property("Liketie", "Addis", 1000, "Robel");
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGetPropertyName() {
		assertEquals("Liketie", property.getPropertyName());
	}

	@Test
	void testGetCity() {
		assertEquals("Addis", property.getCity());
	}

	@Test
	void testGetOwner() {
		assertEquals("Robel", property.getOwner());
	}

	@Test
	void testGetRentAmount() {
		assertEquals(1000, property.getRentAmount(), 1000.0);
	}

	@Test
	void testGetPlot() {
		Plot plot = new Plot(1, 2, 3, 3); 
		
		
		assertEquals(1, plot.getX());
		assertEquals(2, plot.getY());
		assertEquals(3, plot.getWidth());
		assertEquals(3, plot.getDepth());
		
	}

	@Test
	void testToString() {
		assertEquals("Liketie,Addis,Robel,1000.0", "" + property);
	}

}
