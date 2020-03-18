package uo.mp.lab03.dome.model.videogame;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import uo.mp.lab03.dome.facilities.Platform;
import uo.mp.lab03.dome.model.VideoGame;

public class SetPlatformTests {

	private VideoGame tGame;
	
	@Before
	public void setUp() {
		tGame = new VideoGame("tetsGame", Platform.PLAYSTATION, 2, "EA", 10.49);
	}
	
	/*
	 * GIVEN: Null parameter
	 * WHEN: calling a setter
	 * THEN: throws an Illegal Argument Exception
	 */
	@Test(expected = IllegalArgumentException.class)
	public void nullParameterSetterTest() {
		tGame.setPlatform(null);
	}
	
	/**
	 * GIVEN: 	VifroGame with a platform Playstaion
	 * 			and new Xbox platform argument being passed
	 * WHEN: 	setPlatform
	 * THEN:	field changed from Platform.Playstation to XBOX
	 * @return 
	 */
	@Test
	public void validParameterSetterTest() { 
		tGame.setPlatform(Platform.XBOX);
		assertEquals((Platform.XBOX), tGame.getPlatform());
	}	
}
