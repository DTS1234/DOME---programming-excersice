package uo.mp.lab03.dome.model.videogame;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import uo.mp.lab03.dome.facilities.Platform;
import uo.mp.lab03.dome.model.VideoGame;

public class GetNumOfPlayersTests {
	
	@Test
	public void getNumOfPlayersWithTest() {

		VideoGame vidGm = new VideoGame("tetsGame", Platform.PLAYSTATION, 2, "EA", 10.49);
		
		int result = vidGm.getNumOfPlayers();
		
		assertEquals(2, result);
		
	}

}
