package uo.mp.lab03.dome.model.videogame;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import uo.mp.lab03.dome.facilities.Platform;
import uo.mp.lab03.dome.model.Item;
import uo.mp.lab03.dome.model.VideoGame;

public class ToStringTest {

	private Item gameT;
	
	@Before
	public void setUp() throws Exception {
		gameT = new VideoGame("DXBALL", Platform.NITENDO, 4, "ATARI", 1.2);

	}

	@Test
	public void ToStringVgTest() {
		String expected = "Video Game: DXBALL (for 4 players)\n" + 
				"Author: ATARI\n" + 
				"Platform: NITENDO\n" + 
				"You do not own it\n" + 
				"Comment: No comment";
		assertEquals(expected, gameT.toString());
	}

}
