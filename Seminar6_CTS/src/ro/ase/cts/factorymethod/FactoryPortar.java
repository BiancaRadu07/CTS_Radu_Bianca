package ro.ase.cts.factorymethod;

public class FactoryPortar implements AbstractFactory {

	@Override
	public Jucator getJucator(String nume, int meciuri) {
		return new Portar(nume, meciuri);
	}
	
	

}
