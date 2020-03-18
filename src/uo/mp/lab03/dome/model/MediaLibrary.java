package uo.mp.lab03.dome.model;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import uo.mp.lab03.dome.facilities.CheckParameters;

public class MediaLibrary {

	private List<Item> items;
	private List<Borrowable> borrowable;

	public MediaLibrary() {
		items = new ArrayList<Item>();
		borrowable = new ArrayList<Borrowable>();
	}

	public void add(Item newItem) {
		CheckParameters.check(newItem);
		items.add(newItem);

		if (newItem instanceof Borrowable) {
			borrowable.add((Borrowable) newItem);
		}

	}

	public int numberOfItemsOwned() {

		int count = 0;

		for (Item i : items) {
			if (i.getOwn()) {
				count++;
			}
		}

		return count;
	}

	public void list(PrintStream out) {
		for (Item i : items) {
			out.println(items.indexOf(i) + 1 + "." + i + "\n");
		}
	}

	public int searchItem(Object item) {
		CheckParameters.check(item);
		for (Object i : items) {
			if (i.equals(item)) {
				return items.indexOf(i);
			}
		}
		return -1;
	}

	public String printResponsibles() {

		String result = "";

		for (Item item : items) {

			if (items.indexOf(item) != items.size()) {
				result += item.printResponsible() + ", ";
			} else {
				result += item.printResponsible() + ".";
			}
		}

		if (result.isEmpty()) {
			return null;
		}

		return result;

	}

	public double getTotalPrice() {

		double sum = 0;

		for (Item i : items) {
			sum += i.getFinalPrice();
		}

		return sum;

	}

	public String generateCodes() {

		String result = "";

		for (Item i : items) {

			if (items.indexOf(i) != items.size() - 1) {
				result += i.generateCode() + items.indexOf(i) + "-";
			} else {
				result += i.generateCode() + items.indexOf(i);
			}

		}

		return result;

	}

	public void listBorrowable(PrintStream out) {

		System.out.println("Borrowable items: \n");

		for (Borrowable borrowableItem : borrowable) {
			out.println(borrowableItem + "\n");
		}

	}

	public void listAvailableToBorrow(PrintStream out) {
		
		System.out.println("Available to borrow items: \n");

		for (Borrowable borrowableItem : borrowable) {

			if (!(borrowableItem.isBorrowed()) && ((Item) borrowableItem).getOwn())
				out.println(borrowableItem + "\n");

		}

	}

	public boolean borrowItem(Borrowable item) {

		CheckParameters.check(item);
		
		if(!borrowable.contains(item) || !items.contains((Item)item) 
				|| (!((Item) item).getOwn()) || item.isBorrowed()) {
			return false;
		}
		
		item.borrowItem();
		return true;

	}

	public boolean returnItem(Borrowable item) {

		CheckParameters.check(item);
		
		if(!borrowable.contains(item) || !((Item)item).getOwn() || !item.isBorrowed()) {
			return false;
		}
		
		item.returnItem();
		return true;
		
	}
}
