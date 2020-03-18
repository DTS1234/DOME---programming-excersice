package uo.mp.lab03.dome.model.cd;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import uo.mp.lab03.dome.model.Cd;


public class SetCommentTests {
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
	 * GIVEN: 	CD with "No comment" and valid, not empty, string 
	 * WHEN: 	set comment
	 * THEN:	field is changed to new string
	 */
	@Test
	public void testSetComment() {
		cd.setComment("Excellent");

		assertEquals("Excellent", cd.getComment());
	}
	
	/**
	 * GIVEN: 	CD with a comment different from initial comment
	 * 			and string argument being null 
	 * WHEN: 	setComment
	 * THEN:	field remains unchanged
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testSetInvalidComment() {
		cd.setComment(null);
	}
}
