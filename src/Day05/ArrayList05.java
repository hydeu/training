package Day05;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList05 {

	public static void main(String[] args) {
		
		ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(3,1,7,4,9));

		int max = nums.get(0); // 첫번째 요소로 초기화
		
		for(int n : nums) {
			if( n > max ) {
				max = n;
			}
		}
		
		System.out.println(max);
	}

}


//최댓값을 구하는 올바른 패턴
// 1. 처음 요소로 max 초기화
// 2. 반복문 돌면서 현재 요소가 max보다 크면 max 업데이트
// max = nums.get(0) > 리스트의 첫 요소로 최댓값 초기화, 비교 기준 하나를 만들어 주는 것
// if(n > max) > 현재 요소(n)가 기존 최대(max)보다 더 크면 교체, 리스트 끝까지 돌면 자연스럽게 최댓값만 남음