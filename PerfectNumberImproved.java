package imperative;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PerfectNumberImproved {

	public enum State {
		DEFICIENT, PERFECT, ABUNDANT;
	}
	
	public static Set<Integer> divisors(int n) {
		Set<Integer> divisors = IntStream.rangeClosed(1,(int)Math.sqrt(n))
				.filter(x -> n%x==0)
				.boxed()
				.collect(Collectors.toSet());
		Set<Integer> afterSqrt = divisors.stream()
				.map(x -> n/x)
				.collect(Collectors.toSet());
		divisors.addAll(afterSqrt);
		return divisors;
	}

	public static State process(int n) {		
		int sum = divisors(n).stream().mapToInt(i -> i.intValue()).sum()/2;
		return sum<=n ? (sum<n ? State.DEFICIENT : State.PERFECT) : State.ABUNDANT;
	}

	static void detect(int n) {
		System.out.println("Number " + n + " is " + process(n));
	}
	
	public static void main(String[] args) {
		detect(1);
	}
}
