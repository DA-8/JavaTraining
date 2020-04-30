
public class Q36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=5;
		int c=a^b;
		System.out.println(c);
		if((a<=5)^(b==5)) System.out.println("only one of them is true");
		if((a<=11)^(b==5)) System.out.println("both of them is true");
		if((a<=5)^(b!=5)) System.out.println("none of them is true");
		
		
	}

}
//output: ^operator(xor) is called exclusive Or returns 1 when one bit is 0 and the other is 1, and it returns 0 otherwise.
// ^operator is a boolean operator. It is calles bitwise logical operators
// false^false= false
//true^false=true
// true^true=false
