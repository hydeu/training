package Day02;

import java.util.Scanner;

public class EvenOdd {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요 : ");
		int a = sc.nextInt();
		
		if ( a % 2 == 0) {
			System.out.println("짝수 입니다 ");
		} else {
			System.out.println("홀수 입니다 ");
		}
		
		sc.close();
		
	}

}
