package Day05;

import java.util.ArrayList;

public class ArrayList03 {
	
	public static void main(String[] args) {
		
		ArrayList<String> color = new ArrayList<>();
		
		color.add("red");
		color.add("green");
		color.add("blue");
		color.remove(1);
		System.out.println(color);
		
	}
}