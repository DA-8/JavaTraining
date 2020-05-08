
public class Q21 {
	public static void main(String[] args) {
		char [][] blocks =new char [][] {{'a','b','c'},{'d','x','x'},{'e','f','x'}};
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.println("["+i+"]"+"["+j+"]"+blocks[i][j]);
			}
		}
	}
}
