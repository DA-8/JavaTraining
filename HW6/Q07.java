

public class Q07 {

	 String home;

	public Q07(String home1){
		this.home = home1;
	}
	public String adressbul() {
		String adresi=home;
		return adresi;
	}
	public static void main(String...args) {
		Q07_ yeni=new Q07_("ev", "mahalle");
		System.out.println(yeni.adressbul());
		Q07 eski=new Q07("hane");
		System.out.println(eski.adressbul());
	}

}
