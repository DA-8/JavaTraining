import java.util.ArrayList;

public class Q06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				double array[]= {1,2,3,4,5,6,7,8,9,10};
				int sum=0;
				for(int loop_index=0;loop_index<array.length;loop_index++) {
					sum+=array[loop_index];
					if(sum<5)continue; //proceed next 
					
					if(sum>12)break; //skip loop
					System.out.println("Looping ...."+sum);
				}
				System.out.println("The sum exceeded the max value.");
		
	}

}
