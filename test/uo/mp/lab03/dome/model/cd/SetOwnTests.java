package uo.mp.lab03.dome.model.cd;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import uo.mp.lab03.dome.model.Cd;

public class SetOwnTests {
	private Cd cd;
	
	
	@Before
	public void setUp() {
		String theTitle = "Come Together";
		String theArtist = "Beatles";
		int theTime = 70;
		int theTracks = 4;
		double basePrice = 10.5;
		cd = new Cd(theTitle, theArtist, theTracks, theTime, basePrice);
	}

	/**
	 * GIVEN:	CD owned (true), arg true
	 * WHEN:	you run setOwn, regardless how many times 
	 * THEN:	CD remains owned
	 */
	@Test
	public void testSetOwnTrueTrue() {
		cd.setOwn(true);
		cd.setOwn(true);

		assertEquals(true, cd.getOwn());
	}

	/**
	 * GIVEN:	CD owned (true), arg false
	 * WHEN:	setOwn 
	 * THEN:	field changes to false
	 */
	@Test
	public void testSetOwnTrueFalse() {
		cd.setOwn(true);
		cd.setOwn(false);

		assertEquals(false, cd.getOwn());
	}

	/**
	 * GIVEN:   CD not owned (false), arg false
	 * WHEN:	setOwn 
	 * THEN:	field remains false
	 */
	@Test
	public void testSetOwnFalseFalse() {
		cd.setOwn(false);

		assertEquals(false, cd.getOwn());
	}
	
	/**
	 * GIVN:	CD not owned (false), arg true
	 * WHEN:	setOwn 
	 * THEN:	field changes to true
	 */
	@Test
	public void testSetOwnFalseTrue() {
		cd.setOwn(true);

		assertEquals(true, cd.getOwn());
	}
}
