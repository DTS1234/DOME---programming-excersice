package uo.mp.lab03.dome.model.cd;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import uo.mp.lab03.dome.model.Cd;

public class ToStringTests {

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
		
		cd =  new Cd(theTitle, theArtist, theTracks, theTime, basePrice);
	}

	@Test
	public void toStringTest() {
		
		String expected = "CD: Come Together (70 mins)\n" + 
				"Artist: Beatles\n" + 
				"Tracks: 4\n" + 
				"You do not own it\n" + 
				"Comment: No comment";
		
		assertEquals(expected, cd.toString());
		
	}

}
