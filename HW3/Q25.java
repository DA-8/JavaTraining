
public class Q25 {
	public static String travel(int distance) {
		return distance<1000 ? "train" : "10";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(travel(500));
	}

}
//Output: Type mismatch: cannot convert from int to String