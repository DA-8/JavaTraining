import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner giris=new Scanner(System.in);
		System.out.println("i de�eri i�in L�tfen 1 ile 4 aras� bir say� giriniz: ");
		int i=giris.nextInt();
		switch(i){
			case 1:
				System.out.println("1");
				break;
			case 2:
				System.out.println("2");
				break;
			case 3:
				System.out.println("3");
				break;
			case 4:
				System.out.println("4");
				break;
			default:
				System.out.println("Yanl�� de�er girdiniz");
		}
		System.out.println("j de�eri i�in L�tfen 1 ile 4 aras� bir say� giriniz: ");
		int j=giris.nextInt();
		switch(j){
		case 1:
			System.out.println("1");
		case 2:
			System.out.println("2");
		case 3:
			System.out.println("3");
		case 4:
			System.out.println("4");

	}
	}

}
//output: 
//i de�eri i�in L�tfen 1 ile 4 aras� bir say� giriniz: 
//5
//Yanl�� de�er girdiniz
//j de�eri i�in L�tfen 1 ile 4 aras� bir say� giriniz: 
//5
