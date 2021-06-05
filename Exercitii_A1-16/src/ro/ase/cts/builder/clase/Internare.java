package ro.ase.cts.builder.clase;

public class Internare {
	private int cod;
	private boolean patRabatabil;
	private boolean micDejun;
	private boolean papuciDeCamera;
	private boolean halat;
	
	public Internare(int cod, boolean patRabatabil, boolean micDejun, boolean papuciDeCamera, boolean halat) {
		super();
		this.cod = cod;
		this.patRabatabil = patRabatabil;
		this.micDejun = micDejun;
		this.papuciDeCamera = papuciDeCamera;
		this.halat = halat;
	}

	

	public void setCod(int cod) {
		this.cod = cod;
	}



	public void setPatRabatabil(boolean patRabatabil) {
		this.patRabatabil = patRabatabil;
	}



	public void setMicDejun(boolean micDejun) {
		this.micDejun = micDejun;
	}



	public void setPapuciDeCamera(boolean papuciDeCamera) {
		this.papuciDeCamera = papuciDeCamera;
	}



	public void setHalat(boolean halat) {
		this.halat = halat;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Internare [cod=");
		builder.append(cod);
		builder.append(", patRabatabil=");
		builder.append(patRabatabil);
		builder.append(", micDejun=");
		builder.append(micDejun);
		builder.append(", papuciDeCamera=");
		builder.append(papuciDeCamera);
		builder.append(", halat=");
		builder.append(halat);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
