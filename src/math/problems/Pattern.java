package math.problems;

public class Pattern {

	public static void main(String[] args) {
		/* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
		 * 100,99,98,97,96,95,94,93,92,91,90, 88,86,84,82,80, 78,76,74,72,70, 67,64,61, 58,55,52, 49,46,43,40, 36,32............
		 *
		 *
		 */

        // 1 ...... 100,99,98,97,96,95,94,93,92,91,90
		for (int n = 1; n<=1; n=n+1) {

			for (int i = 100; i >= 90; i--) {
				System.out.print(i + ",");
			}
		}

		// 2 ..... 88,86,84,82,80,  78,76,74,72,70
		for(int n = 2; n<=2; n=n+2) {

			for (int j = 88; j >= 70; j = j - 2) {
				System.out.print(j + ",");
			}
		}

		// 3 ....... 67,64,61,  58,55,52,  49,46,43,40
		for(int n = 3; n<=3; n=n+3) {

			for (int l=67; l>=40; l=l-3){
			   System.out.print(l + ",");
		  }

		}

		// 4 ....... 36,32,  28,24,20,  16,12,  8,4,  0
		for(int n = 4; n<=4; n=n+4) {
			for (int k = 36; k >= 0; k = k - 4) {
				System.out.print(k + ",");
			}
		}
	}
}
