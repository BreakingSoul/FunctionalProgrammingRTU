package imperative;

public class Solution {

	static boolean palindrome(String s) {
		s=s.toLowerCase();
		int increment = 0;
		int decrement = s.length()-1;
		return check(s,increment,decrement);
	}
	
	static boolean check(String s, int a, int b) {
		if (s.length()==2) 
			if(s.charAt(0)==s.charAt(1)) 
				return true;
			else 
				return false;
		
		if (((s.length()%2 == 0 && b-a == 1)||(s.length()%2 == 1 && b-a == 0))) 
			if(s.charAt(a)==s.charAt(b)) 
				return true;
			else
				return false;
		if (s.charAt(a)==s.charAt(b)) {
			return check(s,++a,--b);
			}
		else return false;
		}
	
	
	public static void main(String[] args) {
		try {
		String s = "ABBA";
		System.out.println("The string " + s + " is a palindrome: " + palindrome(s));
		}		
		catch (IndexOutOfBoundsException e) {
			System.err.println("String s shouldn't be empty");
			e.printStackTrace();
		}
		catch (NullPointerException e) {
			System.err.println("String s shouldn't be null");
		}
	}

}
