package ro.ase.cts.state.clase;

public class Masa {
	
	private int nrPersoane;
	private int id;
	private StareMasa stare;
	
	public Masa(int nrPersoane, int id) {
		super();
		this.nrPersoane = nrPersoane;
		this.id = id;
		this.stare = new Libera();
	}

	public StareMasa getStare() {
		return stare;
	}

	void setStare(StareMasa stare) {
		this.stare = stare;
	}
	
	public void ocupaMasa(String nume) {
		if(this.stare instanceof Rezervata) {
			System.out.println(nume+" a ocupat masa "+this.id);
			this.setStare(new Ocupata());
		} else {
			System.out.println("Nu poate fi ocupata");
		}
	}
	
	public void rezervaMasa(String nume) {
		if(this.stare instanceof Libera) {
			System.out.println(nume+" a rezervat masa "+this.id);
			this.setStare(new Rezervata());
		} else {
			System.out.println("Nu poate fi rezervata");
		}
	}
	
	public void elibereazaMasa(String nume) {
		if(!(this.stare instanceof Libera)) {
			System.out.println(nume+" a eliberat masa "+this.id);
			this.setStare(new Libera());
		} else {
			System.out.println("Masa e libera");
		}
	}
}
