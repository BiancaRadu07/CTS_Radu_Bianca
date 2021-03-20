package ro.ase.cts.singleton.romb;

import ro.ase.cts.singletone.lazy.AsigurareMedicala;

public class Romb {
	private int id;
	private float arie;
	private String culoare;
	
	private static Romb romb = null;
	
	private Romb(int id, float arie, String culoare) {
		super();
		this.id = id;
		this.arie = arie;
		this.culoare = culoare;
	}
	
	public static synchronized Romb getInstance(int id, float arie, String culoare) {
		if(romb==null) {
			romb=new Romb(id,arie,culoare);
		}
		return romb;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getArie() {
		return arie;
	}

	public void setArie(float arie) {
		this.arie = arie;
	}

	public String getCuloare() {
		return culoare;
	}

	public void setCuloare(String culoare) {
		this.culoare = culoare;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Romb [id=");
		builder.append(id);
		builder.append(", arie=");
		builder.append(arie);
		builder.append(", culoare=");
		builder.append(culoare);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	

}
