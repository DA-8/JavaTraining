
public class Q42 {
	
	static int[][]game=new int[4][4];
	public static void main(String[] args) {
		game[3][3]=6;
		Object []obj=game;
		//game [3][3]="X";
		System.out.println(game[3][3]);
	}

}
