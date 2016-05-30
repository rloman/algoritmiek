package eu.programit;

public class HanoiGejat {

	public static void main(String args[]) {
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
			System.out.println(
					(new StringBuilder()).append("Move ").append(van).append(" naar ").append(naar).toString());
			hanoi(aantal - 1, via, van, naar);
			return;
		}
	}
}
