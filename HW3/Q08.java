
public class Q08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int toplam=0;
		for(int b=1;b<7;b++) {
			int a=b <=5 ? 3 : 0;
			System.out.println(b+". a de�eri: "+a);
			toplam=toplam+a;
		}
		boolean d = true == false ? false : true;
		String metin = "true" == "false" ? "false" : "true";		
		double sayi=0.1 <=2 ? 3 : 2;
		System.out.println("int toplam de�eri: "+ toplam);
		System.out.println("booelan d de�eri: "+d);
		System.out.println("String metin de�eri: "+metin);
		System.out.println("double sayi de�eri: "+sayi);
	}

}
//ternary expression 
// value=condition ? value1 : value2
// no need parenthesis.
// ternary expression acts much like an if-else statement.a condition and two values.
//outputs
//	1. a de�eri: 3
//	2. a de�eri: 3
//	3. a de�eri: 3
//	4. a de�eri: 3
//	5. a de�eri: 3
//	6. a de�eri: 0
//	int toplam de�eri: 15
//	booelan d de�eri: true
//	String metin de�eri: true
//	double sayi de�eri: 3.0