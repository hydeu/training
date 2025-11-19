package Day05;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList04 {

	public static void main(String[] args) {
	
		ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(3,1,7,4,9));
		int sum = 0;
		
		for(int n : nums) { //nums배열 안에 있는 값들 n에다가 넣어서 
			
			sum += n; // sum에다가 계속 더한다라는 문법인데 오류나네...
			
		}
		
		System.out.println(sum);

	}

}
