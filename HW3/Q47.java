
public class Q47 {

	public static void main(String[] args) {
		System.out.println((5+(~2 + 8)*3-3 %2 )/2);
		
	}

}
//Outputs: 
//	when ! operand used: 
//		Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//			The operator ! is undefined for the argument type(s) int
//
//			at Q47.main(Q47.java:5)

// Outputs:
//9
//~ operator is the bitwise unary Not operator, and ! is the logical unary Not operator. The ~ operator flips all the bits of numeric arguments, and the ! operator flips true values to false and false values to true.