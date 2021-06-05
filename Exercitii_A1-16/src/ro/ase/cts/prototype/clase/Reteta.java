package ro.ase.cts.prototype.clase;

public class Reteta implements AbstractPrototype {

	private int cod;
	private String nume;
	
	
	
	public Reteta(int cod, String nume) {
		super();
		this.cod = cod;
		this.nume = nume;
	}
	
	//constr fara param privat
	private Reteta() {
		super();
	}


	public void setCod(int cod) {
		this.cod = cod;
	}
	
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Reteta [cod=");
		builder.append(cod);
		builder.append(", nume=");
		builder.append(nume);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public AbstractPrototype copiaza() {
		Reteta copie = new Reteta();
		copie.cod = this.cod;
		copie.nume = this.nume;
		return copie;
	}

}
