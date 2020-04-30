
public class Q08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int toplam=0;
		for(int b=1;b<7;b++) {
			int a=b <=5 ? 3 : 0;
			System.out.println(b+". a deðeri: "+a);
			toplam=toplam+a;
		}
		boolean d = true == false ? false : true;
		String metin = "true" == "false" ? "false" : "true";		
		double sayi=0.1 <=2 ? 3 : 2;
		System.out.println("int toplam deðeri: "+ toplam);
		System.out.println("booelan d deðeri: "+d);
		System.out.println("String metin deðeri: "+metin);
		System.out.println("double sayi deðeri: "+sayi);
	}

}
//ternary expression 
// value=condition ? value1 : value2
// no need parenthesis.
// ternary expression acts much like an if-else statement.a condition and two values.
//outputs
//	1. a deðeri: 3
//	2. a deðeri: 3
//	3. a deðeri: 3
//	4. a deðeri: 3
//	5. a deðeri: 3
//	6. a deðeri: 0
//	int toplam deðeri: 15
//	booelan d deðeri: true
//	String metin deðeri: true
//	double sayi deðeri: 3.0