public class Q01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=0; i<6; i++) {
		//System.out.println("d�nd�r: "+(i*2));
			if(i==3) {
				System.out.println("i=3 sonucu: "+i);
			}else if(i>5){
				System.out.println("i>5 sonucu "+i);
			}else if(i!=3){
				System.err.println("i!=3 sonucu "+i);
			}else {
				System.err.println("else "+i);
			}
			
		}
		
		int j=0; //initial de�er
		while (j<5) {
			int b=5*j+1;
			System.out.println(j+".de�erin sonucu "+b);
			j++;
		}
		int i=10;
		do {
		
			if(i>5) {
				System.out.println(i+".de�erler");
			}
			i++;
		} while(i<10);
		System.out.println("hello");
	}
		
	   
		
		
	
}


