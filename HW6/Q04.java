import java.util.ArrayList;

public class Q04 {
	public void nested() { 
		nested(2,true); 
		} // g1
	
	public int nested(int level, boolean height) { 
		return nested(level); 
		}
	
	public int nested(int level) { 
		return level+1; 
		}; // g2
	
	public static void main(String[] outOfTheBox) {
		System.out.print(new Q04().nested(2,true)); 
		//System.out.print(new Q04().nested()); void not return any value.
	}
}
