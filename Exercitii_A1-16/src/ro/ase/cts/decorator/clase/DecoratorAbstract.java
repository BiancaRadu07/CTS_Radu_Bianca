package ro.ase.cts.decorator.clase;

public abstract class DecoratorAbstract implements RezultateAbstract {

	private RezultateAbstract rezAbs;
	
	
	
	public DecoratorAbstract(RezultateAbstract rezAbs) {
		super();
		this.rezAbs = rezAbs;
	}

	

	public RezultateAbstract getRezAbs() {
		return rezAbs;
	}




	@Override
	public void rezultateOnline() {
		rezAbs.rezultateOnline();
		
	}

}
