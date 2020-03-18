package uo.mp.lab03.dome.model.medialibrary;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import uo.mp.lab03.dome.model.Book;
import uo.mp.lab03.dome.model.Cd;
import uo.mp.lab03.dome.model.MediaLibrary;

public class BorrowTests {

	private MediaLibrary libTest;
	private Cd cd1;
	private Cd cd2;
	private Cd cd3;
	private Book bk1;
	private Book bk2;
	private Book bk3;

	
	@Before
	public void setUp() {
		libTest = new MediaLibrary();
		
		cd1 = new Cd("t1", "testArtist", 15, 62, 100);
		cd2 = new Cd("t2", "testArtist2", 17, 162, 89);
		cd3 = new Cd("t3", "testArtist3", 20, 12, 71);
		bk1 = new Book("testBook1", 14.50, "bookAuthor", "testAuthor", "999-1234567899");
		bk2 = new Book("testBook2", 18.50, "bookAuthor2", "testAuthor2", "321-3434567898");
		bk3 = new Book("testBook2", 8.30, "bookAuthor3", "testAuthor3", "611-2474583998");		

		
		libTest.add(cd1);
		libTest.add(cd2);
		libTest.add(bk1);
		libTest.add(bk2);
		
		bk1.setOwn(true);
		cd2.setOwn(true);
		bk3.setOwn(true);
		
		
	}
	
	
	/*
	 * GIVEN: not owned parameter from libTest passed to borrow method
	 * WHEN: calling a borrow method
	 * THEN: returns false
	 */
	@Test
	public void borrowNotOwnedTest() {

		assertFalse(libTest.borrowItem(bk2));
		assertFalse(libTest.borrowItem(cd1));
		assertFalse(bk2.isBorrowed());
		assertFalse(cd1.isBorrowed());

	}
	
	/*
	 * GIVEN: owned parameter from libTest passed to borrow method
	 * WHEN: calling a borrow method
	 * THEN: returns true
	 */
	@Test
	public void borrowOwnedTest() {

		assertTrue(libTest.borrowItem(bk1));
		assertTrue(libTest.borrowItem(cd2));
		assertTrue(bk1.isBorrowed());
		assertTrue(cd2.isBorrowed());
		
	}
	
	/*
	 * GIVEN: owned parameter out of libTest passed to borrow method
	 * WHEN: calling a borrow method
	 * THEN: returns false
	 */
	@Test
	public void borrowOutOffLibTest() {
				
		assertFalse(libTest.borrowItem(bk3));
		assertFalse(libTest.borrowItem(cd3));
		assertTrue(!bk3.isBorrowed());
		assertTrue(!cd3.isBorrowed());
		
	}
	
	/*
	 * GIVEN: owned parameter out of libTest passed to borrow method
	 * WHEN: calling a borrow method
	 * THEN: returns false
	 */
	@Test(expected = IllegalArgumentException.class)
	public void borrowNull() {
				
		libTest.borrowItem(null);
		
	}

}
