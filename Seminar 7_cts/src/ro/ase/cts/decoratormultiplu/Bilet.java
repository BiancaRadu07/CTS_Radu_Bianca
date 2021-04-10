package ro.ase.cts.decoratormultiplu;

public class Bilet implements OperatorBilet {
	
	private String numeEchipaGazda;
	private String numeEchipaOaspeti;
	
	public Bilet() {
		super();
	}
	
	
	
	public Bilet(String numeEchipaGazda, String numeEchipaOaspeti) {
		super();
		this.numeEchipaGazda = numeEchipaGazda;
		this.numeEchipaOaspeti = numeEchipaOaspeti;
	}



	public void rezervaBilet() {
		System.out.println(numeEchipaGazda + " joaca impotriva "+numeEchipaOaspeti);
	}

	public String getNumeEchipaGazda() {
		return numeEchipaGazda;
	}

	public String getNumeEchipaOaspeti() {
		return numeEchipaOaspeti;
	}
	
	
}
