package uo.mp.lab03.dome.model.videogame;

import static org.junit.Assert.*;

import org.junit.Test;

import uo.mp.lab03.dome.facilities.Platform;
import uo.mp.lab03.dome.model.VideoGame;

public class GetPlatformTest {

	@Test
	public void getPlatformTest() {

		VideoGame vidGm = new VideoGame("tetsGame", Platform.PLAYSTATION, 2, "EA", 10.49);
		
		Platform result = vidGm.getPlatform();
		
		assertEquals(Platform.PLAYSTATION, result);
		
	}

}
