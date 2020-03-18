package uo.mp.lab03.dome.model;

import uo.mp.lab03.dome.facilities.CheckParameters;

public class Dvd extends Item {
	private String director;
	private int playingTime;
	public Dvd(String theTitle, String theDirector, int time, double theBasePrice) {
		super(theTitle, theBasePrice);
		setDirector(theDirector);
		setPlayingTime(time);
	}

	public void setDirector(String director) {
		CheckParameters.check(director);
		this.director = director;
	}

	public String getDirector() {
		return this.director;
	}
	
	@Override
	public String toString() {
		String result = "DVD: " + getTitle() + " (" + getPlayingTime() + " mins)"
				+ "\n"+
		"Director: " + getDirector() + "\n";
		
		if (getOwn()) {
			result += "You own it";
		} else {
			result += "You do not own it";
		}
		
		result += "\nComment: " + getComment();
		
		return result;
	}
	
	protected String printResponsible() {
		return this.director;
	}

	public int getPlayingTime() {
		return playingTime;
	}

	public void setPlayingTime(int playingTime) {
		CheckParameters.check(playingTime);
		this.playingTime = playingTime;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof Dvd))
			return false;
		Dvd other = (Dvd) obj;
		if (director == null) {
			if (other.director != null)
				return false;
		} else if (!director.equals(other.director))
			return false;
		return true;
	}
	
	public double getFinalPrice() {	
		return getBasePrice();
	}
	
}
