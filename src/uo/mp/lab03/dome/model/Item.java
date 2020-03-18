package uo.mp.lab03.dome.model;

import uo.mp.lab03.dome.facilities.CheckParameters;

public abstract class Item {

	private String title;
	private boolean gotIt = false;
	private String comment;
	private double basePrice;
	
	public Item(String theTitle, double theBasePrice) {
		setBasePrice(theBasePrice);
		setTitle(theTitle);
		setOwn(false);
		setComment("No comment");
	}

	public String getComment() {
		return comment;
	}

	public void setOwn(boolean gotIt) {
		this.gotIt = gotIt;
	}

	public void setTitle(String title) {
		CheckParameters.check(title);
		this.title = title;
	}

	public void setComment(String comment) {
		CheckParameters.check(comment);
		this.comment = comment;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	public boolean getOwn() {
		return gotIt;
	}
		
	public String getTitle() {
		return this.title;
	}
	
	protected abstract String printResponsible();

	public double getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(double basePrice) {
		CheckParameters.checkPrice(basePrice);
		this.basePrice = basePrice;
	}
	
	public abstract double getFinalPrice();
	
	public String generateCode() {
		
		if(this.getTitle().length() < 3) {
			return this.getTitle();
		}
		
		return this.getTitle().substring(0, 3);
		
	}
	
}