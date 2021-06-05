package ro.ase.cts.builder.clase;


public class InternareBuilder implements AbstractBuilder {

	private Internare internare;
	
	
	
	public InternareBuilder() {
		internare = new Internare(0, false, false, false, false);
	}
	
	public InternareBuilder(int cod) {
		internare = new Internare(cod, false, false, false, false);
	}


	public InternareBuilder setCod(int cod) {
		internare.setCod(cod);
		return this;
	}



	public InternareBuilder setPatRabatabil(boolean patRabatabil) {
		internare.setPatRabatabil(patRabatabil);
		return this;
	}



	public InternareBuilder setMicDejun(boolean micDejun) {
		internare.setMicDejun(micDejun);
		return this;
	}



	public InternareBuilder setPapuciDeCamera(boolean papuciDeCamera) {
		internare.setPapuciDeCamera(papuciDeCamera);
		return this;
	}



	public InternareBuilder setHalat(boolean halat) {
		internare.setHalat(halat);
		return this;
	}


	@Override
	public Internare build() {
		
		return internare;
	}

}
