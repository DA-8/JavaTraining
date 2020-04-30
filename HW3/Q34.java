
public class Q34 {

	public static void main(String[] data) {
		// TODO Auto-generated method stub
			
			
				if(data.length>=1 && (data[0].contentEquals("sound")||data[0].contentEquals("logic"))&& data.length<2) {
					System.out.println(data[0]);
				}
			
				
	}

}
//Output: if we use & operator, the & operator try to verifying all operand. So the code not compile. "Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0"
