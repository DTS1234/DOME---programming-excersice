package uo.mp.lab03.dome.model.videogame;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import uo.mp.lab03.dome.facilities.Platform;
import uo.mp.lab03.dome.model.VideoGame;

public class SetNumOfPlayersTests {

private VideoGame tGame;
	
	@Before
	public void setUp() {
		tGame = new VideoGame("tetsGame", Platform.PLAYSTATION, 2, "EA", 10.49);
	}
	
	/*
	 * GIVEN: 0 > parameter passed
	 * WHEN: calling a setter
	 * THEN: throws an Illegal Argument Exception
	 */
	@Test(expected = IllegalArgumentException.class)
	public void zeroParameterSetterTest() {
		tGame.setNumOfPlayers(0);
	}
	
	/*
	 * GIVEN: negative int passed as a parameter 
	 * WHEN: calling a setter
	 * THEN: throws an Illegal Argument Exception
	 */
	@Test(expected = IllegalArgumentException.class)
	public void emptyStringParameterSetterTest() {
		tGame.setNumOfPlayers(-1);
	}
	
	/*
	 * GIVEN: 	VideoGame with a numOfPlayers field set to 2
	 * 			and new int param 4 being passed
	 * WHEN: 	setNumOfPlayers
	 * THEN:	field changed from 2 to 4
	 */
	@Test
	public void validParameterSetterTest() { 
		tGame.setNumOfPlayers(4);
		assertEquals((4), tGame.getNumOfPlayers());
	}

}
