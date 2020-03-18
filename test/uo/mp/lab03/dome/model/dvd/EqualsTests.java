package uo.mp.lab03.dome.model.dvd;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import uo.mp.lab03.dome.model.Dvd;

public class EqualsTests {

	private Dvd dvd1;
	private Dvd dvd1Copy;
	private Dvd dvd2;
	
	@Before
	public void setUp() throws Exception {
	
		dvd1 = new Dvd("t1", "a1", 10, 10.13);
		dvd1Copy = new Dvd("t1", "a1", 10, 10.13);
		dvd2 = new Dvd("t2", "a2", 10, 10.50);
		
	}
	
	/**
	 * GIVEN: two objects wit the same params
	 * WHEN: equals is called
	 * THEN: returns true
	 */
	@Test
	public void EqualsCopyTest() {

		assertTrue(dvd1.equals(dvd1Copy));
		assertTrue(dvd1Copy.equals(dvd1));
		
	}
	
	/**
	 * GIVEN: one object 
	 * WHEN: equals is called
	 * THEN: returns true
	 */
	@Test
	public void EqualsSameTest() {
		assertTrue(dvd1.equals(dvd1));		
	}

	/**
	 * GIVEN: two diffrent objects
	 * WHEN: equals is called
	 * THEN: returns false
	 */
	@Test
	public void EqualsDiffrentTest() {

		assertTrue(!dvd1.equals(dvd2));
		assertTrue(!dvd2.equals(dvd1));
		
	}

}
