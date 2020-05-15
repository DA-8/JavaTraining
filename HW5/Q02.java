
public class Q02 {

	public static void main(String[] args) {
		for(int loop_index=0, doubled=0;loop_index<=10;loop_index++,doubled=2*loop_index) {
			System.out.println("Loop index: "+loop_index+"doubled equals: "+doubled);
		}
	}

} 
//Loop index: 0doubled equals: 0
//Loop index: 1doubled equals: 2
//Loop index: 2doubled equals: 4
//Loop index: 3doubled equals: 6
//Loop index: 4doubled equals: 8
//Loop index: 5doubled equals: 10
//Loop index: 6doubled equals: 12
//Loop index: 7doubled equals: 14
//Loop index: 8doubled equals: 16
//Loop index: 9doubled equals: 18
//Loop index: 10doubled equals: 20

