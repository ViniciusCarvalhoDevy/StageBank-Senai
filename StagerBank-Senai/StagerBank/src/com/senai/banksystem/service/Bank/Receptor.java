package Bank;

public class Receptor {
	 	private String register;
	    private float bankBalance = 0;
	    private String keyPix;
	    
	    public Receptor() {
	    	this.bankBalance =100;
	    }
		public String getRegister_Recep() {
			return register;
		}
		public void setRegister_Recep(String register) {
			this.register = register;
		}
		public float getBank_Balance_Recep() {
			return bankBalance;
		}
		public void setBank_Balance_Recep(float bankBalance) {
			this.bankBalance += bankBalance;
		}
		public String getKey_Pix_Recep() {
			return keyPix;
		}
		public void setKey_Pix_Recep(String keyPix) {
			this.keyPix = keyPix;
		}
}
