import java.util.ArrayList;

public class Q06 {

	public static void main(String[] args) {
		int[] num= {1,2,3,4,5,6}; //static array
		System.out.println(num.length);
		
		ArrayList<Integer> list=new ArrayList(); //dynamic array
		for(int i=0;i<num.length;i++) {
			list.add(i);
		}
		System.out.println(list.size());
		
	}

}
