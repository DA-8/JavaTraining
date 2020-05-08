import java.util.ArrayList;
import java.util.Arrays;

public class Q09 {
	public static void main(String... args) {
		int[] key=new int[10];
		String deger="";
		String deger1="";
		for(int i=0;i<10;i++) {
			key[i]=10-i;
			deger=deger+""+key[i];
		}
		System.out.println(deger);
		int a= 1;
		System.out.println(Arrays.binarySearch(key,a));
		Arrays.sort(key);
		
		for(int i=0;i<10;i++) {
			deger1=deger1+""+key[i];
		}
		System.out.println(deger1);
		
	}

}
