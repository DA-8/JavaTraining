
public class Q01 {
//in switch case, the value of expression must be of type byte,char,short,or integer.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		int i=1;
		//double a=0.2; Cannot switch on a value of type double. Only convertible integer values, strings or enum variables are permitted
		char harf='d';
		String metin ="deneme";
		
		switch(i) {
		case 1:
			System.out.println("integer");
		}
//		switch(a) {
//		case 0.2:
//			System.out.println("double");
//		}
		switch(harf) {
		case 'd':
			System.out.println("char");
		}
		switch(metin) {
		case "deneme":
			System.out.println("string");
		}
		
		}
	}


