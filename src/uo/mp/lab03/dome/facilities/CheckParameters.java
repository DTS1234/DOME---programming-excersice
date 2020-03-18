package uo.mp.lab03.dome.facilities;

public class CheckParameters {

	public static void checkPrice(double theBasePrice) {
		if (theBasePrice > 100000 || theBasePrice < 0) {
			throw new IllegalArgumentException("Price cannot be greater than 100.000 nor negative !!!");
		}
	}

	public static void check(String arg) {
		if (arg == null || arg.trim().isEmpty()) {
			throw new IllegalArgumentException("Argument cannot be null or empty !!!");
		}
	}

	public static void check(int numArg) {
		if (numArg <= 0) {
			throw new IllegalArgumentException("Argument must be greater than 0 !!!");
		}
	}

	public static void check(Object item) {
		if (item == null) {
			throw new IllegalArgumentException("Item cannot be null !!!");
		}
	}

	public static void check(Platform platform) {
		if (platform == null) {
			throw new IllegalArgumentException("Platform cannot be null !!!");
		}
	}

	public static void checkIsbn(String arg) {
		if (arg.length() != 14 || arg == null || arg.charAt(3) != '-') {
			throw new IllegalArgumentException("Wrong format of ISBN !");
		} else {
			for (int i = 0; i < arg.length(); i++) {
				if (i != 3) {
					if ((int) arg.charAt(i) < 48 || (int) arg.charAt(i) > 57) {
						throw new IllegalArgumentException("Wrong format of ISBN !");
					}
				}
			}
		}
	}

	public static void checkIndex(int index, int size) {

		if (index < 0 || index > size) {
			throw new IllegalArgumentException("index cannot negative or out of bounds !!!");
		}

	}

}
