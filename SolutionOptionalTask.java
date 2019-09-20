package imperative;

import java.util.ArrayList;
import java.util.List;

public class SolutionOptionalTask {
	
	static int powerSum(int number, int power) {
		List <Integer> candidates = new ArrayList<>();
		checkable(number, 1, power, candidates);
		return check(number, candidates, 0);
	}
	
	static void checkable(int number, int start, int power, List<Integer> list){
		if (Math.pow((int) start, (int) power) <= number) {
			list.add((int) Math.pow((int) start, (int) power));
			checkable(number, ++start, power, list);
		}
		else return;
	}
	
	static int check(int number, List<Integer> sumMakers, int iterator) {
		int left;
		if (iterator!=sumMakers.size())
		left = number-sumMakers.get(iterator);
		else return 0;
		
		if (left == 0)
			return 1;
		if (left < 0)
			return 0;
		
		return check(left, sumMakers, iterator+1) + check(number, sumMakers, iterator+1);
	}
	
	public static void main(String[] args) {
		
		int a = powerSum(100, 3);
		System.out.println(a);
	}

}
