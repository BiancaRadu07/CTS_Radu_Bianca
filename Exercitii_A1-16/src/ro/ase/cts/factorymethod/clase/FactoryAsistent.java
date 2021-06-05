package ro.ase.cts.factorymethod.clase;

public class FactoryAsistent implements AbstractFactory {

	@Override
	public PersonalSpital getPersonal(String nume, int varsta) {
		// TODO Auto-generated method stub
		return new Asistent(nume, varsta);
	}

}
