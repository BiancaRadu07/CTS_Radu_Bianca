package ro.ase.cts.state.clase;

public class Rezervata implements StareMasa {


	@Override
	public void modificaStare(Masa masa) {
		if(masa.getStare() instanceof Libera) {
			masa.setStare(this);
		}
	}
	

}
