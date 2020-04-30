
public class Q29 {
	// & verifies both of operands.
	//&& first verifies the first operand. if true, it verifies the other.
	public static void main(String[] args) {
		int a=0;
		
		if(a!=0 && 1/a>1) System.out.println("&&");
		// && verifies first operand. Anf if a=0, it doesn't verify 1/a. so there is no thread.
		if(a!=0 & 1/a>1) System.out.println("&");
		// & verifies 1/a>1 so it Exception in thread "main" java.lang.ArithmeticException: / by zero
	}
}
