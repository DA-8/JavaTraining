
public class Q46 {

	public static void main(String[] weather) {
		System.out.println(weather[0]!=null && weather[0].equals("sunny") && !false ? "Go inside": "stay inside");

	}

}
//Output: Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0
//at Q46.main(Q46.java:5)
