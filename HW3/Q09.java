
public class Q09 {
	public void calculateResult(Integer A,Integer B) {
		boolean process = A==null || A.intValue()<10;
		boolean value = A==null&& B>=200; 
		//boolean value= A&&B in not compile.
		System.out.println(process+" "+value);
		
		
	}
	public static void main(String[] unused) {
		// TODO Auto-generated method stub
		new Q09().calculateResult(null, 203);
		
	}

}
