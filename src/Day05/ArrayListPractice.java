package Day05;

import java.util.ArrayList;

public class ArrayListPractice {

	public static void main(String[] args) {
		
		ArrayList<Integer> even = new ArrayList<>();
		
		int[] nums = {3, 7, 2, 9, 4, 1, 8};
		
		for (int n : nums) {
			if ( n % 2 == 0) {
				even.add(n);
			}
		}

		System.out.println(even);
	}

}
