package Day01;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("==================");
		System.out.println("    사용자정보 입력   ");
		System.out.println("==================");
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		System.out.println("-------------------");
		System.out.printf("안녕하세요 %-6s님!\n", name);
		System.out.printf("나이는 %3d살 이시네요!\n", age);
		System.out.println("-------------------");
		
		sc.close();
		
	}

}
