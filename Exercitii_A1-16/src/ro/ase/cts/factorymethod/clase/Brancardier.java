package ro.ase.cts.factorymethod.clase;

public class Brancardier extends PersonalSpital {

	public Brancardier(String nume, int varsta) {
		super(nume, varsta);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Brancardier []");
		builder.append(super.toString());
		return builder.toString();
	}

}
