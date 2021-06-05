package ro.ase.cts.factorymethod.clase;

public class FactoryMedic implements AbstractFactory {

	@Override
	public PersonalSpital getPersonal(String nume, int varsta) {
		// TODO Auto-generated method stub
		return new Medic(nume, varsta);
	}

}
