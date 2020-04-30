import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner giris=new Scanner(System.in);
		System.out.println("i deðeri için Lütfen 1 ile 4 arasý bir sayý giriniz: ");
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
				System.out.println("Yanlýþ deðer girdiniz");
		}
		System.out.println("j deðeri için Lütfen 1 ile 4 arasý bir sayý giriniz: ");
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
//i deðeri için Lütfen 1 ile 4 arasý bir sayý giriniz: 
//5
//Yanlýþ deðer girdiniz
//j deðeri için Lütfen 1 ile 4 arasý bir sayý giriniz: 
//5
