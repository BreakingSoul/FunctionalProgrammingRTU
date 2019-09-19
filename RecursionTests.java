package imperative;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RecursionTests {

	@Test
	public void testPolindromeAbcbaTrue() {
		assertEquals(true, Solution.palindrome("abcba"));
	}

	@Test
	public void testPolindromeArgentinamanitnegraTrue() {
		assertEquals(true, Solution.palindrome("argentinamanitnegra"));
	}
	
	@Test
	public void testPolindromeSapalsaritadedatiraslapasTrue() {
		assertEquals(true, Solution.palindrome("Sapalsarītadēdatīraslapas"));
	}
	
	@Test
	public void testPolindromeAbbaTrue() {
		assertEquals(true, Solution.palindrome("Abba"));
	}
	
	@Test
	public void testPolindrome1221True() {
		assertEquals(true, Solution.palindrome("1221"));
	}
	
	@Test
	public void testPolindromeAbccaFalse() {
		assertEquals(false, Solution.palindrome("abcca"));
	}
	
	@Test
	public void testPolindromeStirnaFalse() {
		assertEquals(false, Solution.palindrome("stirna"));
	}
	
	@Test
	public void testPolindromeAb1cdFalse() {
		assertEquals(false, Solution.palindrome("ab1cd"));
	}
	
	@Test
	public void testPolindrome123False() {
		assertEquals(false, Solution.palindrome("123"));
	}
}