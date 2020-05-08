
public class Q48 {

	public static void main(String... foo) {
		myMethod( "a", "b", "c" );
		myMethod( new String[]{ "a", "b", "c" } );
		//myMethod();
		// compilation error!!!
		//mysecondMethod( "a", "b", "c" );

		// compilation error too!!!
		//mysecondMethod();

		// now, just this works
		mysecondMethod( new String[]{ "a", "b", "c" } );
	}
	
	public static void myMethod( String... foo ) {
	    // do something
	    // foo is an array (String[]) internally
	    System.out.println( foo[0] );
	}
	public static void mysecondMethod( String[] foo ) {
	    // do something
	    System.out.println( foo[0] );
	}


	


	

}
