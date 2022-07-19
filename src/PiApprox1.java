public class PiApprox1 {
	public static void main(String[] args) {
		println(
				Math.sqrt(doubleFactorial(2 * 1000) / doubleFactorial(2 * 1000 - 1)) / 1000
		);
	}

	public static double doubleFactorial(int n) {
		int prod = 1;
		for (int i = 2 - (n % 2); i <= n; i += 2) {
			prod *= i;
		}
		return prod;
	}

	public static void println(Object s) {
		System.out.println(s);
	}
}
