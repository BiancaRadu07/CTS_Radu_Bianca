package ro.ase.cts.simplefactory.program;


import ro.ase.cts.simplefactory.clase.Factory;
import ro.ase.cts.simplefactory.clase.PersonalSpital;
import ro.ase.cts.simplefactory.clase.TipPersonal;

public class Main {

	public static void main(String[] args) {
		Factory factory = new Factory();
		PersonalSpital asistent = factory.getPersonal(TipPersonal.ASISTENT, "Bianca", 21);
		PersonalSpital medic = factory.getPersonal(TipPersonal.MEDIC, "Ana", 22);

		System.out.println(asistent.toString());
		System.out.println(medic.toString());
	}

}
