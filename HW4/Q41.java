import java.util.Arrays;

public class Q41 {
	
	public static void main(String[] args) {
		String[] os=new String[] {"m","l","w"};
		System.out.println("s�ralamadan �nce:"+Arrays.binarySearch(os, "l"));
		Arrays.sort(os);
		System.out.println("s�ralamadan sonra: "+Arrays.binarySearch(os, "l"));
	}

}
