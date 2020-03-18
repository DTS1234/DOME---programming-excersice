package uo.mp.lab03.dome.model;

import uo.mp.lab03.dome.facilities.CheckParameters;

public class Book extends Item implements Borrowable {
	
	private String author;
	private String publisher;
	private String isbn;
	private boolean borrowed;
	
	public Book(String theTitle, double theBasePrice, String theAuthor, String thePublisher, String theIsbn) {
		super(theTitle, theBasePrice);
		
		CheckParameters.check(thePublisher);
		CheckParameters.check(theAuthor);
		CheckParameters.checkIsbn(theIsbn);

		this.author = theAuthor; 
		this.publisher = thePublisher;
		this.isbn = theIsbn;
		this.setBorrowed(false);
	}

	@Override
	protected String printResponsible() {
		return author;
	}

	@Override
	public double getFinalPrice() {
		return (getBasePrice()*0.04) + getBasePrice();
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public void borrowItem() {
		setBorrowed(true);
	}

	@Override
	public void returnItem() {
		setBorrowed(false);
	}
	
	@Override
	public boolean isBorrowed() {
		return borrowed;
	}

	private void setBorrowed(boolean borrowed) {
		this.borrowed = borrowed;
	}

	@Override
	public String toString() {
		
		String result = "BOOK: " + getTitle() + " (ISBN: " + getIsbn() + ")\n" + "Author: " + getAuthor() + "\n"
				+ "Publisher: " + getPublisher() + "\n"
				+ "Borrowed: " + isBorrowed() + "\n";

		if (getOwn()) {
			result += "You own it";
		} else {
			result += "You do not own it";
		}

		result += "\nComment: " + getComment();

		return result;
		
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof Book))
			return false;
		Book other = (Book) obj;
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equals(other.isbn))
			return false;
		return true;
	}
	
	
	
	
}
