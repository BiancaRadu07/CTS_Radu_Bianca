package ro.ase.cts.simplefactory.clase;

public class Asistent extends PersonalSpital {

	public Asistent(String numePersonal, int varsta) {
		super(numePersonal, varsta);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Asistent []");
		builder.append(super.toString());
		return builder.toString();
	}

	
}
