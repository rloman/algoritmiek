package eu.programit;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class PriemOntbinding {
	
	private List<Integer> result = new ArrayList<>();

	public static void main(String[] args) {
		System.out.println(new PriemOntbinding().po(144));
	}

	public String po(int n) {

		return po(2, n);
	}

	private String po(int lastFactor, int n) {

		if (n % lastFactor == 0) {
			this.result.add(lastFactor);
			po(lastFactor, n / lastFactor);
		}
		else {
			if (lastFactor < n) {
				po(++lastFactor, n);
			}
		}
		
		return this.result.toString();
	}

	private boolean isPrime(int factor) {
		BigInteger bi = new BigInteger("" + factor);
		boolean result = bi.isProbablePrime(100);

		return result;
	}
}
