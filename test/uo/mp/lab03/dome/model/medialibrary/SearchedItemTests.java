package uo.mp.lab03.dome.model.medialibrary;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import uo.mp.lab03.dome.facilities.Platform;
import uo.mp.lab03.dome.model.Cd;
import uo.mp.lab03.dome.model.Dvd;
import uo.mp.lab03.dome.model.MediaLibrary;
import uo.mp.lab03.dome.model.VideoGame;


public class SearchedItemTests {
	
	private MediaLibrary libTest;
	private Dvd d1;
	private Cd cd1;
	private VideoGame vg1;
	
	@Before
	public void setUp(){
		
		libTest = new MediaLibrary();
		
		d1 = new Dvd("testDVD", "testDirector", 120, 10.4);
		cd1 = new Cd("testCd", "testArtist", 15, 62, 33.55);
		vg1 = new VideoGame("testVideoGame", Platform.PLAYSTATION, 2, "testAuthor", 40.10);
		
		libTest.add(vg1);
		libTest.add(cd1);
		libTest.add(d1);
		
	}

	/**
	 * GIVEN: 	mediaLibrary with 3 items searchMethods for every item
	 * WHEN: 	searchItem(item) called
	 * THEN:	return item's index
	 */
	@Test
	public void fullListSearchItemTest() {
		
		assertEquals(1, libTest.searchItem(cd1));
		assertEquals(0, libTest.searchItem(vg1));
		assertEquals(2, libTest.searchItem(d1));
		
	}
	
	/**
	 * GIVEN: 	mediaLibrary with 3 items searchMethod for null param
	 * WHEN: 	searchItem(item) called
	 * THEN:	throws Illegal argument exception
	 */
	@Test(expected = IllegalArgumentException.class)
	public void nullParamListSearchItemTest() {
		
		libTest.searchItem(null);
		
	}

	/**
	 * GIVEN: 	mediaLibrary with 3 items searchMethod for item out of List
	 * WHEN: 	searchItem(item) called
	 * THEN:	-1 returned
	 */
	@Test
	public void invalidParamListSearchItemTest() {
		
		VideoGame vg2 = new VideoGame("testVideoGame2", Platform.XBOX, 3, "testAuthor2", 10.30);
		assertEquals(-1, libTest.searchItem(vg2));
		
	}
	
}
