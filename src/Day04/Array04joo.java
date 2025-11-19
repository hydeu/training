package Day04;

public class Array04joo {

	public static void main(String[] args) {
		
		int[] nums = {3, 7, 2, 9, 4, 1, 8}; 
		int count = 0; //nums와 같은 크기의 배열 count
		int[] even = {nums.length}; 
		
		for(int i=1; i<nums.length; i++) { //nums의 배열크기 만큼 반복하기 위한 의도의 문법. 
			if(nums[i] %2 == 0) { //nums의 배열 요소값들을 짝수로 비교하고 몇개인지 세고 싶은 의도의 문법. 
				count = nums[i]; //근데 이거는 짝수 숫자를 세는게 아니라 짝수를 count변수에 집어넣는건데... 숫자를 센 값을 넣고싶은데 잘안되네. 
				
			} 
			
			// even = count; //count의 요소값을 even배열에다가 넣고싶은 의도의 문법.
			
		}
			
	}
		

}

