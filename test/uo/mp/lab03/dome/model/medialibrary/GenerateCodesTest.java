/**
 * 
 */
package uo.mp.lab03.dome.model.medialibrary;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import uo.mp.lab03.dome.facilities.Platform;
import uo.mp.lab03.dome.model.Cd;
import uo.mp.lab03.dome.model.Dvd;
import uo.mp.lab03.dome.model.MediaLibrary;
import uo.mp.lab03.dome.model.VideoGame;


public class GenerateCodesTest {

	private MediaLibrary libTest;
	private MediaLibrary emptyLibTest;
	private Dvd d1;
	private Cd cd1;
	private VideoGame vg1;

	@Before
	public void setUp() {
		libTest = new MediaLibrary();
		emptyLibTest = new MediaLibrary();
		
		d1 = new Dvd("testDVD", "testDirector", 120, 10.5);
		cd1 = new Cd("t1", "testArtist", 15, 62, 100);
		vg1 = new VideoGame("testVideoGame", Platform.PLAYSTATION, 2, "testAuthor", 99.55);
		
		libTest.add(vg1);
		libTest.add(cd1);
		libTest.add(d1);
	}
	
	/*
	 * GIVEN: full library
	 * WHEN: calling a generateCodes
	 * THEN: expected string is the same as string's method 
	 */
	@Test
	public void generateCodesTestFull() {

		String expected = "tes0-t11-tes2";
		String result = libTest.generateCodes();
		
		assertEquals(expected, result);
		
	}
	
	/*
	 * GIVEN: empty library
	 * WHEN: calling a generateCodes
	 * THEN: empty string return by the method
	 */
	@Test
	public void generateCodesTestEmpty() {

		String expected = "";
		String result = emptyLibTest.generateCodes();
		
		assertEquals(expected, result);
		
	}
	
}
