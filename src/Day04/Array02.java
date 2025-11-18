package Day04;

public class Array02 {

	public static void main(String[] args) {
		
		int[] nums = {10, 20, 30, 40, 50};
		
		//int max = 0;     //값을 0으로 지정해주는게 아니라, 인덱스 0번의 값으로 초기화를 해주어야한다.
		
		int max = nums[0];
		
		// for(int i=0; i<nums.length; i++) {  int i가 0이아니라 1번부터 비교하면됨
		
		for(int i=1; i < nums.length; i++) {
			
			// max = nums[i]; 이것도 의미 없음
			//if (max < nums[i]) {	
				//break;
			
			if (nums[i] > max) {
				max = nums[i];
			}
		}
		System.out.println(max);
	}

}


//최댓값 찾는 전통적인 알고리즘 패턴
//1. max를 배열의 첫 번째 값으로 초기화
//2. 반복문에서 max보다 큰 값이면 갱신


//인덱스(식별가능한 .. 그 식별가능) 이걸로 값을 지정해줘서 비교해줘야함. 제발 !! 깨우쳐