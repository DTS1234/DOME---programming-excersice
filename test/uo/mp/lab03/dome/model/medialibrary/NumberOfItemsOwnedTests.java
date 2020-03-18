package uo.mp.lab03.dome.model.medialibrary;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import uo.mp.lab03.dome.facilities.Platform;
import uo.mp.lab03.dome.model.Cd;
import uo.mp.lab03.dome.model.Dvd;
import uo.mp.lab03.dome.model.MediaLibrary;
import uo.mp.lab03.dome.model.VideoGame;

public class NumberOfItemsOwnedTests {
	
	private MediaLibrary libTest;
	private Dvd d1;
	private Cd cd1;
	private VideoGame vg1;

	@Before
	public void setUp() {
		libTest = new MediaLibrary();
		
		d1 = new Dvd("testDVD", "testDirector", 120, 10.5);
		cd1 = new Cd("testCd", "testArtist", 15, 62, 100);
		vg1 = new VideoGame("testVideoGame", Platform.PLAYSTATION, 2, "testAuthor", 99.55);
		
		libTest.add(vg1);
		libTest.add(cd1);
		libTest.add(d1);
	}
	
	/*
	 * GIVEN: MediaLibrary object with 3 items on list
	 * every item set to owned
	 * WHEN: calling a numberOfItemsOwnedTest()
	 * THEN: returns 3
	 */
	@Test
	public void fullLisstnumberOfItemsOwnedTest(){
		
		vg1.setOwn(true);
		cd1.setOwn(true);
		d1.setOwn(true);
		
		assertEquals(3, libTest.numberOfItemsOwned());
		
	}
	
	/*
	 * GIVEN: MediaLibrary object with 3 items on list
	 * none of it owned
	 * WHEN: calling a numberOfItemsOwnedTest()
	 * THEN: returns 0
	 */
	@Test
	public void emptyListNumberOfItemsOwnedTest(){
		
		assertEquals(0, libTest.numberOfItemsOwned());
		
	}

}
