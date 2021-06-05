package ro.ase.cts.factorymethod.clase;

public class FactoryFemeieDeServiciu implements AbstractFactory {

	@Override
	public PersonalSpital getPersonal(String nume, int varsta) {
		// TODO Auto-generated method stub
		return new FemeieServiciu(nume, varsta);
	}
	

}
