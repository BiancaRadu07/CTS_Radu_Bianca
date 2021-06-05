package ro.ase.cts.factorymethod.program;

import ro.ase.cts.factorymethod.clase.AbstractFactory;
import ro.ase.cts.factorymethod.clase.FactoryAsistent;
import ro.ase.cts.factorymethod.clase.FactoryBrancardier;
import ro.ase.cts.factorymethod.clase.FactoryFemeieDeServiciu;
import ro.ase.cts.factorymethod.clase.FactoryMedic;
import ro.ase.cts.factorymethod.clase.PersonalSpital;

public class Main {
	
	//simulam un client
	private static void afisareInformatiiPersonal(AbstractFactory abstractFactory, String nume, int varsta) {
		PersonalSpital personal = abstractFactory.getPersonal(nume, varsta); //ne creem jucatorul prin intermediul fabricii
		System.out.println(personal.toString());
	}

	public static void main(String[] args) {
		afisareInformatiiPersonal(new FactoryAsistent(), "Bianca", 10);
		afisareInformatiiPersonal(new FactoryBrancardier(), "Mihai", 7);
		afisareInformatiiPersonal(new FactoryMedic(), "Andrei", 5);
		afisareInformatiiPersonal(new FactoryFemeieDeServiciu(), "Ana", 11);

	}

}
