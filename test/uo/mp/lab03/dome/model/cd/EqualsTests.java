package uo.mp.lab03.dome.model.cd;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import uo.mp.lab03.dome.model.Cd;

public class EqualsTests {

	private Cd cd1;
	private Cd cd1Copy;
	private Cd cd2;
	
	@Before
	public void setUp() throws Exception {
	
		cd1 = new Cd("t1", "a1", 10, 100, 10.50);
		cd1Copy = new Cd("t1", "a1", 10, 100, 10.50);
		cd2 = new Cd("t2", "a2", 10, 100, 10.50);
		
	}
	
	/**
	 * GIVEN: two objects wit the same params
	 * WHEN: equals is called
	 * THEN: returns true
	 */
	@Test
	public void EqualsCopyTest() {

		assertTrue(cd1.equals(cd1Copy));
		assertTrue(cd1Copy.equals(cd1));
		
	}
	
	/**
	 * GIVEN: one object 
	 * WHEN: equals is called
	 * THEN: returns true
	 */
	@Test
	public void EqualsSameTest() {
		assertTrue(cd1.equals(cd1));		
	}

	/**
	 * GIVEN: two diffrent objects
	 * WHEN: equals is called
	 * THEN: returns false
	 */
	@Test
	public void EqualsDiffrentTest() {

		assertTrue(!cd1.equals(cd2));
		assertTrue(!cd2.equals(cd1));
		
	}
}
