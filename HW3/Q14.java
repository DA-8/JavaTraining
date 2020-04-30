
public class Q14 {
	public static void main(String[] args) {
		boolean [] x= {true,true,false,false};
		boolean [] y= {true,false,true,false};
		String sonuc="";
		String sonuc1="";
		for(int i=0;i<=3;i++) {
			boolean var = x[i] && y[i];
			//boolean var = x[i] -- y[i]; invalid
			//boolean var = x[i] ++ y[i]; invalis
			boolean var1 = x[i] || y[i];
			sonuc=sonuc+" "+var;
			sonuc1=sonuc1+" "+var1;
		}
		System.out.println("and: "+sonuc);
		System.out.println("or: "+sonuc1);
	}
		
}

