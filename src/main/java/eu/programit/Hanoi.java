package eu.programit;

public class Hanoi {

	public static void main(String[] args) {
		hanoiHulp(10);
	}

	public static void hanoiHulp(int aantal) {
		hanoi(aantal, 1, 2, 3);
	}

	private static void hanoi(int aantal, int van, int via, int naar) {

		if (aantal == 0) {
			return;
		}
		else {
			hanoi(aantal - 1, van, naar, via);
			System.out.println("Move " + van + " naar " + naar);
			hanoi(aantal - 1, via, van, naar);
		}
	}

}
