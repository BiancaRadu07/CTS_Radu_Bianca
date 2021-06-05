package ro.ase.cts.simplefactory.clase;

public class Brancardier extends PersonalSpital {

	public Brancardier(String numePersonal, int varsta) {
		super(numePersonal, varsta);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Brancardier []");
		builder.append(super.toString());
		return builder.toString();
	}

	
}
