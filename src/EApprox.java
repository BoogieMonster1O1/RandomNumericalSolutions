import java.util.stream.IntStream;

public class EApprox {
	public static void main(String[] args) {
		double sum = IntStream.range(1, 10000).mapToDouble(i -> (Math.pow(-1, (i + 1) % 2)) / i).sum();
		System.out.println(Math.exp(sum));
	}
}
