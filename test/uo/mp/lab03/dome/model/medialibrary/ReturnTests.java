package uo.mp.lab03.dome.model.medialibrary;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import uo.mp.lab03.dome.model.Book;
import uo.mp.lab03.dome.model.Cd;
import uo.mp.lab03.dome.model.MediaLibrary;

public class ReturnTests {

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
			bk2.setOwn(true);
			cd1.setOwn(true);
			cd2.setOwn(true);
			
			libTest.borrowItem(bk1);
			libTest.borrowItem(cd1);
			
		}
		
		/*
		 * GIVEN: borrowed and owned parameter from libTest passed to return method
		 * WHEN: calling a return method
		 * THEN: returns true and is not borrowed
		 */
		@Test
		public void returnOwnedBorrowedTest() {
			
			assertTrue(libTest.returnItem(bk1));
			assertTrue(libTest.returnItem(cd1));
			assertFalse(bk1.isBorrowed() == true);
			assertFalse(cd1.isBorrowed() == true);

		}
		
		/*
		 * GIVEN: not borrowed but owned parameter from libTest passed to return method
		 * WHEN: calling a return method
		 * THEN: returns false
		 */
		@Test
		public void returnOwnedNotBorrowedTest() {

			assertFalse(libTest.returnItem(bk2));
			assertFalse(libTest.returnItem(cd2));
			
		}
		
		/*
		 * GIVEN: owned parameter out of libTest passed to return method
		 * WHEN: calling a return method
		 * THEN: returns false
		 */
		@Test
		public void returnOutOffLibTest() {
			
			assertFalse(libTest.returnItem(bk3));
			assertFalse(libTest.returnItem(cd3));
			
		}
		
		/*
		 * GIVEN: null passed to return method
		 * WHEN: calling a return method
		 * THEN: throws an exception
		 */
		@Test(expected = IllegalArgumentException.class)
		public void returnNullLibTest() {
			
			libTest.returnItem(null);
			
		}
}



