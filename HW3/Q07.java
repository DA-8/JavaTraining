import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner giris=new Scanner(System.in);
		System.out.println("i de�eri i�in L�tfen 1 ile 4 aras� bir say� giriniz: ");
		int i=giris.nextInt();
		switch(i){
			case 1:
				System.out.println("i sonu�:1");
				break;
			case 2:
				System.out.println("i sonu�: 2");
				break;
			case 3:
				System.out.println("i sonu�: 3");
				break;
			case 4:
				System.out.println("i sonu�: 4");
				break;
			default:
				System.out.println("i sonu�: Yanl�� de�er girdiniz");
		}
		System.out.println("j de�eri i�in L�tfen 1 ile 4 aras� bir say� giriniz: ");
		
		int j=giris.nextInt();
		
		switch(j){
			case 1:
				System.out.println("j sonu�: 1");
				
			case 2:
				System.out.println("j sonu�: 2");
				
			case 3:
				System.out.println("j sonu�: 3");
				
			case 4:
				System.out.println("j sonu�: 4");
				
			default:
				System.out.println("j sonu�: Yanl�� de�er girdiniz");
		}
	}

}
//Output: 
//i de�eri i�in L�tfen 1 ile 4 aras� bir say� giriniz: 
//3
//i sonu�: 3
//j de�eri i�in L�tfen 1 ile 4 aras� bir say� giriniz: 
//3
//j sonu�: 3
//j sonu�: 4
//j sonu�: Yanl�� de�er girdiniz