package Day03;

public class GuGuDan02 {

	public static void main(String[] args) {

		for (int dan = 2; dan <= 9; dan++) {
			
			for (int i = 1; i <= 9; i++){
				
				int result = dan * i;
				
				System.out.println( dan + " x " + i + " = " + result);
			}
		}
		
	}

}


//바깐 문 = 단                      < 큰개념
//안쪽 문 = 반복되는 요소 ( 1~9 )      < 작은개념