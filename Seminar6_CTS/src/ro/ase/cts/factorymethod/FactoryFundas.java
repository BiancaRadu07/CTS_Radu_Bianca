package ro.ase.cts.factorymethod;

public class FactoryFundas implements AbstractFactory {

	@Override
	public Jucator getJucator(String nume, int meciuri) {
		return new Fundas(nume, meciuri);
	}
	

}
