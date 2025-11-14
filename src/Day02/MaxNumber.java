package Day02;

import java.util.Scanner;

public class MaxNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 수 입력 : ");
		int a = sc.nextInt();
		System.out.println("두번째 수 입력 : ");
		int b = sc.nextInt();
		System.out.println("세번째 수 입력 : ");
		int c = sc.nextInt();
		
		int max;
		
		if ( a> b && a > c) {
			
			max = a;
			System.out.println("짱큰 숫자는 a");
			
		} else if (b > a && b > c) {
			
			max = b;
			System.out.println("짱큰 숫자는 b");
			
		} else {
			
			System.out.println("짱큰 숫자는 c");
		}
		
		sc.close();
		
	}

}
