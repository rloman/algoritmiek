package eu.programit;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import org.apache.log4j.Logger;

public class PriemOntbinding {

	private static final int PRETTYSURE = 10000;

	private static final Logger LOGGER = Logger.getLogger(PriemOntbinding.class);

	public String po(int n) {

		LOGGER.debug(String.format("Entering PriemOntbinding::po with [%d]", n));

		Map<Integer, Integer> counterMap = new TreeMap<>();
		List<Integer> factorList = po(2, n, new ArrayList<>());

		for (Integer element : factorList) {

			if (counterMap.get(element) == null) {
				// init the map for element
				counterMap.put(element, 0);
			}
			counterMap.put(element, counterMap.get(element) + 1);
		}

		List<String> result = new ArrayList<>();
		for (Entry<Integer, Integer> element : counterMap.entrySet()) {
			if (element.getValue() == 1) {
				result.add(element.getKey().toString());
			}
			else {
				result.add(element.getKey() + "^" + element.getValue());
			}
		}

		LOGGER.info(String.format("The result of the po of [%d] is [%s]", n, result));
		LOGGER.debug(String.format("Leaving PriemOntbinding::po with [%d]", n));

		return String.join("*", result);
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