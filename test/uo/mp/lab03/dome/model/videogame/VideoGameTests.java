package uo.mp.lab03.dome.model.videogame;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import uo.mp.lab03.dome.facilities.Platform;
import uo.mp.lab03.dome.model.VideoGame;

public class VideoGameTests {

	private VideoGame vg1;
	private VideoGame vg1Copy;
	private VideoGame vg2;
	
	@Before
	public void setUp() throws Exception {
	
		vg1 = new VideoGame("t1", Platform.NITENDO, 10, "a1", 10.50);
		vg1Copy = new VideoGame("t1", Platform.NITENDO, 10, "a1", 10.50);
		vg2 = new VideoGame("t2", Platform.PLAYSTATION, 10, "a2", 10.30);
		
	}
	
	/**
	 * GIVEN: two objects wit the same params
	 * WHEN: equals is called
	 * THEN: returns true
	 */
	@Test
	public void EqualsCopyTest() {

		assertTrue(vg1.equals(vg1Copy));
		assertTrue(vg1Copy.equals(vg1));
		
	}
	
	/**
	 * GIVEN: one object 
	 * WHEN: equals is called
	 * THEN: returns true
	 */
	@Test
	public void EqualsSameTest() {
		assertTrue(vg1.equals(vg1));		
	}

	/**
	 * GIVEN: two diffrent objects
	 * WHEN: equals is called
	 * THEN: returns false
	 */
	@Test
	public void EqualsDiffrentTest() {

		assertTrue(!vg1.equals(vg2));
		assertTrue(!vg2.equals(vg1));
		
	}

}
