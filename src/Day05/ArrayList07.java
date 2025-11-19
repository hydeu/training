package Day05;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList07 {

	public static void main(String[] args) {
		
		ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(5,8,13,6,2,11,4));		
		ArrayList<Integer> evenList = new ArrayList<>();
		
		for(int n : nums) {
			if(n %2 == 0) {
				evenList.add(n);
			}
		}
		
		System.out.println(evenList);

	}

}
