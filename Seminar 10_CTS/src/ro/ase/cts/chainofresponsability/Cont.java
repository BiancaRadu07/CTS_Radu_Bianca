package ro.ase.cts.chainofresponsability;

public abstract class Cont {
	private Cont cont;
	private float sold;
	
	public Cont(float sold) {
		super();
		this.sold = sold;
		this.cont=null;
	}

	public void setCont(Cont cont) {
		this.cont = cont;
	}
	
	public void setSold(float sold) {
		this.sold = sold;
	}
	
	public Cont getCont() {
		return cont;
	}
	
	public float getSold() {
		return sold;
	}
	
	public abstract void realizeazaPlata(float suma);
}
