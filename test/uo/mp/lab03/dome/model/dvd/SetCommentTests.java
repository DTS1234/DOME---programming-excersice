package uo.mp.lab03.dome.model.dvd;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import uo.mp.lab03.dome.model.Dvd;
import uo.mp.lab03.dome.model.Item;

public class SetCommentTests {
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
	 * GIVEN: 	DVD with initial comment, not empty string as arg
	 * WHEN: 	setComment
	 * THEN:	comment field is set to arg
	 */
	@Test
	public void testSetComment() {
		aDVD.setComment("Excellent");

		assertEquals("Excellent", aDVD.getComment());
	}
	
	/**
	 * GIVEN: 	DVD with not initial comment, arg is null 
	 * WHEN: 	setComment 
	 * THEN:	throws an exception
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testSetInvalidComment() {
		aDVD.setComment(null);
		assertEquals("No comment", aDVD.getComment());
	}

}