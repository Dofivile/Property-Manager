import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlotTestStudent {
	private Plot plot1, plot2, plot3;
	@BeforeEach
	void setUp() throws Exception {
		plot1 = new Plot(12, 12, 6, 6);
		plot2 = new Plot(17, 5, 4, 3);
		plot3 = new Plot(8, 9, 3, 2);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testOverlaps() {
		assertTrue((new Plot(0, 0, 10, 10).encompasses(new Plot(1, 2, 3, 3))));
	}

	@Test
	void testEncompasses() {
		assertTrue((new Plot(1, 2, 3, 3).overlaps(new Plot(1, 2, 2, 2))));
	}

	@Test
	void testGetX() {
		assertEquals(12, plot1.getX());
	}

	@Test
	void testGetY() {
		assertEquals(12, plot1.getY());
	}

	@Test
	void testGetWidth() {
		assertEquals(6, plot1.getWidth());
	}

	@Test
	void testGetDepth() {
		assertEquals(6, plot1.getDepth());
	}

	@Test
	void testToString() {
		assertEquals("12,12,6,6", "" + plot1);
		assertEquals("17,5,4,3", "" + plot2);
		assertEquals("8,9,3,2", "" + plot3);
	}

}
