package ro.ase.cts.factorymethod.clase;

public class Asistent extends PersonalSpital {

	public Asistent(String nume, int varsta) {
		super(nume, varsta);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Asistent []");
		builder.append(super.toString());
		return builder.toString();
	}

	
}
