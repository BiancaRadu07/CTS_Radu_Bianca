package ro.ase.cts.adapter.clase;

public class AdapterMedicament implements MedicamentFarmacie {

	private MedicamentSpital medSpital;
	
	

	public AdapterMedicament(MedicamentSpital medSpital) {
		super();
		this.medSpital = medSpital;
	}



	@Override
	public void cumparaMedicament() {
		medSpital.achizitioneazaMedicament();
	}
	
	
}
