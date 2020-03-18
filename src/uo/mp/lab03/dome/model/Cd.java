package uo.mp.lab03.dome.model;

import uo.mp.lab03.dome.facilities.CheckParameters;

public class Cd extends Item implements Borrowable {
	private String artist;
	private int numberOfTracks;
	private int playingTime;
	private boolean borrowed;
	
	public Cd(String theTitle, String theArtist, int tracks, int time, double theBasePrice) {
		super(theTitle, theBasePrice);
		setArtist(theArtist);
		setNumberOfTracks(tracks);
		setPlayingTime(time);
	}

	public void setArtist(String artist) {
		CheckParameters.check(artist);
		this.artist = artist;
	}

	public void setNumberOfTracks(int numberOfTracks) {
		CheckParameters.check(numberOfTracks);
		this.numberOfTracks = numberOfTracks;
	}

	public String getArtist() {
		return this.artist;
	}

	public int getNumberOfTracks() {
		return this.numberOfTracks;
	}

	protected String printResponsible() {
		return this.artist;
	}

	@Override
	public String toString() {

		String result = "CD: " + getTitle() + " (" + getPlayingTime() + " mins)\n" + "Artist: " + getArtist() + "\n"
				+ "Tracks: " + getNumberOfTracks() + "\n";

		if (getOwn()) {
			result += "You own it";
		} else {
			result += "You do not own it";
		}

		result += "\nComment: " + getComment();

		return result;
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
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cd other = (Cd) obj;
		if (artist == null) {
			if (other.artist != null)
				return false;
		} else if (!this.getTitle().equals(other.getTitle()))
			return false;
		return true;
	}
	
	public double getFinalPrice() {
		return getBasePrice() + 2;
	}
	
	@Override
	public void borrowItem() {
		setBorrowed(true);
	}

	@Override
	public void returnItem() {
		setBorrowed(false);
	}

	public boolean isBorrowed() {	
		return borrowed;
	}

	private void setBorrowed(boolean borrowed) {
		this.borrowed = borrowed;
	}

	
}