package CodingTest;
			
import java.util.*;
			
public class Main {
			
    public static void main(String[] args) {
    		
    		Scanner sc = new Scanner(System.in);
    		
    		int N = sc.nextInt();
    		int S = sc.nextInt();
    		int M = sc.nextInt();
    		int L = sc.nextInt();
    		int XL = sc.nextInt();
    		int XXL = sc.nextInt();
    		int XXXL = sc.nextInt();
    		
    		int[] arr = {S,M,L,XL,XXL,XXXL};
    		Arrays.sort(arr);
    		
    		int T = (N / arr[5]);
    		System.out.println(T);
    		
      }
}