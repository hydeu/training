package Day01;

import java.util.Scanner;

public class Ex03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("================================");
		System.out.println("       단순 계산기 (문법 복습 용)     ");
		System.out.println("================================");
		
		System.out.println("첫 번째 숫자를 입력하세요 : ");
		int a = sc.nextInt();
		
		System.out.println("두 번째 숫자를 입력하세요 : ");
		int b = sc.nextInt();
		
		int plus = a + b;
		int minus = a - b;
		int multi = a * b;
		double div = (double)a / b ;
		
		System.out.printf("결과 : +%d, -%d, *%d, /%.1f", plus, minus, multi, div);
		
		sc.close();
		
	}

}
