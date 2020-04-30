
public class Q18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dayOfweek= 6;
		final int saturday=6;
		switch(dayOfweek) {
		default:
			System.out.println("Another Weekend");
			break;
		case saturday:
			System.out.println("weekend!");
		}
	}

}
//Output:
//	when we try long variable type of saturday: Type mismatch: cannot convert from long to int