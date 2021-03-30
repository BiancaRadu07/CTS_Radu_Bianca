package ro.ase.cts.simplefactory;

public abstract class Jucator {
	private String numeJucator;
	private int varsta;
	
	public Jucator(String numeJucator, int varsta) {
		super();
		this.numeJucator = numeJucator;
		this.varsta = varsta;
	}

	public String getNumeJucator() {
		return numeJucator;
	}

	public int getVarsta() {
		return varsta;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Jucator [numeJucator=");
		builder.append(numeJucator);
		builder.append(", varsta=");
		builder.append(varsta);
		builder.append("]");
		return builder.toString();
	}
	
	
	

}
