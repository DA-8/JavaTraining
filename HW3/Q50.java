
public class Q50 {
	public static String play(int toy, int age) {
		final String game;
		if(toy<2) game = (age > 1) ? "1" : "10"; //p1
		else game= age >3 ? "Ball":"Swim"; //p2
		return game;
	}
	public static void main(String[] variables) {
		// TODO Auto-generated method stub
		System.out.println(play(5,2));
	}

}
//Output:
//	Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//		Type mismatch: cannot convert from int to String