import java.util.Arrays;

public class Q29 {
	
	public static void main(String[] args) {
			String[]os=new String[] {"m","l","w"};
			Arrays.sort(os);
			System.err.println(Arrays.binarySearch(os, "Red"));
			
	}
}
//-1