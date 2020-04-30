
public class Q06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long thatNumber =5 >=5 ? 2+1: 1*1;
		if(++thatNumber<4) {
			thatNumber +=1;
			System.out.println("before ++ : "+thatNumber);
		}else {System.out.println("else: before ++ : "+thatNumber);}
		if(thatNumber++ < 4){
			thatNumber +=1;
			System.out.println("after ++ :" +thatNumber);
		}else {System.out.println("else: after ++ : "+thatNumber);}
		
	}

}
