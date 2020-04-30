import java.util.ArrayList;



public class Q37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList x= new ArrayList();
		x.add(1);
		x.add(2);
		x.add(3);
		x.add(4);
		x.add(5);
		ArrayList y= new ArrayList();
		y.add(1);
		y.add(2);
		y.add(6);
		y.add(7);
		y.add(8);
		ArrayList z= new ArrayList();
		z.add(1);
		z.add(9);
		z.add(3);
		z.add(7);
		z.add(5);
		ArrayList set =new ArrayList ();
		
		for(int i=0;i<5;i++) {
		
			set.add(x.get(i).equals(y.get(i))?x.get(i):x.get(i));
			set.add(x.get(i).equals(y.get(i))?"":y.get(i));
		 
		}
		System.out.println(set);
		
	}

}
