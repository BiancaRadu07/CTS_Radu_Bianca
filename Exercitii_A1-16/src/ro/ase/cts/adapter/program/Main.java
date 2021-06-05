package ro.ase.cts.adapter.program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ro.ase.cts.adapter.clase.AdapterMedicament;

import ro.ase.cts.adapter.clase.MedicamentFarmacie;
import ro.ase.cts.adapter.clase.MedicamentSpital;

public class Main {
	
	public static void creeazaReteta(MedicamentFarmacie med) {
		med.cumparaMedicament();
	}

	public static void main(String[] args) {
		
		List<String> reteta= new ArrayList<>(Arrays.asList("Aspirina","Nospa"));
		
		MedicamentSpital medS = new MedicamentSpital("Paracetamool", 1000, reteta, true);
		
		AdapterMedicament adapter = new AdapterMedicament(medS);
		creeazaReteta(adapter);

	}

}
