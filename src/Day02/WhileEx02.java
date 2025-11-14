package Day02;

public class WhileEx02 {

	public static void main(String[] args) {
		
		int even = 1;
		
		while ( even < 31) {
			
			if( even %2 == 0) {
				
				System.out.println(even);
			}
			
			even++;
			
		}

	}

}
