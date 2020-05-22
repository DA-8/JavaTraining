
public class Q03 {
	private static int price = 5;
	public boolean sell() {
		if(price<10) {
			price++;
			return true;
		} else if(price>=10) {
			return false;
		}else {
			return false;
		}
		
	}
	public static void main(String[] cash) {
		new Q03().sell();
		new Q03().sell();
		new Q03().sell();
		System.out.print(price);
	}
	
}
//output: 8
