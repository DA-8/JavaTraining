import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner giris=new Scanner(System.in);
		System.out.println("i deðeri için Lütfen 1 ile 4 arasý bir sayý giriniz: ");
		int i=giris.nextInt();
		switch(i){
			case 1:
				System.out.println("i sonuç:1");
				break;
			case 2:
				System.out.println("i sonuç: 2");
				break;
			case 3:
				System.out.println("i sonuç: 3");
				break;
			case 4:
				System.out.println("i sonuç: 4");
				break;
			default:
				System.out.println("i sonuç: Yanlýþ deðer girdiniz");
		}
		System.out.println("j deðeri için Lütfen 1 ile 4 arasý bir sayý giriniz: ");
		
		int j=giris.nextInt();
		
		switch(j){
			case 1:
				System.out.println("j sonuç: 1");
				
			case 2:
				System.out.println("j sonuç: 2");
				
			case 3:
				System.out.println("j sonuç: 3");
				
			case 4:
				System.out.println("j sonuç: 4");
				
			default:
				System.out.println("j sonuç: Yanlýþ deðer girdiniz");
		}
	}

}
//Output: 
//i deðeri için Lütfen 1 ile 4 arasý bir sayý giriniz: 
//3
//i sonuç: 3
//j deðeri için Lütfen 1 ile 4 arasý bir sayý giriniz: 
//3
//j sonuç: 3
//j sonuç: 4
//j sonuç: Yanlýþ deðer girdiniz