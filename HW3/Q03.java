
public class Q03 {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String john="john";
		String jon=new String(john);
		StringBuffer jo= new StringBuffer("john");
		StringBuilder j=new StringBuilder("john");
		System.out.println("String-String:== "+ (john==jon)+" "+"String-String: contentEquals "+(john.contentEquals(jon))+" "+"String-String: equals "+(john.equals(jon))); //false, true, true
		System.out.println("String-StringBuffer: contentEqual: "+john.contentEquals(jo)); //true
		System.out.println("String-StringBuffer: equal: "+john.equals(jo)); //false
		System.out.println("String-StringBuilder: contentEqual: "+john.contentEquals(j)); //false
		System.out.println("String-StringBuilder: equal: "+john.equals(j)); //false
		System.out.println("StringBuffer-StringBuilder: contentEqual: "+john.contentEquals(jo)); //false
		System.out.println("StringBuffer-StringBuilder: equal: "+john.equals(jo)); //false
	}

}
//The equals() method is to compare the contents of two Strings are same 
//whereas contentEquals method is to compare String with StringBuffer or StringBuilder.
//Output:
//String-String:== false String-String: contentEquals true String-String: equals true
//String-StringBuffer: contentEqual: true
//String-StringBuffer: equal: false
//String-StringBuilder: contentEqual: true
//String-StringBuilder: equal: false
//StringBuffer-StringBuilder: contentEqual: true
//StringBuffer-StringBuilder: equal: false
