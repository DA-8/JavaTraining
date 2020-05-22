
public class Q02 {
	
		private String isim;
		private String soyisim;
		private String email;
		private int dogumyili;
		private double boy;
		private double kilo;
		
		
		public String getIsim() {
			return isim;
		}
		public void setIsim(String isim) {
			this.isim = isim;
		}
		public String getSoyisim() {
			return soyisim;
		}
		public void setSoyisim(String soyisim) {
			this.soyisim = soyisim;
		}
		public String getEmail() {
			
			return email;
		}
		public void setEmail(String email) {
			if(email.contains("@")){
				this.email = email;
			}
			else {
				this.email="yanlýs deger";
			}
			
		}
		public int getDogumyili() {
			return dogumyili;
		}
		public void setDogumyili(int dogumyili) {
			this.dogumyili = dogumyili;
		}
		public double getBoy() {
			return boy;
		}
		public void setBoy(double boy) {
			this.boy = boy;
		}
		public double getKilo() {
			return kilo;
		}
		public void setKilo(double kilo) {
			this.kilo = kilo;
		}
		
	

} 


