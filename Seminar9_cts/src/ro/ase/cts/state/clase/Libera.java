package ro.ase.cts.state.clase;

public class Libera implements StareMasa {

	@Override
	public void modificaStare(Masa masa) {
		if(!(masa.getStare() instanceof Libera)) {
			masa.setStare(this);
		}
	}

}
