package uo.mp.lab03.dome.model.dvd;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import uo.mp.lab03.dome.model.Dvd;
import uo.mp.lab03.dome.model.Item;

public class ToStringTest {

	private Item dvdT;
	
	@Before
	public void setUp() throws Exception {
		
		dvdT = new Dvd("Movie2", "Tarantino", 120, 40.70);

	}

	@Test
	public void toStringDvdTest() {
		
		String expected = "DVD: Movie2 (120 mins)\n" + 
				"Director: Tarantino\n" + 
				"You do not own it\n" + 
				"Comment: No comment";

		assertEquals(expected, dvdT.toString());
	}

}
