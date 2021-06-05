package ro.ase.cts.simplefactory.clase;


public class Factory {
	public PersonalSpital getPersonal(TipPersonal tipPersonal, String nume, int varsta) {
		switch (tipPersonal) {
		case ASISTENT:
			return new Asistent(nume, varsta);
		case BRANCARDIER:
			return new Brancardier(nume, varsta);
		case MEDIC:
			return new Medic(nume, varsta);
		default:
			throw new IllegalArgumentException();
		}
	}

}
