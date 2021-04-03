package ro.ase.cts.factorymethod;

public class Mijlocas extends Jucator {
	
	public Mijlocas(String nume, int meciuri) {
		super(nume, meciuri);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Mijlocas []");
		builder.append(super.toString());
		return builder.toString();
	}
	
	

}
