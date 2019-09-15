package imperative;

import java.util.HashSet;
import java.util.Set;

public class PerfectNumber {

	public enum STATE {
		DEFICIENT, PERFECT, ABUNDANT;
	}

	static void detect(int n) {
		switch (process(n)) {
		case DEFICIENT:
			System.out.println("Number " + n + " is deficient!");
			break;

		case PERFECT:
			System.out.println("Number " + n + " is perfect!");
			break;

		case ABUNDANT:
			System.out.println("Number " + n + " is abundant!");
			break;
		}
	}

	public static STATE process(int n) {
		Set<Integer> divisors = divisors(n);

		int sum = 0;
		for (int i : divisors)
			sum = sum + i;
		if (sum < n * 2) {
			return STATE.DEFICIENT;
		} else if (sum == n * 2) {
			return STATE.PERFECT;
		} else
			return STATE.ABUNDANT;
	}

	public static Set<Integer> divisors(int n) {
		Set<Integer> divisors = new HashSet<Integer>();
		for (int divisor = 1; divisor <= n; divisor++) {
			if (n % divisor == 0) {
				divisors.add(divisor);
			}
		}
		return divisors;
	}

	public static void main(String[] args) {
		detect(1);
	}
}
