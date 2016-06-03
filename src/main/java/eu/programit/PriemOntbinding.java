package eu.programit;

import java.math.BigInteger;

public class PriemOntbinding {

	public static void main(String[] args) {
		new PriemOntbinding().po(8);
	}

	public void po(int n) {

		po(2, n);
	}

	private void po(int lastFactor, int n) {

		if (n % lastFactor == 0) {
			System.out.println(lastFactor);
			po(lastFactor, n / lastFactor);
		}
		else {
			if (lastFactor < n) {
				po(++lastFactor, n);
			}
		}
	}

	private boolean isPrime(int factor) {
		BigInteger bi = new BigInteger("" + factor);
		boolean result = bi.isProbablePrime(100);

		return result;
	}
}
