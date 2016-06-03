package eu.programit;

public class Fibon {
	
	public int fibon(int n) {
		if(n == 1 || n == 2) {
			return 1;
		}
		else {
			return fibon(n-1)+fibon(n-2);
		}
	}
}
