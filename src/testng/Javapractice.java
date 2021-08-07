package testng;

public class Javapractice {

	public static void pyramid() {
		int i;
		int j;
		int k = 1;

		for (i = 0; i <= 4; i++) {
			for (j = 1; j <= 4 - i; j++) {
				System.out.print(k);
				k++;
			}
			System.out.println("\t");
		}

	}

	public static void revpyramid() {
		int i;
		int j;
		int k = 1;

		for (i = 0; i < 4; i++) {
			for (j = 1; j <= i + 1; j++) {
				System.out.print(k);
				//System.out.print(k*3);
				System.out.print("  ");
				k++;
			}
			//k = 1;
			System.out.println("\t");
		}
	}

	public static void tripyramid() {
		int i;
		int j;

		for (i = 0; i < 4; i++) {
			for (j = 1; j <= i + 1; j++) {
				System.out.print(j);
				System.out.print("  ");

			}

			System.out.println("\t");
			if (j == 5) {
				for (i = 1; i < 4; i++) {
					for (j = 1; j <= 4 - i; j++) {
						System.out.print(j);
						System.out.print("  ");
					}

					System.out.println("\t");
				}
			}
		}

	}

	public static void main(String[] args) {
		// Javapractice.pyramid();
		 Javapractice.revpyramid();
		// Javapractice.tripyramid();
	}

}
