package Day04;

public class Array04 {
	public static void main(String[] args) {

		int[] nums = {3, 7, 2, 9, 4, 1, 8};
		
		// 1단계: 짝수 개수 세기
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			
			if (nums[i] %2 == 0) {
				count++;
			}
			
		}
		
		// 2단계: 정확한 크기의 배열 생성
		int[] even = new int[count];
		
		//3단계: 짝수만 새로운 배열에 담기
		int index = 0;
		for (int i=0; i < nums.length; i++) {
			if (nums[i] %2 == 0) {
				even[index] = nums[i];
				index++;
			}
		}
		for (int n : even) {
			System.out.println(n);
		}	
	}
}