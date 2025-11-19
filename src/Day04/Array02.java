package Day04;

public class Array02 {

	public static void main(String[] args) {
		
		int[] nums = {10, 20, 30, 40, 50};
		
		//int max = 0;     //값을 0으로 지정해주는게 아니라, 인덱스 0번의 값으로 초기화를 해주어야한다.
		
		int max = nums[0]; //첫번째 값으로 초기화 해주는게 핵심
		
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

/* 왜 MAx를 NUMS[0]으로 초기화를 하는가? 
 * 0으로 두면 배열에 음수가 있는 경우 틀림
 * 반복문 처음에 nums[i]로 매번 덮어쓰면 비교가 안됨
 * 배열의 첫 번째 값은 "실존하는 유효한 값"이라 안정적임
 */

/*  <패턴구조>
	상태값 초기화
	for 반복:
		상태값 갱신
		조건 체크 후 break/continue
*/