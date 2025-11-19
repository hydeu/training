package Day05;

import java.util.ArrayList;

public class ArrayList02 {

	public static void main(String[] args) {
		
		ArrayList<Integer> even = new ArrayList<>();
		
		int[] nums = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		
		for(int n : nums) {
			if (n %2 == 0) {
				even.add(n);
			}
		}

		System.out.println(even);
	}

}
