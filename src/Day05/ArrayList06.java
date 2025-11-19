package Day05;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList06 {

	public static void main(String[] args) {
		
		ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(12,5,8,20,3,15));
		
		int min = nums.get(0);
		
		for(int c : nums) {
			//if(min < c) {  //min보다 더 큰 값 c를 발견하면 min을 c로 바꿔라
			if(min > c) {
				min = c;
			}
		}
		
		System.out.println(min);
	}

}


// 최댓값 패턴
// if (max < 값)
//    max = 값;
// 최솟값 패턴
// if (min > 값)
//    min = 값;