package pattern;

public class Pattern14 {
	public static void main(String[] args) {
		int lines = 5;
		int starCount = 1;

		int mid = (lines + 1) / 2;

		for (int i = 1; i <= lines; i++) {
			for (int j = 1; j <= starCount; j++) {
				if (j == 1 || j == starCount) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
			if (i < mid) {
				starCount++;
			}else {
				starCount--;
			}
		}
	}
}
