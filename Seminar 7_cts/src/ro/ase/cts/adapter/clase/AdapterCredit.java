package ro.ase.cts.adapter.clase;

public class AdapterCredit implements CreditAbstract {

	private Leasing leasing;
	
	public AdapterCredit(Leasing leasing) {
		this.leasing=leasing;
	}
	
	public void oferaCredit() {
		leasing.creeazaLeasing();
	}
	
}
