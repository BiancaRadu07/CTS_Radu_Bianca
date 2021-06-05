package ro.ase.cts.adapter.clase;

import java.util.List;

public class MedicamentSpital {
	
	private String denumire;
	private float suma;
	public List<String> reteta;
	public boolean areReteta=false;
	
	
	
	public MedicamentSpital(String denumire, float suma, List<String> reteta, boolean areReteta) {
		super();
		this.denumire = denumire;
		this.suma = suma;
		this.reteta = reteta;
		this.areReteta = areReteta;
	}

	public boolean prezintaReteta() {
		if(reteta.contains(denumire)){
            areReteta=true;
        }
        return areReteta;
	}
	
	public void achizitioneazaMedicament() {
		if(areReteta)
        {
            System.out.println("S-a achizitionat medicamentul "+denumire+" pe baza de reteta");
        }
        else
            System.out.println("Medicamentul  "+denumire+" nu se afla pe reteta si nu poate fi cumparat!");
	}
	
	

}
