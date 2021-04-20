package ro.ase.cts.state.program;

import ro.ase.cts.state.clase.Libera;
import ro.ase.cts.state.clase.Masa;
import ro.ase.cts.state.clase.Ocupata;
import ro.ase.cts.state.clase.Rezervata;

public class Main {

	public static void main(String[] args) {
		Masa masa=new Masa(4,7);
		masa.rezervaMasa("Bianca");
		masa.rezervaMasa("Ana");
		masa.ocupaMasa("Alexandra");
		masa.elibereazaMasa("Flori");
		masa.elibereazaMasa("Cristina");
		
		Masa masa2=new Masa(3, 10);
		Libera libera=new Libera();
		Rezervata rezervata=new Rezervata();
		Ocupata ocupata=new Ocupata();
		
		libera.modificaStare(masa2);
		rezervata.modificaStare(masa2);
		ocupata.modificaStare(masa2);

	}

}
