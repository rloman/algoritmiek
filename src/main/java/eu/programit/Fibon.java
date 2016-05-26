package eu.programit;

public class Fibon {
	
	public static void main(String[] args) {
		
		
		Fibon f = new Fibon();
		System.out.println(f.fibon(5));
		System.out.println(f.fibon(8));
		System.out.println(f.fibon(6));
		System.out.println(f.fibon(100));
	}
	
	public int fibon(int n) {
		if(n == 1 || n == 2) {
			return 1;
		}
		else {
			return fibon(n-1)+fibon(n-2);
		}
	}
}
