package Day01;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("===================");
		System.out.println("    자  기  소  개   ");
		System.out.println("===================");
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		System.out.print("키를 입력하세요 : ");
		double height = sc.nextDouble();
		
		System.out.println("---------------------------");
		System.out.printf("안녕하세요 %-6s님!\n", name);
		System.out.printf("나이는 %3d 이시고!\n", age);
		System.out.printf("키는 %4.1f 이시네요!\n", height);
		System.out.println("---------------------------");
		
		
	}

}

