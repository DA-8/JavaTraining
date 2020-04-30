
public class Q28 {

	public static void main(String[] in) {
		// TODO Auto-generated method stub
		int intersection =100;
		int streets=200;
		if(intersection<150) {
			System.out.println("1");
		}else if(streets>1000 && intersection > 1000){
			System.out.println("2");
		}if(streets<500) {
			System.out.println("1");
		}else {
			System.out.println("2");
		}
	}

}
//output:1 1
//elseif(streets&&intersection>1000) is false. 
//condition1 && condition 2