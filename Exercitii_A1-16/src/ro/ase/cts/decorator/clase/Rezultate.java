package ro.ase.cts.decorator.clase;

public class Rezultate implements RezultateAbstract {

	private int cod;
	private String nume;
	
	
	
	public Rezultate(int cod, String nume) {
		super();
		this.cod = cod;
		this.nume = nume;
	}

	

	public int getCod() {
		return cod;
	}



	public String getNume() {
		return nume;
	}



	@Override
	public void rezultateOnline() {
		System.out.println("Rezultatul cu codul "+this.cod+" a fost trimis");
		
	}

}
