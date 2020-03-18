package uo.mp.lab03.dome.model.dvd;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import uo.mp.lab03.dome.model.Dvd;

public class ConstructorTests {
	private Dvd aDvd;
	private String theTitle;
	private String theDirector;
	private int theTime;
	private double basePrice;
	
	@Before
	public void setUp() {
		theTitle = "La guerra de las Galaxias";
		theDirector = "George Lucas";
		theTime = 125;
		basePrice = 10.5;
	}
		
	/**
	 * GIVEN: Valid arg to create a DVD
	 * WHEN: Create
	 * THEN: new DVD is created with fields setted as arg
	 */
	@Test
	public void testValidParamsConstructor() {
		aDvd = new Dvd(theTitle, theDirector, theTime, basePrice);

		assertEquals(theTitle, aDvd.getTitle());
		assertEquals(theDirector, aDvd.getDirector());
		assertEquals(theTime, aDvd.getPlayingTime());
		assertEquals(false, aDvd.getOwn());
		assertEquals("No comment", aDvd.getComment());
		assertTrue(10.5 == aDvd.getBasePrice());
	}

	
	/**
	 * GIVEN: InValid title arg to create a DVD
	 * WHEN: Creating object of Dvd class
	 * THEN: throwing an exception
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testInValidTitleConstructor() {
		aDvd = new Dvd(" ", theDirector, theTime, basePrice);		
	}

	
	/**
	 * GIVEN: InValid director arg passed to create a DVD
	 * WHEN: Creating object of Dvd class
	 * THEN: throwing an exception
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testInValidDirectorConstructor() {
		aDvd = new Dvd(theTitle, " ", theTime, basePrice);		
	}
	
	/**
	 * GIVEN: InValid director arg passed to create a DVD
	 * WHEN: Creating object of Dvd class
	 * THEN: throwing an exception
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testInValidPLayingTimeConstructor() {
		aDvd = new Dvd(theTitle, theDirector, -1, basePrice);		
	}

}
