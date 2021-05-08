package ro.ase.cts.chainofresponsability.program;

import ro.ase.cts.chainofresponsability.Cont;
import ro.ase.cts.chainofresponsability.ContCredit;
import ro.ase.cts.chainofresponsability.ContCurent;
import ro.ase.cts.chainofresponsability.ContEconomii;

public class Main {

	public static void main(String[] args) {
		Cont contCurent=new ContCurent(200);
		Cont contEconomii=new ContEconomii(600);
		Cont contCredit=new ContCredit(700);
		
		contCurent.setCont(contEconomii);
		contEconomii.setCont(contCredit);
		
		contCurent.realizeazaPlata(160);
		contCurent.realizeazaPlata(330);
		contCurent.realizeazaPlata(500);
		contCurent.realizeazaPlata(500);

	}

}
