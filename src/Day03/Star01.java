package Day03;

public class Star01 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 4; i++) {

			for (int j = 1; j <=5; j++) {
				
				System.out.print("*");
			}
			
			System.out.println(); //한줄 끝나면 줄바꿔주는 코드
			
		}

	}

}

//바깥 for문 = "줄의 개수"
//안쪽 for문 = "한 줄 안에서 출력할 개수"