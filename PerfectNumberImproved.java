package imperative;
import java.util.stream.IntStream;

public class PerfectNumberImproved {

	public enum State {
		DEFICIENT, PERFECT, ABUNDANT;
	}

	public static void process(Integer n) {
		int sum=IntStream.rangeClosed(1,n/2).filter(x -> n%x==0).sum();
		State answer = sum<=n ? (sum<n ? State.DEFICIENT : State.PERFECT) : State.ABUNDANT;
		System.out.println("Number " + n + " is " + answer);
	}

	public static void main(String[] args) {
		process(5);
	}
}
