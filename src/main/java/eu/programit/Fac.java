package eu.programit;

public class Fac {

	public int fac(int n) throws IllegalArgumentException {

		if (n < 0 || n > 20) {
			throw new IllegalArgumentException();
		}

		if (n == 0) {
			return 1;
		}
		else {
			return n * fac(n - 1);
		}
	}
}
