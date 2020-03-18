package uo.mp.lab03.dome.model.dvd;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import uo.mp.lab03.dome.model.Dvd;
import uo.mp.lab03.dome.model.Item;

public class SetOwnTests {
	private Item aDVD;
	
	@Before
	public void setUp() {
		String theTitle = "La guerra de las Galaxias";
		String theDirector = "George Lucas";
		int theTime = 125;
		double basePrice = 10.5;
		aDVD = new Dvd(theTitle, theDirector, theTime, basePrice);
	}
	
	/**
	 * GIVEN:	DVD owned (true), arg is true 
	 * WHEN:	setOwn
	 * THEN:	DVD field does not change
	 */
	@Test
	public void testSetOwnTrueTrue() {
		aDVD.setOwn(true);
		aDVD.setOwn(true);
		assertEquals(true, aDVD.getOwn());
	}

	/**
	 * GIVEN:	DVD owned, arg false 
	 * WHEN:	setOwn 
	 * THEN:	DVD changes to not owned
	 */
	@Test
	public void testSetOwnTrueFalse() {
		aDVD.setOwn(true);
		aDVD.setOwn(false);
		assertEquals(false, aDVD.getOwn());
	}

	/**
	 * GIVEN:	DVD not owned, arg false
	 * WHEN:	setOwn 
	 * THEN:	DVD not owned 
	 */
	@Test
	public void testSetOwnFalseFalse() {
		aDVD.setOwn(false);
		assertEquals(false, aDVD.getOwn());
	}
	
	/**
	 * GIVEN:	DVD not owned, arg true
	 * WHEN:	setOwn 
	 * THEN:	DVD changes to owned
	 */
	@Test
	public void testSetOwnFalseTrue() {
		aDVD.setOwn(true);
		assertEquals(true, aDVD.getOwn());
	}
	
}