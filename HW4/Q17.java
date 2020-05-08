import java.util.Arrays;

public class Q17 {

	public static void main(String[] args) {
		String[]os=new String[] {"m","l","w"};
		Arrays.sort(os);
		System.out.println(Arrays.binarySearch(os, "m"));
	}

}
