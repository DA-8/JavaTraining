
public class Q28 {
	static int[][] game =new int [6][6];
	public static void main(String[] args) {
		game[3][3]=6;
		Object[] obj=game;
		//obj[3]= "x";//Exception in thread "main" java.lang.ArrayStoreException: java.lang.String
		System.out.println(game[3][3]);
	}

}
