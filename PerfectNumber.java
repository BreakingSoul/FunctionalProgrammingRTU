import java.util.ArrayList;

public class PerfectNumber {

	//parbauda skaitla klasifikaciju
	static String detect(int n) {
		ArrayList<Integer> divisors= new ArrayList<>();
		divisors = divisorsList(n);
		
		int sum=0;
		for (int i:divisors)
			sum=sum+i;
		if (sum<n) {
			return "Number "+ n + " is deficient!";
		} else if (sum==n) {
		return "Number "+ n + " is perfect!";
		}	else 
			return "Number "+ n + " is abundant!";
	}
	
	//atrod skaitla dalitajus
	static ArrayList<Integer> divisorsList(int n) {
		ArrayList<Integer> divisors = new ArrayList<>();
		for (int divisor=1; divisor<=(n/2); divisor++) {
			if (n%divisor==0) 
				divisors.add(divisor);
		}
		return divisors;
	}
	
	public static void main(String[] args) {

		//parbauda pozitivu skaitli (piemeram 8) un izvada rezultatu
		String answer = detect(8);
		System.out.println(answer);
	}
}
