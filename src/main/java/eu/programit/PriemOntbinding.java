package eu.programit;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class PriemOntbinding {
	
	public static void main(String[] args) {
		System.out.println(new PriemOntbinding().po(44));
	}

	public String po(int n) {
		
		List<String> factorList = po(2, n, new ArrayList<String>());
		
		return String.join(", ", factorList);
	}

	private List<String> po(int lastFactor, int n, List<String> factors) {
		
		if (n % lastFactor == 0) {
			factors.add(Integer.valueOf(lastFactor).toString());
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
