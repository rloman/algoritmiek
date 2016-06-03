package eu.programit;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class PriemOntbinding {

	public static void main(String[] args) {
		System.out.println(new PriemOntbinding().po(44));
	}

	public String po(int n) {

		// using String list here since that is the only valid List type which
		// can be used using String.join(...);
		
		Map <String, Integer> counterMap = new TreeMap<>();
		List<String> factorList = po(2, n, new ArrayList<String>());
		
		String result = "";
		
		for(String element : factorList) {
			
			if(counterMap.get(element) == null ) {
				counterMap.put(element, 0);
			}
			counterMap.put(element, counterMap.get(element)+1);
		}
		
		boolean tail = false;
		for(Entry<String, Integer> element : counterMap.entrySet()) {
			if(tail) {
				result += "*";
			}
			if(element.getValue() == 1) {
				result += element.getKey();
			}
			else {
				result += element.getKey()+"^"+element.getValue();
			}
			
			tail = true;
		}

		return result;
	}

	private List<String> po(int lastFactor, int n, List<String> factors) {

		// simples case
		if (isPrime(n)) {
			factors.add(Integer.valueOf(n).toString());

			return factors;
		}
		// if n is divisible to lastFactor add it to the List of factors
		if (n % lastFactor == 0) {
			factors.add(Integer.valueOf(lastFactor).toString());
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
		BigInteger bi = new BigInteger("" + factor);
		boolean result = bi.isProbablePrime(100);

		return result;
	}
}

class CounterMap {
	void add(String factor) {
		
	}
}
