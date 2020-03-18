package uo.mp.lab03.dome.model.videogame;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import uo.mp.lab03.dome.facilities.Platform;
import uo.mp.lab03.dome.model.VideoGame;

public class SetAuthorTests {

private VideoGame tGame;
	
	@Before
	public void setUp() {
		tGame = new VideoGame("tetsGame", Platform.PLAYSTATION, 2, "EA", 10.49);
	}
	
	/*
	 * GIVEN: Null parameter passed
	 * WHEN: calling a setter
	 * THEN: throws an Illegal Argument Exception
	 */
	@Test(expected = IllegalArgumentException.class)
	public void nullParameterSetterTest() {
		tGame.setAuthor(null);
	}
	
	/*
	 * GIVEN: empty string passed as a parameter 
	 * WHEN: calling a setter
	 * THEN: throws an Illegal Argument Exception
	 */
	@Test(expected = IllegalArgumentException.class)
	public void emptyStringParameterSetterTest() {
		tGame.setAuthor("");
	}
	
	/*
	 * GIVEN: whitespace string passed as a parameter 
	 * WHEN: calling a setter
	 * THEN: throws an Illegal Argument Exception
	 */
	@Test(expected = IllegalArgumentException.class)
	public void whitespaceStringParameterSetterTest() {
		tGame.setAuthor("   ");
	}
	
	/**
	 * GIVEN: 	VideoGame with a author set as 'EA'
	 * 			and new param 'AE' being passed
	 * WHEN: 	setAuthor
	 * THEN:	field changed from 'EA' to 'AE'
	 */
	@Test
	public void validParameterSetterTest() { 
		
		tGame.setAuthor("AE");
		assertEquals(("AE"), tGame.getAuthor());
		
	}
	
}
