package ro.ase.cts.factorymethod;

public class FactoryMijlocas implements AbstractFactory {

	@Override
	public Jucator getJucator(String nume, int meciuri) {
		// TODO Auto-generated method stub
		return new Mijlocas(nume, meciuri);
	}

}
