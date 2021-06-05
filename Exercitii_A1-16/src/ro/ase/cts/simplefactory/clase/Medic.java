package ro.ase.cts.simplefactory.clase;

public class Medic extends PersonalSpital {

	public Medic(String numePersonal, int varsta) {
		super(numePersonal, varsta);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Medic []");
		builder.append(super.toString());
		return builder.toString();
	}

	
}
