package uo.mp.lab03.dome.model.cd;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import uo.mp.lab03.dome.model.Cd;

public class ConstructorTests {
	
	private Cd cd;
	private String theTitle;
	private String theArtist;
	private int theTime;
	private int theTracks;
	private double basePrice;
	
	
	@Before
	public void setUp() {
		theTitle = "Come Together";
		theArtist = "Beatles";
		theTime = 70;
		theTracks = 4;
		basePrice = 10.50;
	}

	/**
	 * GIVEN: Valid arguments
	 * WHEN: Create 
	 * THEN: New cd is created and fields are set to args.
	 */
	@Test
	public void testValidParamsConstructor() {
		cd =  new Cd(theTitle, theArtist, theTracks, theTime, basePrice);

		assertEquals("Come Together", cd.getTitle());
		assertEquals("Beatles", cd.getArtist());
		assertEquals(70, cd.getPlayingTime());
		assertEquals(4, cd.getNumberOfTracks());
		assertEquals(false, cd.getOwn());
		assertEquals("No comment", cd.getComment());
	}
	
	/**
	 * GIVEN: InValid title arg passed to create a Cd
	 * WHEN: Creating object of Cd class
	 * THEN: throwing an exception
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testInValidTitleConstructor() {
		  cd =   new Cd  ("  ", theArtist, theTracks, theTime, basePrice);
	}
	
	/**
	 * GIVEN: InValid artist arg passed to create a  
	 * WHEN: Creating object of   class
	 * THEN: throwing an exception
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testInValidArtistConstructor() {
		  cd = new Cd  (theTitle, " ", theTracks, theTime, basePrice);
	}
	
	/**
	 * GIVEN: InValid playing time arg passed to create   
	 * WHEN: Creating object of   class
	 * THEN: throwing an exception
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testInValidPlayingTimeConstructor() {
		  cd = new Cd  (theTitle, theArtist, theTracks, -2, basePrice);
	}

	/**
	 * GIVEN: InValid tracks number arg passed to create
	 * WHEN: Creating object of   class
	 * THEN: throwing an exception
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testInValidTracksConstructor() {
		  cd = new Cd  (theTitle, theArtist, -2, theTime, basePrice);
	}
	
	/**
	 * GIVEN: InValid basePrice arg passed to create   
	 * WHEN: Creating object of   class
	 * THEN: throwing an exception
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testInValidBasePriceConstructor() {
		  cd = new Cd  (theTitle, theArtist, theTracks, theTime, 100001);
	}
	
}
