package eu.programit;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class PriemOntbinding {
	
	public static void main(String[] args) {
		System.out.println(new PriemOntbinding().po(44));
	}

	public String po(int n) {
		
		List<Integer> factorList = po(2, n, new ArrayList<Integer>());
		
		return String.join(", ", factorList.toArray());
	}

	private List<Integer> po(int lastFactor, int n, List<Integer> factors) {

		if (n % lastFactor == 0) {
			factors.add(lastFactor);
			po(lastFactor, n / lastFactor, factors);
		}
		else {
			if (lastFactor < n) {
				po(++lastFactor, n, factors);
			}
		}
		
		return factors;
	}

	private boolean isPrime(int factor) {
		BigInteger bi = new BigInteger("" + factor);
		boolean result = bi.isProbablePrime(100);

		return result;
	}
}
