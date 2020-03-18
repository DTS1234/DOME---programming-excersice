package uo.mp.lab03.dome.model.videogame;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import uo.mp.lab03.dome.facilities.Platform;
import uo.mp.lab03.dome.model.VideoGame;

public class GetFinalPriceTest {

	@Test
	public void GetFinalPriceTestValid() {
		
		VideoGame vidGm = new VideoGame("tetsGame", Platform.PLAYSTATION, 2, "EA", 10.40);
		
		double result = vidGm.getFinalPrice();
		
		double expected = vidGm.getBasePrice() + 10.40 * 0.1;
		
		assertTrue(expected == result);
		
	}

}
