package ro.ase.cts.proxy;

public class ProxyRezervare implements OperatorRezervari {

	private OperatorRezervare operatorRezervare;
	private int nrMinimDePersoane;
	
	
	
	public ProxyRezervare(OperatorRezervare operatorRezervare, int nrMinimDePersoane) {
		super();
		this.operatorRezervare = operatorRezervare;
		this.nrMinimDePersoane = nrMinimDePersoane;
	}



	@Override
	public void rezerva(int numarPersoane) {
		if(numarPersoane >= nrMinimDePersoane) {
			operatorRezervare.rezerva(numarPersoane);
		}else {
			System.out.println("Numarul de persoane este prea mic.");
		}
		
	}

}
