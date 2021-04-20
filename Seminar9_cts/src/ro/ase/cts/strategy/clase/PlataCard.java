package ro.ase.cts.strategy.clase;

public class PlataCard implements ModPlata {

	@Override
	public void plateste(int suma) {
		System.out.println("A fost platit cu cardul suma de "+suma);
		
	}

}
