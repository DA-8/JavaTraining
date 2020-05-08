import java.util.Scanner;

import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardDownRightHandler;

public class Q01 {
	
		public static void main(String[] args) {
	        deger("Dido", 123, true);
	        double[] temp=new double[2];
	        entertemps(temp);
	        displaytemps(temp);
	        displaytemps1(temp);
	        displaytemps1(7.5,10.1);
	        displaytemps1();
	    }

	    public static void deger(Object... objects) {

	        for (Object s : objects) {

	            System.out.println(s.toString());

	        }
	    }
	    static void entertemps(double[] tempIn) {
	    	Scanner keyboard=new Scanner(System.in);
	    	
	    	for(int i=0;i<tempIn.length;i++) {
	    		System.out.println((i+1)+".temp value:");
	    		tempIn[i]=keyboard.nextDouble();
	    		
	    	}
	    }
	    static void displaytemps(double[] tempIn) {
	    		System.out.println();
	    		System.out.println("temp");
	    		System.out.println();
		    	for(int i=0;i<tempIn.length;i++) {
		    		System.out.println("day"+(i+1)+": "+tempIn[i]);
		    		
		    	}
	    		
	    	
	    }
	    static void displaytemps1(double...tempIn) {
    		System.out.println();
    		System.out.println("temp");
    		System.out.println();
	    	for(int i=0;i<tempIn.length;i++) {
	    		System.out.println("day"+(i+1)+": "+tempIn[i]);
	    		
	    	}
	    }
		
		
	
}


