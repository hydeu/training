package Day04;

public class Array03 {

	public static void main(String[] args) {
		
		String[] color = {"red", "orange", "yellow", "green", "blue", "navy", "purple"};

			String rainbow = ""; //배열의 크기를 지정을 해줘야 하는건지, 아니면 지금 선언한게 무한대의 배열크기인건지 모르겠어.
			
			for(int i=0; i<color.length; i++) {
			
				rainbow += color[i]+" "; // 만들어놓은 rainbow배열에다가 color배열 값들을 집어넣는 문법을 구현하고 싶은데 잘 모르겠어.
				
			}
		
			System.out.println(rainbow);
	}

}
