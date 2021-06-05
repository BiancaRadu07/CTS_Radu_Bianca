package ro.ase.cts.simplefactory.clase;

public abstract class PersonalSpital {
	
	private String numePersonal;
	private int varsta;
	
	public PersonalSpital(String numePersonal, int varsta) {
		super();
		this.numePersonal = numePersonal;
		this.varsta = varsta;
	}

	public String getNumePersonal() {
		return numePersonal;
	}

	public int getVarsta() {
		return varsta;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PersonalSpital [numePersonal=");
		builder.append(numePersonal);
		builder.append(", varsta=");
		builder.append(varsta);
		builder.append("]");
		return builder.toString();
	}
	
	

}
