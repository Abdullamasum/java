package loops;

public class Assignment_1 {

	public static void main(String[] args) {

		int a = 9;

		for (int i = 0; i < a; i++) {

			for (int j = 0; j < a; j++) {
				if (i == 0 || i == a - 1 || (i >= 0 && j == (a - 1) / 2))

				{
					System.out.print("*");
				} else {

					System.out.print(" ");
				}

			}
			System.out.print(" ");

			for (int j = 0; j < a; j++) {
				if (j == 0 || i == j || (i >= 0 && j == (a - 1)))

				{
					System.out.print("*");
				} else {

					System.out.print(" ");
				}
			}

			System.out.print(" ");

			for (int j = 0; j < a; j++) {
				if ((i < a - 1 && j == 0) || (i < a - 1 && j == a - 1) || (i == a - 1 && j > 0 && j < a - 1))

				{
					System.out.print("*");
				} else {

					System.out.print(" ");
				}
			}
			System.out.print(" ");

			for (int j = 0; j < a; j++) {
				if (j == 0 || (i - j == (a - 1) / 2) || (i > 0 && i < (a - 1) / 2 && j == (a - 1) / 2)
						|| (i == 0 && j < (a - 1) / 2) || (i == (a - 1) / 2 && j < (a - 1) / 2))

				{
					System.out.print("*");
				} else {

					System.out.print(" ");
				}
			}

			for (int j = 0; j < a; j++) {
				if ((i == 0 && j > 0 && j < a - 1) || (i == a - 1 && j > 0 && j < a - 1)
						|| i > 0 && j == a - 1 && i < a - 1 || (i > 0 && j == 0 && i < a - 1)
						|| (i > 0 && j == -1 && i < a - 1))

				{
					System.out.print("*");
				} else {

					System.out.print(" ");
				}
			}

			System.out.print(" ");

			for (int j = 0; j < a; j++) {
				if (j == 0 || i == j || (i >= 0 && j == (a - 1)))

				{
					System.out.print("*");
				} else {

					System.out.print(" ");
				}
			}

			System.out.println();
		}

		System.out.println();

		int n = 5;
		for (int i = 1; i < n; i++) {

			for (int j = 1; j < n; j++) {

				System.out.print(i);
			}

			System.out.println();
		}

		System.out.println();

		int x = 9;

		for (int i = 0; i < x; i++) {

			for (int j = 0; j < x; j++) {
				if (i == 0 || i + j <= (x - 1) / 2 || j - i >= (x - 1) / 2 || i == x - 1 || j == x - 1 || j == 0)

				{
					System.out.print("*");
				} else {

					System.out.print(" ");
				}

			}
			System.out.println();

		}
		System.out.println();

		for (int i = 0; i < x; i++) {

			for (int j = 0; j < x; j++) {
				if (i - j >= (x - 1) / 2 || j + i >= x - 1 + (x - 1) / 2

				)

				{
					System.out.print("*");
				} else {

					System.out.print(" ");
				}

			}
			System.out.println();

		}
		System.out.println();

		for (int i = 0; i < x; i++) {

			for (int j = 0; j < x; j++) {
				if (i == 0 || i + j <= (x - 1) / 2 || i == x - 1 || i - j >= (x - 1) / 2)

				{
					System.out.print("*");
				} else {

					System.out.print(" ");
				}

			}
			System.out.println();

		}
	}

}
