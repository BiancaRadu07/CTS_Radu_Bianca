package ro.ase.cts.factorymethod.clase;

public abstract class PersonalSpital {
	
	private String nume;
	private int varsta;
	
	public PersonalSpital(String nume, int varsta) {
		super();
		this.nume = nume;
		this.varsta = varsta;
	}
	
	public PersonalSpital() {
		
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PersonalSpital [nume=");
		builder.append(nume);
		builder.append(", varsta=");
		builder.append(varsta);
		builder.append("]");
		return builder.toString();
	}
	
	

}
