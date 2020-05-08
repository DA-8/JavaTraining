import java.util.*;

public class Q50 {
	
	public static void main(String[] flower) {
		flower= new String [] {"seed","rose"};
		Arrays.sort(flower);
		int result=Arrays.binarySearch(flower, flower[0]);
		System.out.println(result);
		
	}

}
