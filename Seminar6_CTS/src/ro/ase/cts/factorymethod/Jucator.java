package ro.ase.cts.factorymethod;

public abstract class Jucator {
	private String nume;
	private int meciuriJucate;
	
	public Jucator(String nume, int meciuriJucate) {
		super();
		this.nume = nume;
		this.meciuriJucate = meciuriJucate;
	}
	
	public Jucator() {
		
	}
	

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public int getMeciuriJucate() {
		return meciuriJucate;
	}

	public void setMeciuriJucate(int meciuriJucate) {
		this.meciuriJucate = meciuriJucate;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Jucator [nume=");
		builder.append(nume);
		builder.append(", meciuriJucate=");
		builder.append(meciuriJucate);
		builder.append("]");
		return builder.toString();
	}
	
	

}
