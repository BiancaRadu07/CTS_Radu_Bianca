package ro.ase.cts.facade.clase;

public class Pacient {

	 private String nume;
	 private int gradSeveritate;
	 private int cod;
	 
	public Pacient(String nume, int gradSeveritate, int cod) {
		super();
		this.nume = nume;
		this.gradSeveritate = gradSeveritate;
		this.cod = cod;
	}

	public String getNume() {
		return nume;
	}

	public int getGradSeveritate() {
		return gradSeveritate;
	}

	public int getCod() {
		return cod;
	}
	 
	 
}
