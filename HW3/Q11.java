
public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		if(a<5) {
			System.out.println(a);
		}else {
			System.out.println("a>=5");
		}
		
		if(a<5) {
			System.out.println(a);
		}//no need else.
		
		
		boolean b;
		if( b = a==9) {
			System.out.println("boolean de�er: "+b);
		}else {
			System.out.println("boolean else de�er: "+b);
		}
		
		if(b==false) System.out.println("yanl��");
	}

}
//output:
//a>=5
//boolean else de�er: false
//yanl��
