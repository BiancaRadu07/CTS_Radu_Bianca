package ro.ase.cts.factorymethod.clase;

public class Medic extends PersonalSpital {

	public Medic(String nume, int varsta) {
		super(nume, varsta);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Medic []");
		builder.append(super.toString());
		return builder.toString();
	}

}
