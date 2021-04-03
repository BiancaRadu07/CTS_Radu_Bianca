package ro.ase.cts.factorymethod;

public class FactoryAtacant implements AbstractFactory {

	@Override
	public Jucator getJucator(String nume, int meciuri) {
		return new Atacant(nume, meciuri);
	}
	

}
