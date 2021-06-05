package ro.ase.cts.factorymethod.clase;

public class FactoryBrancardier implements AbstractFactory {

	@Override
	public PersonalSpital getPersonal(String nume, int varsta) {
		// TODO Auto-generated method stub
		return new Brancardier(nume, varsta);
	}

}
