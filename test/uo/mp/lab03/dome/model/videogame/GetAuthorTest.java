package uo.mp.lab03.dome.model.videogame;

import static org.junit.Assert.*;

import org.junit.Test;

import uo.mp.lab03.dome.facilities.Platform;
import uo.mp.lab03.dome.model.VideoGame;

public class GetAuthorTest {

	@Test
	public void getAuthorTest() {

		VideoGame vidGm = new VideoGame("tetsGame", Platform.PLAYSTATION, 2, "EA", 10.40);
		
		String result = vidGm.getAuthor();
		
		assertEquals("EA", result);
		
	}

}
