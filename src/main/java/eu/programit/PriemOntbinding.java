package eu.programit;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class PriemOntbinding {

	private static final int PRETTYSURE = 10000;

	public String po(int n) {
		
		String result = "";

		Map<Integer, Integer> counterMap = new TreeMap<>();
		List<Integer> factorList = po(2, n, new ArrayList<>());

		for (Integer element : factorList) {

			if (counterMap.get(element) == null) {
				// init the map for element
				counterMap.put(element, 0);
			}
			counterMap.put(element, counterMap.get(element) + 1);
		}

		boolean tail = false;
		for (Entry<Integer, Integer> element : counterMap.entrySet()) {
			if (tail) {
				result += "*";
			}
			if (element.getValue() == 1) {
				result += element.getKey();
			}
			else {
				result += element.getKey() + "^" + element.getValue();
			}

			tail = true;
		}

		return result;
	}

	private List<Integer> po(int lastFactor, int n, List<Integer> factors) {

		// simples case
		if (isPrime(n)) {
			factors.add(n);

			return factors;
		}
		// if n is divisible to lastFactor add it to the List of factors
		if (n % lastFactor == 0) {
			factors.add(lastFactor);
			po(lastFactor, n / lastFactor, factors);
		}
		// if not; increment the lastFactor by 1 and retry
		else {
			if (lastFactor < n) {
				po(++lastFactor, n, factors);
			}
		}

		return factors;
	}

	private boolean isPrime(int factor) {
		BigInteger bi = new BigInteger(Integer.valueOf(factor).toString());
		boolean result = bi.isProbablePrime(PRETTYSURE);

		return result;
	}
}