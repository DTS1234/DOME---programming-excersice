package uo.mp.lab03.dome.model;

import uo.mp.lab03.dome.facilities.CheckParameters;
import uo.mp.lab03.dome.facilities.Platform;

public class VideoGame extends Item {
	
	private String author;
	private Platform platform;
	private int numOfPlayers;
	
	public VideoGame(String theTitle, Platform thePlatform, 
			int numOfPlayers, String author, double theBasePrice) {
		super(theTitle, theBasePrice);
		setAuthor(author);
		setPlatform(thePlatform);
		setNumOfPlayers(numOfPlayers);
	}

	public Platform getPlatform() {
		return platform;
	}

	public void setPlatform(Platform platform) {
		CheckParameters.check(platform);
		this.platform = platform;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		CheckParameters.check(author);
		this.author = author;
	}

	public int getNumOfPlayers() {
		return numOfPlayers;
	}
	
	public void setNumOfPlayers(int numOfPlayers) {
		CheckParameters.check(numOfPlayers);
		this.numOfPlayers = numOfPlayers;
	}
	
	@Override
	public String toString() {
		
		String result = "Video Game: " + getTitle() + 
				" (for " + getNumOfPlayers() + " players)\n"+
				"Author: " + getAuthor()+"\n"+
				"Platform: " + getPlatform()+"\n";
		
		if (getOwn()) {
			result += "You own it";
		} else {
			result += "You do not own it";
		}
		
		result += "\nComment: " + getComment();
		
		return result;
	}

	@Override
	protected String printResponsible() {
		return this.author;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof VideoGame))
			return false;
		VideoGame other = (VideoGame) obj;
		if (platform != other.platform)
			return false;
		return true;
	}	
	
	public double getFinalPrice() {		
		return (getBasePrice() * 0.1) + getBasePrice();
	}
	
}	

