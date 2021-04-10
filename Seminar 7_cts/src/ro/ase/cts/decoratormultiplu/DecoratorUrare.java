package ro.ase.cts.decoratormultiplu;

public class DecoratorUrare extends DecoratorAbstract {

	public DecoratorUrare(OperatorBilet bilet) {
		super(bilet);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void rezervaBilet() {
		super.rezervaBilet();
		System.out.println("Paste fericit si hai la meci!");
	}

}
