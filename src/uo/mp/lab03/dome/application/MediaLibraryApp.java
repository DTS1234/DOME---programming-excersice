package uo.mp.lab03.dome.application;

import java.io.PrintStream;

import uo.mp.lab03.dome.facilities.Platform;
import uo.mp.lab03.dome.model.Book;
import uo.mp.lab03.dome.model.Cd;
import uo.mp.lab03.dome.model.Dvd;
import uo.mp.lab03.dome.model.Item;
import uo.mp.lab03.dome.model.MediaLibrary;
import uo.mp.lab03.dome.model.VideoGame;

public class MediaLibraryApp {

	private static PrintStream out = new PrintStream(System.out);
	
	public static void main(String[] args) {
		
		MediaLibrary lib = new MediaLibrary();
		
		Item game1 = new VideoGame("Fifa20", Platform.XBOX, 2, "ELECTRONICS ARTS", 100.50);
		Item game2 = new VideoGame("DOOM", Platform.PLAYSTATION, 3, "KONAMI", 10.2);
		Item game3 = new VideoGame("DXBALL", Platform.NITENDO, 4, "ATARI", 1.2);
		
		Item cd1 = new Cd("Album1", "U2", 13, 169, 20.1);
		Item cd2 = new Cd("Album2", "DepecheMode", 11, 116, 9.3);
		Item cd3 = new Cd("Album3", "PearlJam", 15, 143, 88.4);
		
		Item dvd1 = new Dvd("Movie1", "Spielberg", 130, 55.25);
		Item dvd2 = new Dvd("Movie2", "Tarantino", 120, 40.70);
		Item dvd3 = new Dvd("Movie3", "Nolan", 145, 33.50);
		Item dvd4 = new Dvd("TST", "Nolan", 145, 33.50);
		
		Item book1 = new Book("Book1", 10.50, "Tolkien", "Helion", "978-5429812309");
		
		game1.setComment("new game !!!");
		book1.setComment("nice book");
		
		lib.add(dvd3);
		lib.add(dvd2);
		lib.add(dvd1);
		lib.add(cd3);
		lib.add(cd2);
		lib.add(cd1);
		lib.add(game1);
		lib.add(game2);
		lib.add(game3);
		lib.add(dvd4);
		lib.add(book1);
		
		game3.setOwn(true);
		dvd3.setOwn(true);
		cd3.setOwn(true);
		book1.setOwn(true);
		
		
		lib.listAvailableToBorrow(out);
		
		System.out.println();
		
		lib.listBorrowable(out);
		
	}

}
