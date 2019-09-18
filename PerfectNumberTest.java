package imperative;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import imperative.PerfectNumber.STATE;
import imperative.PerfectNumberImproved.State;

public class PerfectNumberTest {

	@Test
	public void test6Perfect() {
		assertEquals(STATE.PERFECT, PerfectNumber.process(6));
	}

	@Test
	public void test8Deficient() {
		assertEquals(STATE.DEFICIENT, PerfectNumber.process(8));
	}

	@Test
	public void test20Abundant() {
		assertEquals(STATE.ABUNDANT, PerfectNumber.process(20));
	}

	@Test
	public void test16DeficientWithIntSqrt() {
		assertEquals(STATE.DEFICIENT, PerfectNumber.process(16));
	}

	@Test
	public void test1Deficient() {
		assertEquals(STATE.DEFICIENT, PerfectNumber.process(1));
	}

	@Test
	public void testDivisors1() {
		Object[] expected = new Integer[] { 1 };
		int n = 1;
		assertArrayEquals(expected, PerfectNumber.divisors(n).toArray());
	}

	@Test
	public void testDivisors6() {
		Object[] expected = new Integer[] { 1, 2, 3, 6 };
		int n = 6;
		assertArrayEquals(expected, PerfectNumber.divisors(n).toArray());
	}

	@Test
	public void testDivisors8() {
		Object[] expected = new Integer[] { 1, 2, 4, 8 };
		int n = 8;
		assertArrayEquals(expected, PerfectNumber.divisors(n).toArray());
	}
		
		@Test
		public void improvedTest6Perfect() {
			assertEquals(State.PERFECT, PerfectNumberImproved.process(6));
		}

		@Test
		public void improvedTest8Deficient() {
			assertEquals(State.DEFICIENT, PerfectNumberImproved.process(8));
		}

		@Test
		public void improvedTest20Abundant() {
			assertEquals(State.ABUNDANT, PerfectNumberImproved.process(20));
		}

		@Test
		public void improvedTest16DeficientWithIntSqrt() {
			assertEquals(State.DEFICIENT, PerfectNumberImproved.process(16));
		}

		@Test
		public void improvedTest1Deficient() {
			assertEquals(State.DEFICIENT, PerfectNumberImproved.process(1));
		}

		@Test
		public void improvedTestDivisors1() {
			Object[] expected = new Integer[] { 1 };
			int n = 1;
			assertArrayEquals(expected, PerfectNumberImproved.divisors(n).toArray());
		}

		@Test
		public void improvedTestDivisors6() {
			Object[] expected = new Integer[] { 1, 2, 3, 6 };
			int n = 6;
			assertArrayEquals(expected, PerfectNumberImproved.divisors(n).toArray());
		}

		@Test
		public void improvedTestDivisors8() {
			Object[] expected = new Integer[] { 1, 2, 4, 8 };
			int n = 8;
			assertArrayEquals(expected, PerfectNumberImproved.divisors(n).toArray());
	}
	
}
