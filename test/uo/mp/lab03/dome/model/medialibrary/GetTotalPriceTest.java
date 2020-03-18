package uo.mp.lab03.dome.model.medialibrary;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import uo.mp.lab03.dome.facilities.Platform;
import uo.mp.lab03.dome.model.Book;
import uo.mp.lab03.dome.model.Cd;
import uo.mp.lab03.dome.model.Dvd;
import uo.mp.lab03.dome.model.MediaLibrary;
import uo.mp.lab03.dome.model.VideoGame;

public class GetTotalPriceTest {
	
	private MediaLibrary libTest;
	private MediaLibrary emptyLibTest;
	private Dvd d1;
	private Cd cd1;
	private VideoGame vg1;
	private Book bk1;

	@Before
	public void setUp() {
		libTest = new MediaLibrary();
		emptyLibTest = new MediaLibrary();
		
		d1 = new Dvd("testDVD", "testDirector", 120, 10.5);
		cd1 = new Cd("testCd", "testArtist", 15, 62, 100);
		vg1 = new VideoGame("testVideoGame", Platform.PLAYSTATION, 2, "testAuthor", 99.55);
		bk1 = new Book("testBook", 14.50, "bookAuthor", "testAuthor", "999-1234567899");
		
		libTest.add(vg1);
		libTest.add(cd1);
		libTest.add(d1);
		libTest.add(bk1);
	}

	/*
	 * GIVEN: empty library
	 * WHEN: calling a getTotalPrice
	 * THEN: total price equals 0
	 */
	@Test
	public void getTotalPriceTestEmpty() {
		assertEquals(0, emptyLibTest.getTotalPrice(), 0);
	}
	
	/*
	 * GIVEN: full library
	 * WHEN: calling a getTotalPrice
	 * THEN: total price equals 
	 */
	@Test
	public void getTotalPriceTestFull() {		
		assertEquals(10.5 + 102 + 99.55 * 0.1 + 99.55 + 14.50*0.04 + 14.50, 
					libTest.getTotalPrice(), 0.001);
	}

}
