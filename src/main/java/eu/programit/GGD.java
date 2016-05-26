package eu.programit;

public class GGD {

	public static void main(String[] args) {

		GGD math = new GGD();

		System.out.println(math.ggd(6, 3));

		System.out.println(math.ggd(18, 9));

		System.out.println(math.ggd(9, 2));

		System.out.println(math.ggd(7, 21));

		System.out.println(math.ggd(8, 22));

		System.out.println(22 % 8);
		System.out.println(8 % 22);

	}

	public int ggd(int a, int b) {

		/*
		if (a < b) {
			return ggd(b, a);
		}
		*/

		if (b == 0) {
			return a;
		}
		else {
			return ggd(b, a % b);
		}
	}
}
