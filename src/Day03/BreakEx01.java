package Day03;

public class BreakEx01 {

	public static void main(String[] args) {
		
		
		int sum = 0;
		
		for(int i = 1; i<=30; i++) {
			
			sum += i;
			
			if(sum > 50) {
				break;
			}
		
		}
		
		System.out.println(sum);

	}

}
