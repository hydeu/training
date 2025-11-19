package Day05;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList08 {

	public static void main(String[] args) {
		
		ArrayList<String> word  = new ArrayList<>(Arrays.asList("apple","dog","banana","car","dragon","hi","coffee"));
		ArrayList<String> five = new ArrayList<>();
		
		for(String w : word) {
			if(w.length() >= 5) {
				five.add(w);
			}
		}
		
		System.out.println(five);

	}

}